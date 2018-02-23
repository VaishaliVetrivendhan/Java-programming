import java.util.*;
class Hello{
public static void main(String args[]){
int n=0;
try{
Scanner s=new Scanner(System.in);
n=s.nextInt();
for(int i=1;i<=n;i++)
{
System.out.println("Hello");
}
}
catch(Exception e)
{
 System.out.println("You entered invalid data");
  System.out.println("Run the program again");
}
}
}
