import java.util.Scanner;

class sumOfDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = input.nextInt();
        int result=digit(num);
        System.out.println("The sum is:"+result);

    }
    public static int digit(int num){
        int sum=0;
        while(num>0) {
            sum += num % 10;
             num /= 10;
        }
        return sum;
    }

}
