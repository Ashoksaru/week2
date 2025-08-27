import java.util.Scanner;
public class Rectangle {
    public static void main(String[] args){
        float length,breadth,area;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE LENGTH: ");
        System.out.println("ENTER THE BREADTH: ");
        length = sc.nextFloat();
        breadth = sc.nextFloat();
        area = length * breadth;
        float perimeter = 2*(length + breadth);
        System.out.println("THE AREA OF RECTANGLE IS: "+area);
        System.out.println("THE PERIMETER OF RECTSNGLE IS: "+perimeter);
    }
}
