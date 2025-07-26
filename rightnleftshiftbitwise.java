package practical;

import java.util.Scanner;

public class rightnleftshiftbitwise {
	public static void main(String[] args) {
		int a,c;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter value of a: ");
		a = sc.nextInt();
		
		System.out.printf("Enter value of c: ");
		c = sc.nextInt();
		
		c = a<<2;
		System.out.println("a<<2 = " +c);
		
		c = a>>2;
		System.out.println("a>>2 = " +c);
		
		c=a>>>2;
		System.out.println("a>>>2= " +c);
	}

}
