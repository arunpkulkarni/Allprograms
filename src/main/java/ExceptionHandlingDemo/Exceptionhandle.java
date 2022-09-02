package ExceptionHandlingDemo;

import org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValueMDP;

public class Exceptionhandle {

	public static void main(String[] args) {
		//--------------

		
		//----------------
		
		try {
			System.out.println("HelloWorld");
			int i = 1/0;
			System.out.println("Completed");
			
		}
		catch(Exception e){
			
			System.out.println("I am inside catch block");
			
		}
		

	}

}
