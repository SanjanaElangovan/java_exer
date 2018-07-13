import java.util.Scanner;
public class looping {
public static void main(String[] args) {
	int num;
	System.out.println("Enter a number");
	Scanner input= new Scanner(System.in);
	num=input.nextInt();
	for(int i=1;i<=num;i++) {
		for(int j=1;j<=i;j++) {
			System.out.println(i);
		}
	}
}
}
