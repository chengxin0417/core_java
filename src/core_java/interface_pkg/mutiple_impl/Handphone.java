package core_java.interface_pkg.mutiple_impl;

public class Handphone implements Camera, Computer, Phone {

	@Override
	public void takePhone() {
		// TODO Auto-generated method stub
		System.out.println("手机可以拍照...");
	}

	@Override
	public void accessInternet() {
		// TODO Auto-generated method stub
		System.out.println("手机可以上网...");
	}

	@Override
	public void takePhoto() {
		// TODO Auto-generated method stub
		System.out.println("手机可以拍照...");
	}

}
