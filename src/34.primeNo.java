import java.util.Scanner;

class primeNo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to check if it is prime or not.");
        int num = input.nextInt();
        int count = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
                //break;
            }
        }
            if (count == 2) {
                System.out.println("The given number is a prime number ");
            } else {
                System.out.println("The given number is not a prime number ");
            }
        }
    }
