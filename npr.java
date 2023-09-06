import java.util.*;

public class npr{
    public static int calculateFact(int a){
        int fact=1;
        if (a==0)return fact;
        
        for (int i=1;i<=a;i++){
            fact*=i;
        }
        return fact;
        
    }
    public static void display(int n,int r, int ans){

System.out.print(n+"P"+r+" = "+ans);
    }
   public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n=sc.nextInt();
        System.out.println("Enter the value of r: ");
        int r=sc.nextInt();
        int result=calculateFact(n)/calculateFact(n-r);
       
        display(n, r,result);
        
        
    }
}