import java.util.Scanner;

public class demojv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("Sum your number is: " + (a + b)); // hien thi len man hinh console
        final int c = a * b;
        System.out.println("c = " + c);
    }
}
