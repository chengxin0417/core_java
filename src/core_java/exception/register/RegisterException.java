package core_java.exception.register;

public class RegisterException extends Exception {

	public RegisterException() {

	}

	public RegisterException(Throwable t) {
		super(t);
	}

	@Override
	public void printStackTrace() {
		// TODO Auto-generated method stub
		System.err.println("非常抱歉，系统繁忙，注册不成功，请稍后再试...");
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "非常抱歉，系统繁忙，注册不成功，请稍后再试...";
	}
}
