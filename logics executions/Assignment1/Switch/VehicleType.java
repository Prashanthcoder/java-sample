public class VehicleType {
    public static void main(String[] args) {
        int wheels = 4;

        switch (wheels) {
            case 1:
                System.out.println("Unicycle");
                break;
            case 2:
                System.out.println("Bicycle or Motorcycle");
                break;
            case 3:
                System.out.println("Tricycle or Auto Rickshaw");
                break;
            case 4:
                System.out.println("Car");
                break;
            case 6:
                System.out.println("Bus or Truck");
                break;
            default:
                System.out.println("Unknown vehicle type");
        }
    }
}
