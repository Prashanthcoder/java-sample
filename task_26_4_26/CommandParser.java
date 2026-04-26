package task_26_4_26;

public class CommandParser {
	public static String ExtractOnOff(String[] str) {
		for(String s: str) {
			if(s.equals("on")) {
				return "on";
			}else if(s.equals("off")){
				return "off";
			}
		}
		return "instruction unclear";
	}
}
