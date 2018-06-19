import java.util.*;
class Prime{
public static void main(String args[]){
try{
int n,flag=0;
Scanner s=new Scanner(System.in);
n=s.nextInt();
for(int i=0;i<n/2;i++)
{
if(n%2==0)
{
flag=1;
break;
}
}
if(flag==0)
{
System.out.println("yes");
}
else{
System.out.println("no");
}
}
catch(Exception e){
System.out.println("Invalid data.\nRun again");
}
}
}
