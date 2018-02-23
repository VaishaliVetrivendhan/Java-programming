import java.util.Scanner;
class Evod{
public static void main(String args[]){
int i;
try{
Scanner s=new Scanner(System.in);
i=s.nextInt();
if(i%2==0)
{
System.out.println("Even");
}
else{
System.out.println("Odd");
}
}
catch(Exception e){
System.out.println("You entered the invalid data");
System.out.println("Run the program again");
}
}
}
