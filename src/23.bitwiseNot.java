import java.util.Scanner;

 class bitwiseNot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first integer:");
        int a = input.nextInt();

        int result = ~a;
        System.out.println("Result is:" + result);
    }
}
