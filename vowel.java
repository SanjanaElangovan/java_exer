import java.util.Scanner;
public class vowel {
	public static void main(String[ ] args)
	{
	int i;
	String str;
	Scanner input=new Scanner(System.in);
	System.out.println("Enter a character : ");
	str= input.next(); 	
	for(i=0;i<str.length();i++) {
		char ch=str.charAt(i);
	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
	{
	System.out.println("Vowel"); 
	}
	else {
		System.out.println("Consonant");
	}
	}
	}
}
