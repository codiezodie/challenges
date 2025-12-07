import java.util.Scanner;

class Sum {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter first integer:");
        int a=input.nextInt();
        System.out.println("Enter second integer:");
        int b= input.nextInt();
        int sum=a+b;
        System.out.println("The sum of the two number is:"+sum);
    }
}
