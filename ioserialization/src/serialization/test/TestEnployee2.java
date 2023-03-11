package serialization.test;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;

public class TestEnployee2 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub

		FileInputStream fis= new FileInputStream("D:\\ustcore\\ioserialization\\emp.dat");//to write input stream is used to write
	
	ObjectInputStream ois = new ObjectInputStream(fis);//inputstream to read
	Object obj=ois.readObject();
	Employee ref=(Employee)obj;
	System.out.println(ref);
			//String str="helloworld"
	//String str="helloworld"
	//STRING STR="HELLOWORLD"
	
	
	
	}

}
