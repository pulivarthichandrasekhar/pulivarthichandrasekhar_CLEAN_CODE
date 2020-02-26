package sc_pack;

import static org.junit.Assert.*;

import org.junit.Test;

public class HouseRentTest {

	
	
	@Test
	public void test() {
		HouseRent hr =new HouseRent();
		assertEquals(2400.00,hr.constructioncost("standard",2.0),0);
		
	
	}

}