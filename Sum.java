import java.util.Scanner;
public class Sum{
    public static void main(String[] args){
        int a;
        int b;
        int total;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE FIRST NUMBER: ");
        System.out.println("ENTER THE SECOND NUMBER: ");
        a = sc.nextInt();
        b = sc.nextInt();
        total = a + b;
        int product = a*b;
        int difference = a-b;
        float quotient = a/b;
        System.out.println("THE TOTAL SUM IS: "+total);
        System.out.println("THE DIFFERENCE OF TWO NUMBER IS: "+difference);
        System.out.println("THE PRODUCT OF TWO NUMBER  IS: "+product);
        System.out.println("THE QUOTIENT  IS: "+quotient);


    }
}
