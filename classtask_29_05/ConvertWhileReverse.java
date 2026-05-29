package classtask_29_05;

public class ConvertWhileReverse {
	public static String reverse(String str) {
		if(str.isEmpty()) return "";
		char[] ch = str.toCharArray();
		char res=' ';
		String result = "";
		for(int i = ch.length-1;i>=0;i--) {
			if(ch[i]=='z') {
//				  res = (char)(ch[i] - 32);
//				  res = (char)(res-25);
				res = 'A';
			}else if(ch[i]=='Z') {
//				res = (char)(ch[i]+32);
//				res = (char)(res+25);
				res = 'a';
				
			}else if(ch[i]>='a' && ch[i]<'z' || ch[i]>='A' && ch[i]<'Z'){
				res = (char)(ch[i]+1);
			}
			
			result = result + res;
		}
		
		return result;
	}

	public static void main(String[] args) {
		System.out.println(reverse("AbZazK"));
//		char ch = 'Z';
		 runTest("AbZazK", "LAbacB");

	        // Test Case 2: Standard lowercase wrapping (z -> A)
	        runTest("z", "A");

	        // Test Case 3: Standard uppercase wrapping (Z -> a)
	        runTest("Z", "a");

	        // Test Case 4: Mixture of shifts, wraps, and spaces to verify safety
	        runTest("HelloZ", "apmmfI");
	        
	        // Test Case 5: Empty string verification
	        runTest("", "");
	    }
	    
	    // Helper method to print test results clearly
	    private static void runTest(String input, String expected) {
	        String actual = reverse(input);
	        System.out.println("Input   : \"" + input + "\"");
	        System.out.println("Expected: \"" + expected + "\"");
	        System.out.println("Actual  : \"" + actual + "\"");
	        System.out.println("Status  : " + (actual.equals(expected) ? "✅ PASS" : "❌ FAIL"));
	        System.out.println("------------------------------------");
	    }
	}

//input : AbZazK
//ouput: LAbacB