package task_26_4_26;

public class LightBulb implements SmartDevice{
	public void performAction(String command) {
		String[] findOnOff = command.split(" ");
		String cmd = CommandParser.ExtractOnOff(findOnOff);
		if(cmd.equals("on")) {
			System.out.println("Light on successfull");
		}else if(cmd.equals("off")){
			System.out.println("Light off successfull");
		}else {
			System.out.println(cmd);
		}
	}
}
