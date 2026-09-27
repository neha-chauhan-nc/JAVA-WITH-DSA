import java.util.Scanner;

public class simpleinterest {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter Values:- ");
    double p=sc.nextDouble();
    double i=sc.nextDouble();
    double r=sc.nextDouble();

    double si=(p*i*r)/100;
    System.out.println(si+" ");

    sc.close();
}    
}
