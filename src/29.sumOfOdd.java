import java.util.Scanner;

  class sumOfOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number till which you want to add odd numbers:");
        int num = input.nextInt();
        int sum=oddSum(num);
        System.out.println("The total sum of all the odd numbers from 1 to"  +  num+ " is:"  + sum);
    }

        public static int oddSum(int num){
            int sum = 0;
            int i=1;
            while(i<=num){
            sum+=i;
            i+=2;
            }
            return sum;
    }
    }

