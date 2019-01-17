import static org.junit.Assert.*;

import org.junit.Test;

public class StudentTest {

	@Test
	public void test() {
		Student s1 = new Student ("Armando", 2000 , "IMA");
		
		assertEquals(19,  s1.getAlter());
	}

}
