package classtask_2805;

public class RockPaperScissors {
	public static void game(String str) {
		if(str.equals("rock")) {
			System.out.println("paper");
		}else if(str.equals("scissors")) {
			System.out.println("rock");
		}else if(str.equals("paper")){
			System.out.println("scissors");
		}
		
	}
	
	public static void main(String[] args) {
		game("paper");
		game("rock");
		game("scissors");
	}
}
