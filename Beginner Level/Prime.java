import java.util.*;
class prime{
public static void main(String args[]){
try{
int a,n,count=0;
Scanner s=new Scanner(System.in);
a=s.nextInt();
for(n=2;n<a;n++){
if(a%n==0)
count++;
}
if(count==0)
System.out.println("yes");
else
System.out.println("no");
}
catch(Exception e)
{
System.out.println("Run again");
}
}
}
