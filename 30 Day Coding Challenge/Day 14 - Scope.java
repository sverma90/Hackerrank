import java.util.Scanner;

public class practice {	
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}

class Difference {
  	
	private int[] elements;
  	public int maximumDifference;

	// Add your code here
  	
	public Difference(int[] a) {
		// TODO Auto-generated constructor stub
		this.setElements(a); 
	}

	public void computeDifference() {
		// TODO Auto-generated method stub
		
        for (int i = 0; i <elements.length ; i++) {
            for (int j = 1; j <elements.length ; j++) {
                int x = elements[i];
                int y = elements[j];
                int diff = Math.abs(x-y);
                if(maximumDifference<diff)
                	maximumDifference = diff;
            }
        }
	}

	public int[] getElements() {
		return elements;
	}

	public void setElements(int[] a) {
		this.elements = a;
	}

} // End of Difference class