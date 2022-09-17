package com.collect;

import java.util.Vector;

class Point
{
	private int x,y;
	public Point(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	public String toString()
	{
		return "("+x+","+y+")";
	}
}
public class Ex02Week14 {
	
	public static void main(String[] args) 
	{
		Vector<Point> v = new Vector<Point>();
		v.add(new Point(10, 10));
		v.add(new Point(20, 20));
		v.add(new Point(30, 30));
		v.add(new Point(40, 40));
		
		for(Point vp : v)
			System.out.print(vp+" ");
		System.out.println(" ");
		
		v.remove(1);
		for(int i=0; i<v.size(); i++)
		{
			//Point p = v.get(i);
			//System.out.print(p+" ");
			System.out.print(v.get(i)+" ");
		}
		System.out.println(" ");
		
		
	}

}
