package java_compiler_errors;

public class CompilerErrors {
	public static void main(String[] args) {
		//String var1 = 'Hello World!'; //Invalid Character Constant single quotes
		int var2 = 9.83; //Cannot convert from double to int
		String 3var = "Hello World!"; //Syntax error on token "3"
		boolean var4 = false;
		
		if (!var4) {
			String var5 = "I am declared in an if statement";
		}
		
		String var6 = var5.concat("and I'm concatenated outside of it"); //var5 cannot be resolved
		
		System.out.printf("%s /n", var1); //var1 cannot be resolved to a variable
		System.out.printf("%s /n", var2);
		System.out.printf("%s /n", 3var);
		System.out.printf("%s /n", var4);
		System.out.printf("%s /n", var5);
		System.out.printf("%s /n", var6);
	}
}
