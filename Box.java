package box_package;

public class Box
{
    private double length = 5;
    private double width = 5;
    private double height = 5;

    // class definition
    public Box (double length, double width, double height)
    {
        this.length = length;
        this.width = width;
        this.height = height;
    }


    // accessor methods
    public double getLength()
    {
        return this.length;
    }

    public double getWidth()
    {
        return this.width;
    }

    public double getHeight()
    {
        return this.height;
    }


    // functional methods
    public double volume ()
    {
        double volume = 0;
        volume = length * width * height;
    
        return volume;
    }

    public double surfaceArea()
    {
        double surfaceArea = 0;
        surfaceArea = 2 * (length*width + length*height + width*height);

        return surfaceArea;
    }
}