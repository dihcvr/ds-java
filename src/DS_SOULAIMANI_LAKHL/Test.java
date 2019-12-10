package DS_SOULAIMANI_LAKHL;

import java.io.File;

public class Test {

    public static void main(String[] args) {

        String f = "file1.txt";
        String f2 = "file2.txt";
        MyBuffer buffer = new MyBuffer(100);
        Procssor procssor = new Procssor("Thread1",buffer);
        Procssor procssor2= new Procssor("Thread2",buffer);
        procssor.start();
        procssor2.start();
        new Lecteur(f,"Thread1",buffer).start();
        new Lecteur(f2,"Thread1",buffer).start();

    }
}