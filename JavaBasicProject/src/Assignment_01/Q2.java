/*
Q2 WAP to count the total number of calls for a member function from 
more than one objects. [Let�s say, from 3 such Objects] 
*/

package Assignment_01;

public class Q2 {

		public static void main(String[] agrs) {
			System.out.println("Question 02");
			System.out.println("Arnav_F_20011210");
			System.out.println("\t");
			Call obj =new Call();
			Call obj1=new Call();
			Call obj2=new Call();
			Call obj3=new Call();
			Call obj4=new Call();
			Call obj5=new Call();
			Call obj6=new Call();
			Call obj7=new Call();
			
			System.out.println("Total number of call made="+obj.i);
		}
	}
	class Call{
		static int i=0;
		Call(){
			i++;
			if(i==1)
			System.out.println(i+"st Call made");
			else if(i==2)
			System.out.println(i+"nd Call made");
			else if(i==3)
			System.out.println(i+"rd Call made");
			else
			System.out.println(i+"th Call made");
		}
	}