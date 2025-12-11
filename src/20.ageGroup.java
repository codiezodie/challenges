import java.util.Scanner;

class ageGroup {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your age:");
        int age = input.nextInt();
        if (age < 13) {
            System.out.println("You are a child");
        } else if (age < 20) {
            System.out.println("You are a teen");
        } else if (age < 60) {
            System.out.println("You are a adult");
        } else {
            System.out.println("You are a senior");
        }
    }
}