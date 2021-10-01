import java.io.FileNotFoundException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
 
public class test {
     
    public static void main(String[] args) throws IOException,  FileNotFoundException, InterruptedException {	
		String name; 
		try {
			File file = new File(args[0]);
		    Scanner scan = new Scanner(file);
		    FileWriter myWriter = new FileWriter(args[1], false);
	        try {
		    while( scan.hasNextLine() ){
		    	name = scan.nextLine();
				myWriter.write("Postfix Expression: " + name);
				myWriter.write("\nMachine Instructions Below:\n");
				myWriter.write(postfixToMachineInstruction(name));
				myWriter.write("\n\n");
		    }
			
		    myWriter.close();
		    }catch (IOException e) {
		        System.out.println("An error occurred.");
		        e.printStackTrace();
		      }
		
		 	try {
		        myWriter.close();
		        System.out.println("Successfully wrote to the file.");
		      } catch (IOException e) {
		        System.out.println("An error occurred.");
		        e.printStackTrace();
		      }
			scan.close(); 
            } catch(Exception e) { 
				e.printStackTrace();
			} 
    }
    
    public static String postfixToMachineInstruction(String expression){
        char c=0;
		String var0="", var1="", var2="", var3="";
		int count = 0; 
		
		//String postfix = expression;	//ABC*+DE-/
		String fullOutput = ""; 
		Stack stack = new Stack(expression.length());
		for (int i = 0; i < expression.length() ; i++) {
			c = expression.charAt(i);
			
			if(c=='+'){
				var1 = stack.pop();
				var0 = stack.pop();
				if(var1 == "Stack Empty" || var0 == "Stack Empty"){
					var3 = "Expression is not in postfix format.";
					fullOutput+=var3;
				}else{ 
				count=count+1; 
				var2 = "TEMP" + String.valueOf(count);
				var3 = "LD\t" + var0 + "\n" + "AD\t" + var1 + "\n" + "ST\t" + var2 + "\n";
				stack.push(var2);
				fullOutput += var3;
				}
				//System.out.println(var3);
			}
			else if(c=='-'){
				var1 = stack.pop();
				var0 = stack.pop();
				if(var1 == "Stack Empty" || var0 == "Stack Empty"){
					var3 = "Expression is not in postfix format.";
					fullOutput+=var3;
				}else{ 
				count=count+1; 
				var2 = "TEMP" + String.valueOf(count);
				var3 = "LD\t" + var0 + "\n" + "SB\t" + var1 + "\n" + "ST\t" + var2 + "\n";
				stack.push(var2);
				fullOutput +=  var3;
				}
				//System.out.println(var3);
			}
			else if(c=='*' || c=='$'){
				var1 = stack.pop();
				var0 = stack.pop();
				if(var1 == "Stack Empty" || var0 == "Stack Empty"){
					var3 = "Expression is not in postfix format.";
					fullOutput+=var3;
				}else{ 
				count=count+1; 
				var2 = "TEMP" + String.valueOf(count);
				var3 = "LD\t" + var0 + "\n" + "ML\t" + var1 + "\n" + "ST\t" + var2 + "\n";
				stack.push(var2);
				fullOutput +=  var3;
				}
				//System.out.println(var3);
			}
			else if(c=='/'){
				var1 = stack.pop();
				var0 = stack.pop();
				if(var1 == "Stack Empty" || var0 == "Stack Empty"){
					var3 = "Expression is not in postfix format.";
					fullOutput+=var3;
				}else{ 
				count=count+1; 
				var2 = "TEMP" + String.valueOf(count);
				var3 = "LD\t" + var0 + "\n" + "DV\t" + var1 + "\n" + "ST\t" + var2 + "\n";
				stack.push(var2);
				fullOutput +=  var3;
				}
				//System.out.println(var3);
			}
			else if (c >= 'A' && c <= 'Z') {
				stack.push(c+"");
			}
			else {
				System.out.println("Error in postfix expression.");
			}
			//System.out.println(var3);
		}
		return fullOutput;
    }
}
