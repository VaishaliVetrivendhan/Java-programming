import java.util.Scanner;
class Sum{
public static void main(String args[]){
int n=0,s=0;
try{
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
for(int i=1;i<=n;i++){
s=s+i;
}
System.out.println(s);
}
catch(Exception e){
System.out.println("You entered invalid data");
System.out.println("Run the program again");
}
}
}
