package ioserialization;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyboardToFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("entered main");
		
		String data=null;
		InputStreamReader isr = new InputStreamReader(System.in);//reading input to the program
		BufferedReader reader = new BufferedReader(isr);
		
		FileWriter writer=new FileWriter("Nammadefile.txt");
		System.out.println("Enter some text");// main is blocked here then after enter input execuets 15
		data=reader.readLine();
		while(!data.equals("quit")) {
			
			//System..println("you have entered ..."+);
			writer.write(data);
			data=reader.readLine();
		}
		writer.flush();
		writer.close();
		reader.close();
		System.out.println("main existed..");
		

	}

}
