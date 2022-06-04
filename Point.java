import java.util.Scanner;
//one attribute added;
public class Point {
	private int z;
	private int x;
	private int y;
	Scanner sc= new Scanner(System.in);
	 //added z=0;
	public Point()
	{
		x=0;
		y=0;
		z=0;
	}
         // added z=az;
	public Point(int ax,int ay,int az)
	{
		x=ax;
		y=ay;
		z=az;
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
