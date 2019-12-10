package pckg;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

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
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(new File(this.fileName))));
        String line;
        while ((line = br.readLine())!=null){
                String[] Wordlist = line.split("[ ;.,!?\"]");
                while (!line.equals(Wordlist)){
                    System.out.println(line);
                }
        }
        return line;
        
		
	}
	@Override
	public void run() {
		try {
			for(String str : this.buf.data) {
				readWord();
			}
		}
		catch(Exception e) {
			
		}
	}

}
