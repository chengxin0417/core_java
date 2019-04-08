package core_java.exception.printer;

public class OutOfInkException extends Exception {

	
	@Override
	public void printStackTrace() {
		// TODO Auto-generated method stub
		System.err.println("Exception happened, please change Ink.");
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Exception happened, please change Ink.";
	}
}
