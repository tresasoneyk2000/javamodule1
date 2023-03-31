package structural.adapter.phoneimpl;

import structural.adapter.phoneifaces.MicroUsbPhone;

public class Android implements MicroUsbPhone {
	private boolean connector;

	@Override
	public void recharge() {
		if(connector) {
			System.out.println("recharge started");
			System.out.println("Recharge finished");
		}
		
	}

	@Override
	public void useMicroUsb() {
		connector=true;
		System.out.println("Microusb connected ");


	}

}
