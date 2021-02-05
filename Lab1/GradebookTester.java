import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradebookTester {
	GradeBook book1, book2;

	@BeforeEach
	void setUp() throws Exception {
		book1 = new GradeBook(5);
		book2 = new GradeBook(5);
		
		book1.addScore(23);
		book1.addScore(89);
		book1.addScore(78);
		
		book2.addScore(99);
		book2.addScore(68);
		book2.addScore(100);
		book2.addScore(70);
	}

	@AfterEach
	void tearDown() throws Exception {
		book1 = book2 = null;
	}

	@Test
	public void addScore() {
		assertTrue(book1.toString().equals("23.0 89.0 78.0 "));
		assertTrue(book2.toString().equals("99.0 68.0 100.0 70.0 "));
	}
	
	@Test
	public void getScoreSize() {
		assertEquals(3, book1.getScoreSize(),0.001);
		assertEquals(4, book2.getScoreSize(),0.001);
	}
	
	@Test
	public void sum() {
		assertEquals(190, book1.sum(),0.001);
		assertEquals(337, book2.sum(),0.001);
	}
	
	@Test
	public void minimum() {
		assertEquals(23, book1.minimum(),0.001);
		assertEquals(68, book2.minimum(),0.001);
	}
	
	@Test
	public void finalScore() {
		assertEquals(167, book1.finalScore(),0.001);
		assertEquals(269, book2.finalScore(),0.001);
	}

}
