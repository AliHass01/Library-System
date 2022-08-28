import java.util.Scanner;

public class bookTest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the ISBN:");
        int ISBN=input.nextInt();
        System.out.println("enter the book Title:");
        String T=input.next();
        System.out.println("enter the Price:");
        double P = input.nextDouble();
        System.out.println("enter the Quantity:");
        int Q=input.nextInt();

        System.out.println("-------------------");

        bookInfo I2=new bookInfo(ISBN,Q,T,P);
        System.out.println(I2);


    }
}
