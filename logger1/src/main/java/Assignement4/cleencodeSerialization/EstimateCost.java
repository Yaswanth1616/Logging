package Assignement4.cleencodeSerialization;

public class EstimateCost {
	static final org.apache.log4j.Logger Logger =org.apache.log4j.Logger.getLogger("Caculateinterest.class");
	public double estimate(int standard,double area,boolean automated)
	{
		Logger . info("Estimated cost  returned" );
		if(standard==1)
			return (double)1200*area;
		else if(standard==2)
			return (double)1500*area;
		else if(standard==3&&!automated)
			return (double)1800*area;
		else
			return (double)2500*area;
	}
	
}
