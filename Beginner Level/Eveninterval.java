import java.util.Scanner;
public class Eveninterval{
public static void main(String args[]){
int start=0,end=0;
try{
Scanner sc=new Scanner(System.in);
start=sc.nextInt();
end=sc.nextInt();
for(int i=start;i<end;i++)
{
if(i%2==0)
System.out.print(i+" ");
}
}
catch(Exception e){
System.out.println("You entered invalid data"+"\n"+"Run the program again");
}
}
}
