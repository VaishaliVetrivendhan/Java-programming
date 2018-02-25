import java.util.*;
class Factorial{
public static void main(String args[]){
int f=1,n=0;
try{
Scanner s=new Scanner(System.in);
n=s.nextInt();
for(int i=1;i<=n;i++)
{
f=f*i;
}
System.out.println(f);
}
catch(Exception e){
System.out.println("Invalid data"+"\n"+"Run the program again");
}
}
}
