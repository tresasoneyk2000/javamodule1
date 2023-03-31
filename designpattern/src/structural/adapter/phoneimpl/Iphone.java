package structural.adapter.phoneimpl;

import structural.adapter.phoneifaces.LightningPhone;

public class Iphone implements LightningPhone {
	private boolean connector;
	@Override
	public void recharge() {
		if(connector) {
			System.out.println("recharge started");
			System.out.println("Recharge finished");
		}

	}

	@Override
	public void useLightning() {
		connector=true;
		System.out.println("iphone connected ");

	}

}
