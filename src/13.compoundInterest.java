import java.util.Scanner;

 class compoundInterest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Plz,Enter the principal amount (in rupees):");
        int P= input.nextInt();
        System.out.println("Now,tell me the rate of the interest:");
        float R= input.nextFloat();
        System.out.println("And the time period(in years):");
        float T= input.nextFloat();

        double compound=P*Math.pow(1+R/100,T);
        System.out.println("The compound interest would be :"+compound);

    }
}
