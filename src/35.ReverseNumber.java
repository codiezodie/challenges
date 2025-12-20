import java.util.Scanner;

class ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = input.nextInt();
        int result=reverse(num);
        System.out.println("The Reversed number is:"+result);
    }
    public static int reverse(int num){
        int reverseNo=0;
        while(num>0){
             int lastNo=num % 10;
             reverseNo=reverseNo*10+lastNo;
             num /= 10;
        }
        return reverseNo;
    }
}
