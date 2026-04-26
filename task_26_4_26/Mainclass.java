package task_26_4_26;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Mainclass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		Map<String, SmartDevice> devices = new HashMap<>();
		LightBulb light = new LightBulb();
		Fan fan = new Fan();

		devices.put("light", light);
		devices.put("lights", light);

		devices.put("fan", fan);
		devices.put("fans", fan);
		boolean flag = false;
		while(true) {
		System.out.println("How can i help you : ");
		String command = sc.nextLine().toLowerCase();
		String[] str1 = command.split("\\s+");
		for(String str: str1) {
			if(devices.containsKey(str)) {
				SmartDevice device = devices.get(str);
					device.performAction(command);
					flag = true;
					break;
			}
		}
		if(!flag) {
			System.out.println("instruction unclear");
		}
	}	//to decide which object to pass on basis of command
}
}