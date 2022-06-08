package Unit_03;

import java.util.Scanner;

//26-05-2022 -> Thursday(Theory)
//26-05-2022 -> Thursday(Lab)

/* There are 3 tasks for Multi-Threading which is in the hand of the user :-
 * 1. Identify dependent and non dependent task in respective process.
 * 2. Insert selective tasks into threads.
 * 3. Start those threads.
 */

public class P16_MultiThreading {
	
	public static void main(String[] args) {
		
//		C1 obj1 = new C1();
//		obj1.show1();
//		
//		System.out.println("\n");
//		C2 obj2 = new C2();
//		obj2.show2();
		
      Thread t1 = new Thread(new T1(), "T4");//Parameterized constructor call of Thread class.
	  Thread t2 = new Thread(new T2(), "T2");
	  Thread t3 = new Thread(new T3(), "T3");
	  
	  t1.start();
	  t2.start();
	  t3.start();
		
	}

}

class C1{
	void show1() {
		
		Scanner obj = new Scanner(System.in);
		int a = obj.nextInt();
		System.out.println(a);
		System.out.println("Done with show1()!");
		obj.close();
	}
}

class C2{
	void show2() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i + "-Hey_2!");
		}
	}
}

class T1 extends Thread{
	public void run() {
		
		Scanner obj = new Scanner(System.in);
		int a = obj.nextInt();
		System.out.println(a);
		System.out.println("Done with show1()!");
		System.out.println(Thread.currentThread().getName());
		obj.close();
	}
}

class T2 extends Thread{
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i + "-Hey_2!");
			System.out.println(Thread.currentThread().getName());
		}
	}
}

class T3 extends Thread{
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i + "-Hey_3!");
			System.out.println(Thread.currentThread().getName());
		}
	}
}