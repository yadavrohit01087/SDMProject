import java.util.Scanner;
//edited by mandar
public class Main {

	public static void main(String [] args)
	{  
		  Scanner sc=new Scanner(System.in);
		  int px,py;
		 
		  px=sc.nextInt();
		  py=sc.nextInt();
		  
		  Circle c1= new Circle(1,3);
		  Circle c2= new Circle(10,10);
		  Circle c3= new Circle(px,py);
		  
		 // c1.accept();
         c2.accept();
         //c3.accept();
         
         c1.setRadius(1000);
          c1.Area();
          c2.Area();
          c3.Area();
          
          // changes in main by vaibhav.
          c1.center.setX(100);
          if(c1.center.getX()<c2.center.getX())
        	   System.out.println("c2 is larger in x co-ordinate");
          else
               System.out.println("c1 is larger in x co-ordinate");
          
         System.out.println("new radius of c1="+c1.getRadius());
		 System.out.println(c1);;
		 System.out.println(c2);
		 System.out.println(c3);
		  
	}
	
}
