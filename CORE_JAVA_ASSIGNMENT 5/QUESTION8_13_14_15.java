import java.util.LinkedList;
import java.util.List;

public class QUESTION8_13_14_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Transaction> transList=new LinkedList<Transaction>();
		
		transList.add(new Transaction(new Trader("piyu", "Delhi"), 2010, 500));
		transList.add(new Transaction(new Trader("piyush", "Mumbai"), 2012, 600));
		transList.add(new Transaction(new Trader("kathuria", "Chennai"), 2013, 300));
		transList.add(new Transaction(new Trader("is", "Pune"), 2011, 400));
		transList.add(new Transaction(new Trader("my", "Banglore"), 2015, 700));
		transList.add(new Transaction(new Trader("name", "Kolkata"), 2011, 600));
		transList.add(new Transaction(new Trader("hello", "Delhi"), 2014, 300));
		transList.add(new Transaction(new Trader("there", "Chennai"), 2011, 200));
		transList.add(new Transaction(new Trader("jo", "Delhi"), 2012, 900));
		transList.add(new Transaction(new Trader("na", "Delhi"), 2013, 200));
		
		transList.stream().filter((x)-> {
			if(x.getYear()==2011)	
			{
				return true;
			}
			else
			{
				return false;
			}
		}).sorted((a,b)->a.getValue()-b.getValue()).forEach(System.out::println);
		
		
		transList.stream().filter((x)-> {
			if(x.getTrader().getCity()=="Delhi")	
			{
				return true;
			}
			else
			{
				return false;
			}
		}).forEach((y)->System.out.println(y.getValue()));
		
		
		System.out.println(transList.stream().max((a,b)->a.getValue()-b.getValue()));
		
		System.out.println(transList.stream().min((a,b)->a.getValue()-b.getValue()));
		
	}

}
