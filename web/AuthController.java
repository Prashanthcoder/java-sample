
package com.controller;

import dao.UserDAO;
import dto.User;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AuthController {

    UserDAO userDAO = new UserDAO();

    // ─────────────────────────────────────────
    // LOGIN
    // ─────────────────────────────────────────

    @GetMapping("/login")
    public String showLogin() {
        return "login.jsp";
    }

    @PostMapping("/login")
    public String processLogin(
            @RequestParam("username") String username,
            @RequestParam("password") String password,
            HttpSession session,
            Model model) {

        User user = userDAO.findByUsername(username);

        if (user != null && user.getPassword().equals(password)) {
            session.setAttribute("loggedInUser", user.getUsername());
            session.setAttribute("loggedInName",  user.getFullName());
            return "redirect:/";
        }

        model.addAttribute("loginError", "Invalid username or password. Please try again.");
        return "login.jsp";
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/login";
    }

    // ─────────────────────────────────────────
    // REGISTER
    // ─────────────────────────────────────────

    @GetMapping("/register")
    public String showRegister() {
        return "register.jsp";
    }

    @PostMapping("/register")
    public String processRegister(
            @RequestParam("fullName")         String fullName,
            @RequestParam("email")            String email,
            @RequestParam("username")         String username,
            @RequestParam("password")         String password,
            @RequestParam("confirmPassword")  String confirmPassword,
            Model model) {

        // Passwords must match
        if (!password.equals(confirmPassword)) {
            model.addAttribute("registerError", "Passwords do not match.");
            model.addAttribute("fullName", fullName);
            model.addAttribute("email",    email);
            model.addAttribute("username", username);
            return "register.jsp";
        }

        // Username taken?
        if (userDAO.usernameExists(username)) {
            model.addAttribute("registerError", "Username '" + username + "' is already taken.");
            model.addAttribute("fullName", fullName);
            model.addAttribute("email",    email);
            return "register.jsp";
        }

        // Email taken?
        if (userDAO.emailExists(email)) {
            model.addAttribute("registerError", "An account with that email already exists.");
            model.addAttribute("fullName", fullName);
            model.addAttribute("username", username);
            return "register.jsp";
        }

        // All good — save user
        User user = new User();
        user.setFullName(fullName);
        user.setEmail(email);
        user.setUsername(username);
        user.setPassword(password);   // hash this with BCrypt when ready for production
        userDAO.saveUser(user);

        // Redirect to login with a success message
        model.addAttribute("successMessage", "Account created! You can now sign in.");
        return "login.jsp";
    }
}
