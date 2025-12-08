import java.util.Scanner;

 class perimeterOfRectangle {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the length of the rectangle:");
        int l=input.nextInt();
        System.out.println("Enter the breadth of the rectangle:");
        int b=input.nextInt();

        int perimeter=2*(l+b);
        System.out.println("the perimeter of the rectangle is:" + perimeter + "  unit");

    }
}
