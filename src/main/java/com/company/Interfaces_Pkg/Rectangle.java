package com.company.Interfaces_Pkg;

public class Rectangle implements IRelatable
{
    int width = 0;
    int height = 0;
    Point origin;

    public Rectangle()
    {
        origin = new Point(0, 0);
    }

    public Rectangle(Point p)
    {
        origin = p;
    }

    public Rectangle(int w, int h)
    {
        origin = new Point(0, 0);
        width = w;
        height = h;
    }

    public Rectangle(Point p, int w, int h)
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

    @Override
    public int isLargerThan(IRelatable o)
    {
        return 0;
    }
}
