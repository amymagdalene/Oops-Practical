package practical;
import java.util.Scanner;

public class Relationalop {
	public static void main(String[] args) {
		int a,b;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter value of a: ");
		a = sc.nextInt();
		
		System.out.println("Enter value of b: ");
		b = sc.nextInt();
		
		System.out.println("a is " + a + " and b is " + b);
		
		System.out.println(a == b);
		System.out.println(a != b);
		System.out.println(a > b);
		System.out.println(a < b);
		System.out.println(a >= b);
		System.out.println(a <= b);
	}

}
