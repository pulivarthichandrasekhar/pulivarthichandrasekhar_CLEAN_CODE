import static org.junit.Assert.*;

import org.junit.Test;

public class SI_CITest {

	@Test
	public void test() {
		SI_CI si =new SI_CI();
		assertEquals(10.0,si.SI(10.00,10.00,10.00),0);
		assertEquals(1223.9999771118164,si.CI(1200,2,1),0);
	}

}