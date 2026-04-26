package task_26_4_26;

public class Fan implements SmartDevice{
	public void performAction(String command) {
		String[] findOnOff = command.split(" ");
		String cmd = CommandParser.ExtractOnOff(findOnOff);
		if(cmd.equals("on")) {
			System.out.println("Turning on the fan");
		}else if(cmd.equals("off")){
			System.out.println("Turning off the fan");
		}else {
			System.out.println(cmd);
		}
	}
}
