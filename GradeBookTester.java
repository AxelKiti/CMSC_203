import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTester {
	private GradeBook gb1 = new GradeBook(5);
	private GradeBook gb2 = new GradeBook(5);
	
	@BeforeEach
	void setUp() throws Exception {
		//two GradeBook Objects which hold 5 scores each:
		
		GradeBook gb2 = new GradeBook(5);
		
		gb1.addScore(98.9);
		gb1.addScore(86.5);
		
		gb2.addScore(81.7);
		gb2.addScore(93.2);
	}

	@AfterEach
	void tearDown() throws Exception {
		gb1 = null;
		gb2 = null;
	}

	@Test
	void testGetScoreSize() {
		assertEquals(2, gb1.getScoreSize());
		assertEquals(2, gb2.getScoreSize());
		
	}

	@Test
	void testToString() {
		fail("Not yet implemented");
	}

	@Test
	void testAddScore() {
		assertTrue(gb1.toString().equals("98.9 86.5")); //should be 185.4 // minimum should be 86.5 // final should be 98.9
		assertTrue(gb2.toString().equals("81.7 93.2")); //should be 174.9 // minimum should be 81.7 // final should be 93.2
	}

	@Test
	void testSum() {
		assertEquals(185.4, gb1.sum(), .0001);
		assertEquals(174.9, gb2.sum(), .0001);
	}

	@Test
	void testMinimum() {
		assertEquals(86.5, gb1.minimum(), .001);
		assertEquals(81.7, gb2.minimum(), .001);
	}

	@Test
	void testFinalScore() {
		assertEquals(98.9, gb1.finalScore());
		assertEquals(93.2, gb2.finalScore());
	}

}
