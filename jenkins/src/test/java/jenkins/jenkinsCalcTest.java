package jenkins;

import static org.junit.Assert.*;

import org.junit.Test;

public class jenkinsCalcTest {

	@Test
	public void addTest() {
		jenkinscalculater jc=new jenkinscalculater();
		assertEquals(10,jc.addNumbers(5, 5));
	}
	
	@Test
	public void subTest() {
		jenkinscalculater jc=new jenkinscalculater();
		assertEquals(0,jc.subNumbers(5, 5));
	}

}
