import java.util.Scanner;

class areaOfTriangle {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the base of the triangle in cm:");
        int b=input.nextInt();
        System.out.println("Enter the height of the triangle in cm:");
        int h=input.nextInt();
        double area=0.5*b*h;
        System.out.println("The area of the triangle is:"+   area   +" cm");

    }
}
