import java.util.*;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}

class Student extends Person{
	private int[] testScores;
        
   /*    
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here
    
    public Student(String firstName, String lastName, int id, int[] testScores) {
        super(firstName, lastName, id);
        this.setTestScores(testScores);
    }
    
   /*    
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
    
    public String calculate() {
        int var = 0, val = 0;
        String grade = null;
        for(int i = 0; i < testScores.length; i++) {
            var += testScores[i];
        }
        val = var / testScores.length;

        if(val >= 90 && val <= 100) {
            grade = "O";
        }if(val >= 80 && val < 90) {
            grade = "E";
        }if(val >= 70 && val < 80) {
            grade = "A";
        }if(val >= 55 && val < 70) {
            grade = "P";
        }if(val >= 40 && val < 55) {
            grade = "D";
        }if(val < 40){
            grade = "T";
        }
        return grade;
    }
    
    public int[] getTestScores() {
        return testScores;
    }

    public void setTestScores(int[] testScores) {
        this.testScores = testScores;
    }
}

class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate());
	}
}