import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ProblemSolution {
	public static void main(String args[]) { 
		ArrayList<Data> data = new ArrayList<>();
		ArrayList<String[]> words = new ArrayList<>();
		
		String line; 
		ArrayList<String> mostUsed = new ArrayList<>();
		int totalWords = 0, repeatedWords = 0, uniqueWords = 0, highestFreq = 0;
		
		Scanner in = new Scanner(System.in); 
		
		String passage = in.nextLine(); // read input passage 
		String delims = "\\W+"; // split any non word 
		words.add(passage.split(delims));

		for(String[] wordArray : words){
			for(int i = 0; i<wordArray.length; i++){
				wordArray[i] = wordArray[i].trim(); 
			}
		}
		
		for(String[] wordArray : words){
			//Loops through every word in the array
			for(int i = 0; i<wordArray.length; i++){
				//Finds its frequencies
				boolean found = false;
				for(int j = 0; j<data.size(); j++){
					//If word already exists in 'data' increments its frequency by 1
					if(data.get(j).getWord().equals(wordArray[i])){
						found = true;   
						data.get(j).setFreq(data.get(j).getFreq() + 1);
					}
				}
				//If word not found in list
				if(!found)
					//Adds a new Data object with the word to list
					data.add(new Data(wordArray[i]));
			}
		}   
		
		Collections.sort(data, Data.WordComparator); 
		
		Iterator it = data.iterator();
		
		while(it.hasNext()) {
			Data temp = (Data) it.next();
			System.out.println(temp.getWord() + "(" + temp.getFreq() + ")");
			totalWords += temp.getFreq();
			if(temp.getFreq() > 1)
				repeatedWords += 1;
			if(temp.getFreq() >= 1)
				uniqueWords += 1;
			if(temp.getFreq() > highestFreq){
				highestFreq = temp.getFreq();
				
			}		
			}

		
		System.out.print("\nTotal words: " + totalWords);
		System.out.println("\nNumber of Repeated words: " + repeatedWords);
		System.out.println("Number of Unique words: " + uniqueWords);
		
		
		Iterator it2 = data.iterator();
		while(it2.hasNext()) {
			Data temp = (Data) it2.next();
			if(temp.getFreq() == highestFreq) {
				mostUsed.add(temp.getWord());
			}
				
				
		}
		
		Iterator it3 = mostUsed.iterator();
		
		if(mostUsed.size() > 1) {
			System.out.print("Most used word: " + it3.next());
			while(it3.hasNext()) {
				System.out.print(", " + it3.next());
			}
		}else {
			System.out.print("Most used word: " + it3.next());
		}
		
	} 
	

}
