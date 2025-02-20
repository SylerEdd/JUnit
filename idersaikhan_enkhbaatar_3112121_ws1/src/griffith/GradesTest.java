package griffith;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GradesTest {

	Calculator calculator = new Calculator();
	
	@Test
	public void testGradesMax(){
		//testing with positive values
		int[]grades1 = {70,85,92};
		assertEquals(92, calculator.gradesMax(grades1));
		
		//testing with negative values
		int[] grades2 = {-10, -5, -20};
		assertEquals(-5, calculator.gradesMax(grades2));
		
		//testing with null values
		int[] grades3 = {};
		assertEquals(0, calculator.gradesMax(grades3));
	}
	
	@Test
	public void testGradesTotal() {
		//testing with positive values
		int[]grades1 = {70,85,90};
		assertEquals(245, calculator.gradesTotal(grades1));
		
		//testing with negative values
		int[] grades2 = {-10, -5, -20};
		assertEquals(-35, calculator.gradesTotal(grades2));
		
		//testing with null values
		int[] grades3 = {};
        assertEquals(0, calculator.gradesTotal(grades3));
	}
	
	@Test
	public void testGradesAverage() {
		//testing with positive values
		int[]grades1 = {70,80,90};
		assertEquals(80.0, calculator.gradesAverage(grades1));
		
		//testing with negative values
		int[] grades2 = {-10, -30, -20};
		assertEquals(-20.0, calculator.gradesAverage(grades2));
		
		//testing with null
		int[] grades3 = {};
        assertEquals(0.0, calculator.gradesAverage(grades3));
        
	}
	
	@Test
	public void testCountFails() {
		//testing pass grades and fail grades together
		int[] grades1 = {55, 65, 75, 45};
		int minGrade1 = 59;
		assertEquals(2, calculator.countFails(grades1, minGrade1));
		
		//testing only pass grades
		int[] grades2 = {70, 80, 100};
		int minGrade2 = 59;
		assertEquals(0, calculator.countFails(grades2, minGrade2));
		
		//testing only fail grades
		int [] grades3 = {40, 45, 58};
		int minGrade3 = 59;
		assertEquals(3, calculator.countFails(grades3, minGrade3));
		
		
	}

}
