import java.util.Scanner;
public class palindrome {
	public static void main(String[] args) {
		int num,rem,revnum=0,newnum;
		Scanner input =new  Scanner(System.in);
		System.out.println("Enter a number");
	num=input.nextInt();
	newnum=num;
	while(newnum!=0) {
		rem=newnum%10;
		revnum= revnum*10 +rem;
		newnum=newnum/10;
	}
	if(num==revnum) {
	System.out.println("Palindrome");
	int sum=0;
    while(num!=0) {
    	rem=num%10;
    	num=num/10;
    	if(rem%2==0) {
    		sum=sum+rem;
    	}
    }
    if(sum>25) {
    	System.out.println("Success");
    }
    else {
    	System.out.println("Failure");
    }
	}
	else {
		System.out.println("Not a palindrome");
	}
	}

}
