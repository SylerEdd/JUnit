//Enkhbaatar Idersaikhan 3112121
package griffith;

public class Calculator {

	// returns max grade
	public int gradesMax(int[] grades) {
		if(grades == null) {
			throw new IllegalArgumentException("Grades array cannot be null or empty.");
		}
		//returning 0 for empty array
		if(grades.length == 0) {
			return 0;
		}
		int max = grades[0];
		for(int grade : grades) {
			if(grade>max) {
				max = grade;
			}
		}
		return max;
	}
	
	// returns total of the grades
	public int gradesTotal(int[]grades) {
		if(grades == null) {
			throw new IllegalArgumentException("Grades array cannot be null");
		}
		int total = 0;
		for(int grade : grades) {
			total +=grade;
		}
		return total;
	}
	
	//returns the average of the grades
	public double gradesAverage(int[]grades) {
		if(grades == null) {
			throw new IllegalArgumentException("Grades array cannot be null");
		}
		if(grades.length == 0) {
			return 0.0;
		}
		return (double)gradesTotal(grades) / grades.length;		
	}
	
	//returns the count of fails 
	public int countFails(int [] grades, int minGrade) {
		if(grades == null) {
			throw new IllegalArgumentException("Grades array cannot be null");
		}
		int count = 0;
		for(int grade : grades) {
			if(grade<minGrade) {
				count++;
			}
		}
		return count;
	}
}
