import java.util.Scanner;

public class Circle {
	
	Point center;//reference created
	private int radius;
	private int area;
	Scanner sc=new Scanner(System.in);
	
	public Circle()
	{ 
	    center= new Point(0,0);
		radius=1;
		
	}
	
	public Circle(int x,int y)
	{ 
		center= new Point(x,y);
		radius=10;
		
	}
	
	public void setRadius(int r)
	{
		radius=r;
	}
  
	public int getRadius()
	{
		return radius;
	}
	
	public void accept()
	{       System.out.println("enter centerX:");
	        center.setX(sc.nextInt());
	        System.out.println("enter centerY:");
	        center.setY(sc.nextInt());
		    System.out.println("enter radius:");
		    radius=sc.nextInt();
		
	}
	
	public void Area()
	{
	   area=radius*radius;
		
	}


	@Override
	 public String toString()
	 {
		String str="Circle:(center"+center+ ") , radius="+radius+", Area="+area;
		return str;
	 }
	
	
}