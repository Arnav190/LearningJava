package Unit_03;
import java.util.*;
public class P14_ExceptionHandling {

	public static void main(String[] args) {
		try {
		// sensitive code
		int b=0;
		int a =100 / b;
		System.out.println(a);
		System.out.println("Done");
		}

		catch(ArithmeticException e) {
			//Exception Handling
			System.out.println(e.getMessage());
		}
		catch(Exception e) {   //super catch class and will stop other exception
			//Exception Handling
            System.out.println(e.getMessage());
	    }
	
        System.out.println("Done");
		
    }
}
