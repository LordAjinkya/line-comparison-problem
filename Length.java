import java.util.*;
public class Length {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Type the coordinates of 1st point");
		int x1=sc.nextInt();
		int y1=sc.nextInt();
		
		System.out.println("Type the coordinates of 2nd point");
		int x2=sc.nextInt();
		int y2=sc.nextInt();
		
		int len1=(int) Math.pow((x2-x1), 2);
		int len2=(int) Math.pow((y2-y1), 2);
		double length=Math.sqrt(len1+len2);
		System.out.println("Total length of line:"+length);
		// TODO Auto-generated method stub

	}

}
