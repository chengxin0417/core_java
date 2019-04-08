package core_java.exception.printer;

public class OutOfPaperException extends Exception {

	private String reason; // 异常原因

	public OutOfPaperException() {

	}

	public OutOfPaperException(String reason) {
		this.reason = reason;
	}
	
	@Override
	public void printStackTrace() {
		// TODO Auto-generated method stub
		System.err.println("Exception happened, the cause is " + reason);
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Exception happened, the cause is " + reason;
	}
}
