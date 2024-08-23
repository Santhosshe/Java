import java.util.Scanner;
public class Amicable_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum1=0,sum2=0;
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        for(int i=1;i<num1;i++){
            if(num1%i==0){
                sum1+=i;
            }
        }
        for(int i=1;i<num2;i++){
            if(num2%i==0){
                sum2+=i;
            }
        }
         System.out.println((sum1==num2&&sum2==num1)?"Amicable number":"Not an amicable number");
    }
}
