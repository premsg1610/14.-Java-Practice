package com.Day14_Q3;

public final class Main {              //final class

	final int x = 0;        //final variable
	
//	final method
	public final void printHello() {
		System.out.println("Hello");
	}
	
	
	
	public void calculateFraction() {
		
		int num1 = 5;
		int num2 = 0;
		
		double fraction = num1 / num2;
		
		System.out.println(fraction);
	}
	
	
	
	public static void main(String[] args) {
		
		
		Main m = new Main();
		
		try {
			
		   m.calculateFraction();
//		   return ;
		}
		catch(ArithmeticException ae){
			
//			ae.printStackTrace();
			System.out.println(ae.getMessage());
		}
		finally {                           //finally
			
			System.out.println("inside finally block");
		}
		
		System.out.println("End of main");
	}
}

/*
Q3) Explain Finally and Final Keyword with an Example?

Ans: finally: this keyword represent that our code block will execute irrespective of the
              try-catch block
              i.e. 
            > it will always run except when we terminate our program using System.exit(0)
              or System.exit(1).
              
            > it is a block of code,used only with try and catch block.
          
            > if we return our code in try or catch block then also compiler will check
              for finally keyword and if found it will execute and then control will
              come out from our code.
              
            > example is shown above in try catch finally block.
        
               
     final: we can use final with :
            1. variable
            2. methods
            3. class
            
            > if we use final with class then we can not extend it further.
            > i.e final class doesn't have child classes.
            
            > if we use final with variable then we can not re-assign them and it should
              be initialized at the time of declaration.
            
            > if we define method as final, we can't override that method inside their
              child class.
              
            > example:- Main class is final class, we have final method printHello() and
                        final variable x.
            


*/
