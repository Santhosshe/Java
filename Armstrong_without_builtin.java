import java.util.Scanner;
public class Armstrong_without_builtin{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int temp=num,temps=num,count=0,sum=0;
        while(num>0){
            ++count;
            num/=10;
        }
        while(temp>0){
            int rem=temp%10;
            int mul=1;
            for(int i=1;i<=count;i++)
            {
            mul*=rem;
            }
            sum+=mul;
            temp=temp/10;
        }
        if(temps==sum){
            System.out.println(num+" is Armstrong Number");
        }
        else
            System.out.println(num+" is not Armstrong Number");
    }
}
