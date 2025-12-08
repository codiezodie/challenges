import java.util.Scanner;

class simpleInterest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Plz,Enter the principal amount:");
        int S= input.nextInt();
        System.out.println("Now,tell me the rate of the interest:");
        float R= input.nextFloat();
        System.out.println("Now tell me the amount of years you are borrowing it:");
        float T= input.nextFloat();

        System.out.println("Your Simple Interest is:"+((S*R*T)/100));

    }
}
