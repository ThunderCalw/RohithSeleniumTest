package week2.day1;

public class Browser {
	String launchBrowser(String browsername){
		System.out.println("Browser launched successfully");
		return browsername;
	}
	
	void loadUrl(){
		System.out.println("Application url loaded successfully");
	}
	
	public static void main(String[] args) {
		Browser obj1 = new Browser();
		obj1.launchBrowser("Browser");
		obj1.loadUrl();
	}

}
