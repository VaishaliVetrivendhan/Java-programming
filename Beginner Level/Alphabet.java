import java.util.Scanner;
class Alphabet{
public static void main(String args[]){
char c=0;
Scanner s=new Scanner(System.in);
c=s.next().charAt(0);
if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
{
System.out.println("Vowel");
}
else if((c>='a'&&c<='z')||(c>='A'&&c<='Z'))
{
System.out.println("Consonant");
}
else{
System.out.println("It is not an alphabet");
System.out.println("Run the program again")
}
}
}
