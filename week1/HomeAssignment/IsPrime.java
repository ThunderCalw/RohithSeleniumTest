package week1.day2;

public class IsPrime {
	public static void main(String[] args) {
		
		int num =  13;
		int temp = num;
        for (int i = 2; i <= num-1; i += 1) {
            if (num % i == 0) {
            	System.out.println(false);
            	temp = temp -1;
            	break;
            }
        }
        
        if(num<=1) {
        	System.out.println(false);
        }
        else if(num==2 || num==3) {
        	System.out.println(true);
        }
        else if(temp == num) {
        	System.out.println(true);
        }
	}
}
