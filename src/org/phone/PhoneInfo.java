package org.phone;

public class PhoneInfo {
	private void phoneName() {
		System.out.println("Phone Name: Vivo");
	}
	private void phoneMieiNum() {
		System.out.println("Phone IMEI Num: 12345678910111");
	}
	private void camera() {
		System.out.println("Phone Camera: 48MP");
	}
	private void storage() {
		System.out.println("Phone Storage: 64GB");
	}
	private void osName() {
		System.out.println("OS Name: Funtouch OS");
	}
	public static void main(String[] args) {
		PhoneInfo p = new PhoneInfo();
		p.phoneName();
		p.phoneMieiNum();
		p.camera();
		p.storage();
		p.osName();
	}

}
