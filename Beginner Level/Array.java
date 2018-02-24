import java.util.Scanner;
class Array{
public static void main(String args[]){
int[]a=new int[50];
int N,K,sum=0;
try{
Scanner s=new Scanner(System.in);
N=s.nextInt();
K=s.nextInt();
for(int i=0;i<N;i++){
a[i]=s.nextInt();
}
for(int i=0;i<K;i++){
sum=sum+a[i];
}
System.out.println(sum);
}
catch(Exception e){
System.out.println("You entered invalid data.Run the program again");
}
}
}
