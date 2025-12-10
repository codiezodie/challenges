import java.util.Scanner;

class greatestOf3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the 3 numbers:");
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();

        if(a > b && a > c){
           System.out.println(+a  + "is the greatest number. ");
        } else if (b > a && b > c) {
            System.out.println(+b  + "is the greatest number. ");
        }
        else{
            System.out.println(+c  + "is the greatest number. ");
        }

    }
}
