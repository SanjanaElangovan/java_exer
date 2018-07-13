import java.util.*;

public class guesswho {
public static void main(String[] args) {
	int targetnum,guess;
	targetnum=10;
	Scanner input=new Scanner(System.in);
	do {
		System.out.println("Enter a guess (1-100)");
		guess=input.nextInt();
		if(guess==targetnum) {
			System.out.println("Your guess is correct");
		}
		else if(guess<targetnum) {
			System.out.println("Your guess is smaller than target number");
		}
		else if(guess>targetnum) {
			System.out.println("Your guess is greater than target number");
		}
	}while(guess!=targetnum);
}
}