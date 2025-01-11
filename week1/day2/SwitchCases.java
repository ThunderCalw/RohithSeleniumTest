package week1.day2;

public class SwitchCases {
	public static void main(String[] args) {
		String browser = "Chrome";
		
		switch(browser) {
		case "Chrome":
			System.out.println("Hello this is chrome");
			break;
		case "firefox":
			System.out.println("Hello this is fire");
			break;
		default:
			System.out.println("default case");
		}
	}
}
