public class IsPalindrome
{
	public static void main(String[] args)
	{
		System.out.println("Enter string to check as a palindrome:");
		
		String str = System.console().readLine();
		
		int x = 0;

		boolean isPalindrome = true;
		
		for(int i = str.length() - 1; i >= 0; i--)
		{
			if (str.charAt(x) != str.charAt(i)){
				isPalindrome = false;
			}
			x++;
		}
		System.out.println("Palindrome test results:");
		if (isPalindrome == true){
			System.out.println("Positive");
		}
		else {
			System.out.println("Negative");
		}
	}
}