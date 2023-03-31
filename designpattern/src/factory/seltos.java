package factory;

public class seltos implements vehicle {

	@Override
	public void start() {
		System.out.println("stated...."+getClass());

	}

	@Override
	public void stop() {
		System.out.println("stopped....."+getClass());

	}

	@Override
	public void honk() {
		System.out.println("Pala, palm....."+getClass());

	}

	@Override
	public void move() {
		System.out.println("its moving....."+getClass());

	}

}
