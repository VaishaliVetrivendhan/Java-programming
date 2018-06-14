import java.util.Scanner;
public class EvenInterval{
public static void main(String args[]){
int start=0,end=0;
try{
Scanner s=new Scanner(System.in);
start=s.nextInt();
end=s.nextInt();
for(int i=start+1;i<end;i++)
{
if(i%2==0)
System.out.print(i+" ");
}
}
catch(Exception e){
System.out.println("You entered invalid data"+"\n"+"Run again");
}
}
}
