import java.util.Scanner;
class Alphabetno{
public static void main(String args[]){
char c=0;
Scanner s=new Scanner(System.in);
c=s.next().charAt(0);
if((c>='a'&&c<='z')||(c>='A'&&c<='Z'))
{
System.out.println("Alphabet");
}
else{
System.out.println("No");
}
}
}
