package day14_ExceptionHandling;

public class CheckedExceptionDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Program is started");
		System.out.println("Program is in process...");

//		try {
//			Thread.sleep(5000);
//		} 
//		catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		
		Thread.sleep(5000);
	
		System.out.println("Program is finished");
		System.out.println("Program is Terminated...");
		
	}

}
