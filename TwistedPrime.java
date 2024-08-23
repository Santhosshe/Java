import java.util.Scanner;
public class TwistedPrime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int temp=num,flag=0;
        int digit=0;
        if(num<=1)
            System.out.println(num+" is not a Prime number");
        else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(num + " is a Prime number");
                while (num > 0) {
                    int rem = num % 10;
                    digit = digit * 10 + rem;
                    num /= 10;
                }
                for (int i = 2; i <=digit ; i++) {
                    if (digit % i == 0 && i!=digit) {
                        System.out.println(digit + " is Not a Twisted prime number");
                        break;
                    } else {
                        System.out.println(digit + " is Twisted prime number");
                        break;
                    }
                }
            } else {
                System.out.println(num + " Not a prime number");
            }
        }
        }
    }


