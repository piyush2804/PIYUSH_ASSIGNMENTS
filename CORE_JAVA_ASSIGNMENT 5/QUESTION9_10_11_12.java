import java.util.LinkedList;
import java.util.List;
import java.util.function.*;
public class QUESTION9_10_11_12 {

	public static void main(String[] args) {

		List<Trader> traderList=new LinkedList<Trader>();
		
		traderList.add(new Trader("piyu", "Chennai"));
		traderList.add(new Trader("njn", "Mumbai"));
		traderList.add(new Trader("hb", "Indore"));
		traderList.add(new Trader("bhbjh", "Bangalore"));
		traderList.add(new Trader("hjbhb", "Pune"));
		traderList.add(new Trader("hbjb", "Delhi"));
		traderList.add(new Trader("hbj", "Chennai"));
		traderList.add(new Trader("bhjb", "Delhi"));
		traderList.add(new Trader("bnn", "Indore"));
		traderList.add(new Trader("hbh", "Pune"));
		
		//q9
		//traderList.stream().distinct();
		System.out.println("-----------------------------------------------------------------------------------------");
		//q10
		traderList.stream().filter((x)->{
			if (x.getCity()=="Pune")
			{
				return true;
			}
			else
			{
				return false;
			}
		}).sorted((a,b)->a.getName().compareTo(b.getName())).forEach(System.out::println);
		
		//q11
		System.out.println("-----------------------------------------------------------------------------------------");
		traderList.stream().sorted((a,b)->a.getName().compareTo(b.getName())).forEach(System.out::println);
		//q12
		System.out.println("-----------------------------------------------------------------------------------------");
		traderList.stream().filter((x)->{
			if (x.getCity()=="Indore")
			{
				return true;
			}
			else
			{
				return false;
			}
		}).forEach(System.out::println);
	}

}
