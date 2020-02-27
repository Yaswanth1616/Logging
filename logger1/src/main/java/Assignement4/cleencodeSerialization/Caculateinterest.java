package Assignement4.cleencodeSerialization;
public class Caculateinterest {
	static final org.apache.log4j.Logger Logger =org.apache.log4j.Logger.getLogger("Caculateinterest.class");

	public double simpleInterestcalculator(double amount,double time,double interestrate)
	{
		Logger . info("simple interest returned" );
		return amount+(amount*time*interestrate/100.00);
	}
	public double compoundinterestcalculator(double amount,double time,double interestrate)
	{
		Logger . info("compound interest returned" );
		return amount*Math.pow(1+interestrate/100.0,time);
	}
}
