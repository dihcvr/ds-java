package pckg;
import java.io.File;
import java.io.FileInputStream;


public class Test {

	public static void main(String[] args) throws Exception {
		String f = "file1.txt";
        String f2 = "file2.txt";
        MyBuffer buffer = new MyBuffer(10);
        Processor p1 = new Processor("p1", buffer);
        Processor p2 = new Processor("p2", buffer);
        
        new Thread(p1).start();
        new Thread(p2).start();
        
        String l1 = new Lecteur(f,"l1", buffer).readWord();
        String l2 = new Lecteur(f,"l2", buffer).readWord();
        
        new Thread(l1).start();
        new Thread(l2).start();
        
        
	}

}
