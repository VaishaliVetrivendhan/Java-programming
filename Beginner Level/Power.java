import java.util.Scanner;
class Power{
public static void main(String args[]){
int N,K,result=1;
try{
Scanner s=new Scanner(System.in);
N=s.nextInt();
K=s.nextInt();
if(N>=0&&K==0){
result=1;
}
else if(N==0&&K>=1){
result=0;
}
else{
for(int i=1;i<=K;i++){
result=result*N;
}
}
System.out.println(result);
}
catch(Exception e){
System.out.println("You entered invalid data.Run the program again");
}
}
}
