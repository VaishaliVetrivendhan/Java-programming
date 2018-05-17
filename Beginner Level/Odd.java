import java.util.Scanner;
public class Odd{
public static void main(String args[]){
int n,m;
try{
Scanner s=new Scanner(System.in);
n=s.nextInt();
m=s.nextInt();
for(int i=n;i<=m;i++){
    if(i%2!=0)
    System.out.println(i);
}
}
catch(Exception e){
System.out.println("You entered invalid data.Run the program again");
}
}
}
