import java.util.*;
public class reversing {
public static void main(String[] args) {
	String str;
	Scanner input=new Scanner(System.in);
	System.out.println("Enter a word to reverse");
	str= input.next();
	char[] ch = str.toCharArray();
	System.out.println("The reversed word is");
	for (int i = ch.length-1; i>=0; i--)
        System.out.print(ch[i]);
}
}
