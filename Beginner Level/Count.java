import java.util.Scanner;
class Count{
public static void main(String args[]){
int num,count=0;
try{
Scanner s=new Scanner(System.in);
num=s.nextInt();
while(num>0){
num=num/10;
count=count+1;
}
System.out.println(count);
}
catch(Exception e){
System.out.println("You entered invalid data.Run the program again");
}
}
}
