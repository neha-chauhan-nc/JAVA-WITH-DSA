import java.util.Scanner;

public class _3noprint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 3 no.: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        System.out.println("3 no's are:-" + num1+" " +num2+" " + num3);
        sc.close();
    }
}
