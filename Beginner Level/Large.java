import java.util.Scanner;
class Large{
public static void main(String args[]){
int a=0,b=0,c=0;
try{
Scanner s=new Scanner(System.in);
a=s.nextInt();
b=s.nextInt();
c=s.nextInt();
if((a>b&&a>c)||(a==b)){
System.out.println(a);
}
else if((b>a&&b>c)||(b==a)){
System.out.println(b);
}
else{
System.out.println(c);
}
}
catch(Exception e){
System.out.println("You entered invalid data");
System.out.println("Run the program again");
}
}
}
