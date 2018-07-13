import java.util.Scanner;

public class capital{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	 String str;
	 System.out.println("Enter a character");
	 str=input.next();
	 char ch=str.charAt(0);
	 if(ch>=65 && ch<=90)
	 {
	  System.out.println("\n Upper case letter");
	 }
	 else if(ch>=97 && ch<=122)
	 {
	  System.out.println("\n Lower case letter");
	 }
	 else if(ch>=48 && ch<=57)
	 {
	  System.out.println("\n Digit");
	 }
	 else if((ch>=0 && ch<=47) || (ch>=58&& ch<=64) || (ch>=91 && ch<=96) || (ch>=123 && ch<=127))
	 {
	  System.out.println("\n Special symbol");
	 }
      }
}
