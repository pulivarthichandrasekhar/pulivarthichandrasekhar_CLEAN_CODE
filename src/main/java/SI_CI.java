
public class SI_CI {
	 double SI(double pr,double t,double r )
	{
		return (pr * t * r)/100;
	}
	 double CI(float pricipalcompound,float rateofinterestcompound,int timecompound)
	{
		 double compoundinterest = pricipalcompound* (Math.pow((1 + rateofinterestcompound / 100), timecompound));
			return compoundinterest;
	}
}
