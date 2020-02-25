package org.example;
import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )

    {
        System.out.println( "We will now calculate the area of a 2d square or rectangle" );
        int length, breadth, area;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length please : ");
        length = sc.nextInt();
        System.out.print( "Enter the breadth please: " );
        breadth = sc.nextInt();

        area = length * breadth;
        System.out.println("The area of the shape is: " + area);
    }

}
