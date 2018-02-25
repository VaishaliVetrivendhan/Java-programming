import java.util.*;
class Multiples{
public static void main(String args[]){
int n=0,i,m;
try{
Scanner s=new Scanner(System.in);
n=s.nextInt();
for(i=1;i<=5;i++)
{
m=n*i;
System.out.print(m+" ");
}
}
catch(Exception e){
System.out.println("You entered invalid data"+"\n"+"Run the program again");
}
}
}
