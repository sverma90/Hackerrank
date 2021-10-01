//Source: https://gist.github.com/alimranahmed/d812e1b5e3318b0d0642
// https://www.tutorialspoint.com/javaexamples/data_stack.htm
// clear a stack: https://stackoverflow.com/questions/1717570/clear-methods-in-java

public class Stack {
	int top;            				//define top of stack
    int stackSize;    	  				//size of the stack
    String[] stackArray;  				//define array that will hold stack elements
    String previousPopVal;
    
    public Stack(int val) {
    	top = -1;
    	this.stackSize = val;
    	stackArray = new String[val];	//using constructor to set length of array, # of elements
    }
    
    //created it just for testing
    public void String() {
    	System.out.println(stackArray.length);
    }
    
    //isEmpty() method    
    boolean isEmpty(){         			
        return (top < 0);  
    }  
    
    //push() method
    boolean push (String str){     			  
        if(top == stackSize-1) {  
            System.out.println("Stack Overflow!!!");
            return false;  
        }  
        else  {  
            top++;  
            stackArray[top]=str;  
            return true;  
        }  
    }
    
    //pop() method ( was boolean )
    String pop () {            
        if (top == -1) {  
            //System.out.println("Stack Underflow !!");  
            return "Stack Underflow!!!";  
        }  
        else   {  
            previousPopVal = stackArray[top--];
        	//System.out.println("Item popped: " + previousVal);
        	return previousPopVal;
            //return true;  
        }  
    }
    
    //print the stack elements 
    void display () {            
        System.out.print("Stack Items: ");  
        for(int i = top; i>=0;i--) {  
            System.out.print(stackArray[i] + " ");  
        }
        System.out.println();
    }
    
    //clears the stack
    //NOT WORKING - supposed to remove every element, not replace with null based on stack length
    void clear() {
    	for (int i = 0; i < stackArray.length; i++)
    		stackArray[i] = null;
    }

    //count the elements in a stack
    int count() {
    	return stackSize;
    }
    
    //Getters and Setters
	public int getStackSize() {
		return stackSize;
	}

	public void setStackSize(int stackSize) {
		this.stackSize = stackSize;
	}
}