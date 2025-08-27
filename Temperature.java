import java.util.Scanner;
public class Temperature {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE CELSIUS DEGREE: ");
        System.out.println("ENTER THE FAHRENHEIT DEGREE: ");
        float celsius = sc.nextFloat();
        float fahrenheit = sc.nextFloat();
        float F = (celsius * 9/5)+32;
        float C = (fahrenheit - 32)*5/9;

        System.out.println("THE CONVERTED FAHRENHEIT DEGREE IS: "+F);
        System.out.println("THE CONVERTED CELSIUS DEGREE IS: "+C);


    }
}
