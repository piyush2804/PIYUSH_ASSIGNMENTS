import java.util.Scanner;

public class ASSIGNMENT_1_QUESTION2 {
	public static void main(String []args)
	{
		int num,x=0,sol=0,y;
		
		for(int i=100;i<999;i++)
		{
			sol=0;
			y=0;
		/*while(num!=0)
		{
			degree++;
			num=num/10;
		}
		num=y;*/
		num=i;
		y=i;
		while(num!=0)
		{
			//System.out.print(num+"\n");
			x=num%10;
			sol= sol+ (int) Math.pow(x, 3);
			num=num/10;
		}
		//System.out.print(sol+"\n");
		if(sol==y)
		{
			System.out.println(sol+"\nnumber is armstrong");
		}
	}
	}

}
