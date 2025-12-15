import java.util.Scanner;

 class bitwiseAnd {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter first integer:");
        int a=input.nextInt();
        System.out.println("Enter second integer:");
        int b= input.nextInt();

        int result=a & b;
        System.out.println("The Bitwise sum is:"+result);
    }
}
