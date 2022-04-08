package Unit_01;

/* Problem Statement:

P8_String: 

(Create separate logic in separate function)

F1 - Check the entered string is palindrome or not? 
  		String s = "75457"
  		Output: Yes it is a palindrome or No it is not a palindrome.

F2 - Make a reverse of a string using?
F3 - String Compare: Check if the strings are equal or not?

 * */

public class P8_String {

	public static void main(String[] args) {

		QuestionsOnString obj = new QuestionsOnString();

		String s1 = new String("75457");
		String s2 = new String("7545a");

		obj.palindromeOrNot(s1);
		obj.reverseOfAString(s2);
		obj.stringEqualOrNot(s1, s2);

	}

}

class QuestionsOnString {

	void palindromeOrNot(String s) {
		// Write Logic Here!
		
		String a1 = "";
		for(int i=0; i<s.length(); i++)
		{
			char ch = s.charAt(i);
			a1 = ch + a1;
			
		}
		System.out.println(a1);
		int flag=0;
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)==a1.charAt(i))
				flag++;
			
		}
		if(flag==s.length() && flag==a1.length())
			System.out.println("Yes it is a palindrome.");
		else
			System.out.println("No it is not a palindrome.");

	}

	void reverseOfAString(String s) {
		// Write Logic Here!
		
		String a1 = "";
		System.out.println("\n");
		for(int i=0; i<s.length(); i++)
		{
			char ch = s.charAt(i);
			a1 = ch + a1;
		}
		System.out.println("Reverse String is: " + a1);

	}
	
	void stringEqualOrNot(String s1,String s2) {
		// Write Logic Here!
		
		int flag=0;
		System.out.println("\n");
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)==s2.charAt(i))
				flag++;
		}
		if(flag==s1.length() && flag==s2.length())
			System.out.println("Strings are equal");
		else
			System.out.println("Strings are not equal");
		
	}
}
