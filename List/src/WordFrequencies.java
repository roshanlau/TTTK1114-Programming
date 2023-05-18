import java.util.ArrayList;
import java.util.*;

public class WordFrequencies {
	public static void main(String[] args){
		//Required variables
		String line, mostUsed = "";
		int totalWords = 0, repeatedWords = 0, uniqueWords = 0, highestFreq = 0;

		//Scanner object to read input from the user
		Scanner s = new Scanner(System.in);
		//Array lists to hold array of words and Data objects
		ArrayList<String[]> words = new ArrayList<>();
		ArrayList<Data> data = new ArrayList<>();

		//Reads input from user till user enters an empty line
		while(!(line = s.nextLine()).equals("")){
			//Splits the line to array of words separated by space
			words.add(line.split(" "));
			//Loops through each word in array
			for(String[] wordArray : words){
				//Removes extra punctuation
				for(int i = 0; i<wordArray.length; i++){
					wordArray[i] = wordArray[i].replace(".", "");
					wordArray[i] = wordArray[i].replace("?", "");
					wordArray[i] = wordArray[i].replace(",", "");
					wordArray[i] = wordArray[i].replace("!", "");
				}
			}
		}
		//Loops through each array of words
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
		//Sorts the list of Data objects by 'WordComparator'
		Collections.sort(data, Data.WordComparator);
		//Prints the words from array list
		for(Data word : data){
			System.out.println(word.getWord() + "(" + word.getFreq() + ")");
			//Calculates word analytics
			totalWords += word.getFreq();
			if(word.getFreq() > 1)
				repeatedWords += 1;
			if(word.getFreq() >= 1)
				uniqueWords += 1;
			if(word.getFreq() > highestFreq){
				highestFreq = word.getFreq();
				mostUsed = word.getWord();
			}
		}

		//Displays output
		System.out.println("Total words: " + totalWords);
		System.out.println("Number of repeated words: " + repeatedWords);
		System.out.println("Number of unique words: " + uniqueWords);
		System.out.println("Most used word: " + mostUsed);
	}
}