package test_package;
import box_package.*;

public class Test
{
    public static void main (String [] args)
    {
        System.out.println("Hello World!");

        Box box = new Box (2,3,4);

        System.out.println("This box is " + box.getLength() + " x " + box.getWidth() + " x " + box.getHeight());
        System.out.println("Volume: " + box.volume());
        System.out.println("Surface Area: " + box.surfaceArea());
    }
}