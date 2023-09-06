import java.lang.Math;
import java.util.Scanner;
public class AnyBAse {

    public static int calBAse(int a,int b){
     double d=(double)b;
     int ans=0;
    double count=0;
    while(a>0){
         double r=(double)a%10;
        int t=(int)(r*Math.pow(d,count));
        ans+=t;
        a=a/10;
        count++;
    }
    return ans;
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no :");
        int n=sc.nextInt();
        System.out.println("Enter base valeue");
        int b=sc.nextInt();
        System.out.println(calBAse(n,b));
    }
    
}
