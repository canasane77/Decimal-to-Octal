import java.util.ArrayList;
import java.util.Scanner;

public class DecToOct {

	public static void main(String[] args) 
	{
	  int num;
	  System.out.println("Enter Decimal Number");
	  Scanner s = new Scanner(System.in);
	  num = s.nextInt();
	  ArrayList al = new ArrayList();
	  while(num != 0)
	  {
		  int x = num % 8;
		  al.add(x);
		  num = num / 8;
	  }
	  for(int i=al.size()-1; i>=0; i--)
	  {
		System.out.print(al.get(i));  
	  }
	}

}
