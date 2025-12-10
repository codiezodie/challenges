import java.util.Scanner;

class DETERMINE {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter you number:");
        int a=input.nextInt();

        if(a>0){
            System.out.println("The entered number is positive.");
        }
        else if (a==0) {
            System.out.println("The entered number is zero.");
        }
        else {
            System.out.println("The entered number is negative.");
        }
    }
}
