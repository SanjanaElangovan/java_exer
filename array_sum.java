import java.util.*;
public class array_sum {
public static void main(String[] args) {
	int n,sum=0;
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the number of values");
	n=input.nextInt();
	int a[]=new int[n];
	System.out.println("Enter"+" "+ n+ "array values");
	for(int i=0;i<n;i++) {
		try{
			a[i]=input.nextInt();
			sum=sum+a[i];   
	          Integer.parseInt(String.valueOf(a[i]));
	          System.out.println("Valid");
	       }catch (InputMismatchException e) {
	           System.out.println("Invalid");
	       }
		
	}
	System.out.println(sum);
}
}
