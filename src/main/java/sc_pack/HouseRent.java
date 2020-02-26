package sc_pack;
	public class HouseRent {
		
		
	public double constructioncost(String material,double area)
		{
		int cost;
		double total_cost;
		if(material=="standard")
		{
			cost=1200;
		}
		else if(material=="abovestandard")
		{
			cost=1500;
		}
		else if(material=="highstandard")
		{
			cost=1800;
		}
		else
		{
			cost=2500;
		}
		total_cost=area*cost;
		return total_cost;
		}
	}

