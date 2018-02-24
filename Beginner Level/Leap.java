import java.util.Scanner;
class Leap{
public static void main(String args[]){
int year;
try{
Scanner s=new Scanner(System.in);
year=s.nextInt();
if(year%4==0){
System.out.println("yes");
}
else{
System.out.println("no");
}
}
catch(Exception e){
System.out.println("You entered invalid data");
System.out.println("Run the program again");
}
}
}
