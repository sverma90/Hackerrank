import java.util.Scanner;

public class practice {	
	
	// properties
	
	Node head;
	int count;
	
	//constructors
	
	//methods
		
	//add/insert
    public static Node insert(Node head,int data) {
        //Complete this method
    	    	
    	Node temp = new Node(data);
    	
    	temp.next = head;
    	temp.data = data;
    	
    	if(head == null) {
    		head = temp; 
    	}else if(head.next == null){
    		head.next = new Node(data);
    	}else {
    		insert(head.next, data);
    	}
    	    	
		return head;
    }
	
    //display
	public static void display(Node head) {
	    Node start = head;
	    while(start != null) {
	        System.out.print(start.data + " ");
	        start = start.next;
	    }
	}
	
	//main
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    Node head = null;
	    int N = sc.nextInt();
	
	    while(N-- > 0) {
	        int ele = sc.nextInt();
	        head = insert(head,ele);
	    }
	    display(head);
	    sc.close();
	}
}