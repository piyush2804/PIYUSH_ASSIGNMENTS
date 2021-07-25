import java.util.Scanner;

public class QUESTION6 {

	public static void main(String[] args) {
		String userid1="",pass1="";
		
		int count=0,x=1;
		String userid="piyush@gmail.com";
		String pass="xyz@123";
		Scanner sc=new Scanner(System.in);
		
		while(count!=3&&x==1)
		{
		System.out.println("enter login details");
		System.out.println("enter user id \n");
		userid1=sc.nextLine();
		System.out.println("enter password");
		pass1=sc.nextLine();
		switch(userid1)
		{
		case "piyush@gmail.com":
			switch(pass1)
			{
			case ("xyz@123"):
				System.out.println("Welcome");
				count=3;
				break;
			default:
				count++;
				System.out.println("PRESS 1 TO Try again , 0 to exit! \n attempts left:"+(3-count));
				x=sc.nextInt();
				sc.nextLine();
				break;
			}
			break;
		default:
			count++;
			System.out.println("PRESS 1 TO Try again, 0 to exit! \n attempts left:"+(3-count));
			x=sc.nextInt();
			sc.nextLine();
			break;
		}
		}
		System.out.println("Contact admin!!");
sc.close();
	}

}
