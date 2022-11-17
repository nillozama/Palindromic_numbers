
public class Main {

	public static void main(String[] args) {
		
		int productNumber;
		int palindrome=0;
		int iNumber=0;
		int jNumber=0;
		for (int i=100; i<=999; i++) {
			
			for(int j=100; j<=999; j++) {
				
				productNumber=i*j;

				if(isPalindrome(productNumber)) {
					
					if(productNumber>palindrome) {
					palindrome=productNumber;
					iNumber=i;
					jNumber=j;
					
					}
					
				}
			}
		}
		
		System.out.println("The largest palindrome made from the product of two 3-digit numbers, ("+iNumber+"*"+jNumber+") is "+palindrome+".");

	}
	
	
	public static boolean isPalindrome(int x) {
		
		boolean result=false;
		
		if(new StringBuffer(String.valueOf(x)).reverse().toString().equals(String.valueOf(x))) {
			
			result=true;	
		}
		
		return result;
	}
}


