import java.util.Scanner;
public class Oddinterval{
  public static void main(String args[]){
    int s=0,e=0;
    try{
    Scanner sc=new Scanner(System.in);
    s=sc.nextInt();
    e=sc.nextInt();
    for(int i=s;i<=e;i++)
    {
      if(i%2!=0)
        System.out.print(i+" ");
    }
    }
    catch(Exception e){
      System.out.println("You entered invalid data"+"\n"+"Run the program again");
    }
  }
}
      
    
