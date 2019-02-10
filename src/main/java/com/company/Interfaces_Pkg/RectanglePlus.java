package com.company.Interfaces_Pkg;


public class RectanglePlus implements IRelatable
{
    public int width = 0;
    public int height = 0;
    public Point origin;

    public RectanglePlus()
    {
        origin = new Point(0, 0);
    }


    public RectanglePlus(Point p)
    {
        origin = p;
    }

    public RectanglePlus(int w, int h)
    {
        origin = new Point(0, 0);
        width = w;
        height = h;
    }

    public RectanglePlus(Point p, int w, int h)
    {
        origin = p;
        width = w;
        height = h;
    }

    //move the rectangle
    public void Move(int x, int y)
    {
        origin.x = x;
        origin.y = y;
    }

    public int GetArea()
    {
        return width * height;
    }

    public int isLargerThan(IRelatable other)
    {
        RectanglePlus otherRect = (RectanglePlus) other; //casting

        if (this.GetArea() < otherRect.GetArea())
            return -1;

        else if (this.GetArea() > otherRect.GetArea())
            return 0;

        else
            return 0;
    }



    public Object FindLargest(Object o1, Object o2)
    {
        IRelatable obj1 = (IRelatable) o1;
        IRelatable obj2 = (IRelatable) o2;

        return obj1.isLargerThan(obj2) > 0 ? o1 : o2;
    }

}
