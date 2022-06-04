import java.util.Scanner;

public class Point {
	
	private int x;
	private int y;
	Scanner sc= new Scanner(System.in);
	 
	public Point()
	{
		x=0;
		y=0;
	}
  
	public Point(int ax,int ay)
	{
		x=ax;
		y=ay;
		
	}
	
    public void setX(int ax)
    {
    	x=ax;
    }
    
    public int getX()
    {
    	return x;
    }
    
    public void setY(int ay)
    {
    	y=ay;
    }
    
    public int getY()
    {
    	return y;
    }
	
	@Override
	public String toString()
	{
		String str="("+x+","+y+")";
		return str;
	}
}
