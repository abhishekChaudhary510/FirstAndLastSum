import java.util.Scanner;

public class FirstAndLastSum {
    /*Write a program to compute the sum of the first and last digit of a given number*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your digit :");
        int number = sc.nextInt();
        int a=number;
        int rem;
        int sum1=0;
        while(number!=0){
         rem=number%10;
         sum1=rem;
         number/=10;
        }
        number=a;
        System.out.println("The computation of first and last is :"+(sum1+number%10));
    }
}
