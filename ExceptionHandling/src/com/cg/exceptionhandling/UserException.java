package com.cg.exceptionhandling;

class ApplicationException extends Exception{
	private int detail;
	
	public ApplicationException(int a) {
		detail =a;
	}
	
	@Override
	public String toString() {
		return " ApplicationException [detail =" + detail + "]";
	}
}


public class UserException {
	static void compute(int a) throws ApplicationException {
		System.out.println("called compute(" + a + ")");
		if (a>10)
			throw new ApplicationException(a);
		System.out.println("normal exit");
	}

	public static void main(String[] args) throws ApplicationException {
		try {
			//compute(1);
			compute(20);
		} finally { // finally block is executed irrespective of whether exception is occured or not
			System.out.println("inside finally block of code");
		}
//		catch (ApplicationException e) {
//			System.out.println("exception is caught "+e);
//		}
		// without try block finally and catch will not work 
	}
 
}

/*Remember -
 * try
 * catch
 * finally 
 * throw 
 * throws 
 */
