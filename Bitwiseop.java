package practical;

import java.util.Scanner;

public class Bitwiseop {
	public static void main(String[] args) {
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter value of a: ");
		a = sc.nextInt();
		
		System.out.println("Enter value of b: ");
		b = sc.nextInt();
		
		System.out.println("Enter value of c: ");
		c = sc.nextInt();
		
		c = a & b;
		System.out.println("a & b = " + c);
		
		c = a | b;
		System.out.println("a | b = " + c);
	}

}
