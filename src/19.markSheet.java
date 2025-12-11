import java.util.Scanner;

 class markSheet {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the marks of the student :");
        int marks=input.nextInt();

        if(marks> 90){
            System.out.println("congratulations!! you got grade A");   
        } else if (marks>75) {
            System.out.println("well done!! you got grade B");
        } else if (marks>60) {
            System.out.println("good!! you got grade C");  
        } else if (marks>30) {
            System.out.println("gotta work hard! you got grade D");
        } else {
            System.out.println("must do a lot of work! you got grade E");
        }
    }
}
