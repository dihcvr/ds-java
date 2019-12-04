package pckg;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lecteur implements Runnable{
	private String theadName;
	private String fileName;
	private MyBuffer buf;
	
	public Lecteur(String theadName, String fileName, MyBuffer buf) {
		this.theadName = theadName;
		this.fileName = fileName;
		this.buf = buf;
	}
	public String readWord() throws Exception {
		FileInputStream fis = new FileInputStream(new File(this.fileName)); 
		int c;
		String str = "";
		String t;
		while((c = fis.read()) >= 0) {
			str += c;
		}
		return str.split("[ .]");
	}
	@Override
	public void run() {
		
		
	}

}
