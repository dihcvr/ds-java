package pckg;

import java.util.LinkedList;

public class MyBuffer {
	private int size;
	LinkedList<String> data = new LinkedList<String>();
	
	public MyBuffer(int size) {
		this.size = size;
	}
	
	public void addWord(String str) {
		if (data.size()>this.size) {
			data.add(str);
		}
	}
	
}
