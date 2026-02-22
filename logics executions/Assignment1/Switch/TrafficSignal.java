public class TrafficSignal {
    public static void main(String[] args) {
        String color = "RED"; 

        switch (color.toUpperCase()) {
            case "RED":
                System.out.println("Stop");
                break;
            case "YELLOW":
                System.out.println("Slow down or Prepare to Stop");
                break;
            case "GREEN":
                System.out.println("Go");
                break;
            default:
                System.out.println("Invalid color");
        }
    }
}
