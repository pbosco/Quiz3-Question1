package MainPackage;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class testTriangle {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testArea() {
		//fail("Not yet implemented");
		
		Triangle t = new Triangle(10,10,10);
		
		t.getArea();
		assertTrue(t.getArea() == 43.3013);

	}
	
	@Test
	public void testPerimeter(){
		Triangle t = new Triangle(1,1,1);
		
		t.getPerimeter();
		assertTrue(t.getPerimeter() == 3);
		
	}

}
