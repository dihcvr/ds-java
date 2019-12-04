package pckg;

import java.util.HashMap;
import java.util.Set;

public class Processor implements Runnable{
	
	private String PName;
	private MyBuffer buff;
	HashMap<String, Integer> wordsCounts = new HashMap<>();
	
	public Processor(String PName, MyBuffer buff) {
		this.PName = PName;
		this.buff= buff;
	}
	public HashMap<String, Integer> getWordsCounts(){
		return this.wordsCounts;
	}
	public void processe() {
		
		String word = this.buff.data.removeFirst();
		Set <String> setN = this.wordsCounts.keySet();
		int cmp = 1;
		if(!setN.isEmpty()) {
			for(String str: setN) {
				if(str == word) {
					 cmp = this.wordsCounts.get(word)+1; 
					 break;
					 //this.wordsCounts.put(d, this.wordsCounts.get(word)+1);
				}
			}
		}
		this.wordsCounts.put(word, cmp);
	}
	@Override
	public void run(){
		try {
			for(String str : this.buff.data) {
				processe();
			}
		}
		catch(Exception e) {
			
		}
			
		
	}

}
