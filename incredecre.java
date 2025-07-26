package practical;
import java.util.Scanner;

public class incredecre {
	public static void main(String[] args) {
	int x,y;
	int result1,result2;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter value of x: ");
	x = sc.nextInt();
	
	System.out.println("Enter value of y: ");
	y = sc.nextInt();
	
	result1 = ++x;
	System.out.println("After increment: " + result1);
	
	result2 = --y;
	System.out.println("After decrement: " + result2);
	
	}
	
}
