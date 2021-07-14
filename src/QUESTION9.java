import java.util.Scanner;

public class QUESTION9 {
public static void main(String []args)
{
	Students obj1=new Students();
	Students obj2=new Students();
	Students obj3=new Students();
	System.out.println(obj1.getTotal());
	System.out.println(obj1.getAverage());
	System.out.println(obj2.getTotal());
	System.out.println(obj2.getAverage());
	System.out.println(obj3.getTotal());
	System.out.println(obj3.getAverage());
	System.out.println("Total in X subject "+ obj1.TotalscoreinX(obj2,obj3));
	System.out.println("Total in Y subject "+ obj1.TotalscoreinY(obj2,obj3));
	System.out.println("Total in Z subject "+ obj1.TotalscoreinZ(obj2,obj3));
	
}
}
class Students
{
	private int x,y,z;
	Students()
	{
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();y=sc.nextInt();z=sc.nextInt();
	}
	public int getTotal()
	{
		return (x+y+z);
	}
	public double getAverage()
	{
		return ((x+y+z)/3.0);
	}
	public int TotalscoreinX(Students obj2,Students obj3)
	{
		return (this.x+obj2.x+obj3.x);
	}
	public int TotalscoreinY(Students obj2,Students obj3)
	{
		return (this.y+obj2.y+obj3.y);
	}
	public int TotalscoreinZ(Students obj2,Students obj3)
	{
		return (this.z+obj2.z+obj3.z);
	}
}
