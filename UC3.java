import java.util.Scanner;

public class UC3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st coordinates of 1st line");
		int x1=sc.nextInt();
		int y1=sc.nextInt();
		
		System.out.println("Enter the 2nd coordinates of 1st line");
		int x2=sc.nextInt();
		int y2=sc.nextInt();
		
		System.out.println("Enter the 1st coordinates of 2nd line");
		int x3=sc.nextInt();
		int y3=sc.nextInt();
		
		System.out.println("Enter the coordinates of 4th line");
		int x4=sc.nextInt();
		int y4=sc.nextInt();
		
		double length1 = Math. sqrt( ( ( x2 - x1 ) * ( x2 - x1 ) ) + ( ( y2 - y1 ) * ( y2 - y1 ) ) );
		System.out.println("Length of first line" + length1 );
		
		double length2 = Math. sqrt( ( ( y4 - y3 ) * ( y4 - y3 ) ) + ( ( y4 - y3 ) * ( y4 - y3 ) ) );
		System.out.println("length of 2nd line"+length2);
		
		if (length1 < length2) {
			  System.out.println("Line 2 length is greater than line 1 length");
			} else if (length1>length2) {
			  System.out.println("Line 2 length is smaller than line 1 length");
			} else {
			  System.out.println("Line 1 length is equal to line 2 length");
			}
		

	}

}
