import java.util.Scanner;

class factorial{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = input.nextInt();
        int factorial=fact(num);
        System.out.println("The factorial of the given number is:"+factorial);

    }
    public static int fact(int num){
        if(num<2){
            return 1;
        }
        int i=2;
        int factorial=1;
        while(i<=num){
            factorial*=i;
            i++;
        }
    return factorial;
    }
}

