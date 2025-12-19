import java.util.Scanner;
class Lcm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num1 = input.nextInt();
        System.out.println("Enter another number :");
        int num2 = input.nextInt();
        int result = lcm(num1, num2);
        System.out.println("The lcm is:"+result);

    }

    public static int lcm(int num1, int num2) {
        //int fact=1;
        int lcm=(num1 > num2) ? num1:num2;
        while(true){
        if( lcm%num1==0 && lcm%num2==0 ){
            System.out.printf("Lcm of %d and %d is: %d",num1,num2,lcm);
            break;
        }
        lcm++;
        }
    return lcm;
    }
}
