import java.util.*;
class Integer{
public static void main(String args[]){
int n;
Scanner s=new Scanner(System.in);
try{
n=s.nextInt();
if(n<0)
System.out.println("negative");
else if(n>0)
System.out.println("positive");
else
System.out.println("zero");
}
catch(InputMismatchException e){
System.out.println("You entered the invalid data");
System.out.println("Run the program again");
}
}
}
