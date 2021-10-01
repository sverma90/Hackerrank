import java.io.IOException;

//path: /Users/soumilverma/Desktop/Java/input.txt

public class Main {	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		char c=0;
		String var0="", var1="", var2="", var3="";
		int count = 0; 
		
		String postfix = "AB+C-";	//ABC*+DE-/
		
		Stack stack = new Stack(postfix.length());
		for (int i = 0; i <postfix.length() ; i++) {
			c = postfix.charAt(i);
			if(c=='+'){
				var1 = stack.pop();
				var0 = stack.pop();
				count=count+1; 
				var2 = "TEMP" + String.valueOf(count);
				var3 = "LD\t" + var0 + "\n" + "AD\t" + var1 + "\n" + "ST\t" + var2;
				stack.push(var3);
				System.out.println(var3);
			}
			else if(c=='-'){
				var1 = stack.pop();
				var0 = stack.pop();
				count=count+1; 
				var2 = "TEMP" + String.valueOf(count);
				var3 = "LD\t" + var0 + "\n" + "SB\t" + var1 + "\n" + "ST\t" + var2;
				stack.push(var3);
				System.out.println(var3);
			}
			else if(c=='*'){
				var1 = stack.pop();
				var0 = stack.pop();
				count=count+1; 
				var2 = "TEMP" + String.valueOf(count);
				var3 = "LD\t" + var0 + "\n" + "ML\t" + var1 + "\n" + "ST\t" + var2;
				stack.push(var3);
				System.out.println(var3);
			}
			else if(c=='/'){
				var1 = stack.pop();
				var0 = stack.pop();
				count=count+1; 
				var2 = "TEMP" + String.valueOf(count);
				var3 = "LD\t" + var0 + "\n" + "DV\t" + var1 + "\n" + "ST\t" + var2;
				stack.push(var3);
				System.out.println(var3);
			}
			else {
				stack.push(c+"");
			}
			//System.out.println(var3);
		}	
	}
}	
