package logger1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Assignement4.cleencodeSerialization.Caculateinterest;
import Assignement4.cleencodeSerialization.EstimateCost;

public class CleenCodeSerializationTest {

	Caculateinterest i;
	EstimateCost i1;
	@Before
	public void init()
	{
		i1=new EstimateCost();
		i=new Caculateinterest();
	}
	@Test
	public void test() {
		assertEquals(12000.0,i1.estimate(1,10.0,true),0);
		assertEquals(15000.0,i1.estimate(2,10.0,true),0);
		assertEquals(12000.0,i1.estimate(1,10.0,false),0);
		assertEquals(15000.0,i1.estimate(2,10.0,false),0);
		assertEquals(18000.0,i1.estimate(3,10.0,false),0);
		assertEquals(25000.0,i1.estimate(3,10.0,true),0);
		assertEquals(288.00,i.simpleInterestcalculator(1200,5,1),0);
		assertEquals(1223.9999771118164,i.compoundinterestcalculator(1200,2,1),0);
	}
}
