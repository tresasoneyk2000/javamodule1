package source.use.mod;
import source.mod.HelloWorld;

public class UseHelloWorld {
	public static void main(String[] args) {
		double d=10.0;
		try {
			HelloWorld world = new HelloWorld();
			world.mesage();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
