import java.util.Scanner;

class Swap {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number:");
        int a=input.nextInt();
        System.out.println("Enter another number:");
        int b= input.nextInt();
        int temp;
        System.out.println("Numbers before swap:"+a+ "  "  +  b);
        temp=a;
        a=b;
        b=temp;
        System.out.println("Numbers after swap:"+ a+"   "  +b);


    }


}
