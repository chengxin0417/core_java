package core_java.exception.atm;

public class AtmException extends Exception {

	private String reason;

	public AtmException() {

	}

	public AtmException(String reason) {
		this.reason = reason;
	}
	
	@Override
	public void printStackTrace() {
		// TODO Auto-generated method stub
		System.err.println(reason);
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return reason;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

}
