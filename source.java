import java.io.*;
import java.util.*;

class Game {
	Board[] boards;
	Dictionary dictionary;
	int score;
	Random r;

	void GenerateBoards(){return;} //needs Board Constructor
}

class Board {
	boolean played; //flag to see if the board has been played
	Line[] lines;
	Dictionary dictionary;
	Clue banked; //this is to store clues between lines

	boolean solved(){return true;}
	boolean lost(){return true;}
}

class Line {
	boolean played; //flag to see if the line has been played
	Chr[] chars;

	void ColorClues(){return;}
	void Prefil(){return;}
	void ReadPlayer(){return;}
	boolean CheckWord(){return true;}
}

class Chr {
	char chr;
	JLabel b;	

	void set(char a){
		chr=a;
		b.setText(chr);
	}

	void color(Clr a){return;}
}

class Dictionary {
	ArrayList<String> words;
	String word;
	Random r;

	boolean wordMatch(String s){
		return word.equals(s);
	}
	
	void newWord(){
		word = words.get(r.nextInt(words.size()));
	}

	void loadDictionary(String fileName) throws IOException{ 
	//copied from TP7
		//System.out.println("lire");
		BufferedReader in = null;
		try {
			// ouverture du fichier
			in = new BufferedReader(
				new FileReader(fileName)
			);
			// lecture des données
			String line = null;
			while ((line=in.readLine()) != null) {
				this.words.add(line);
			}
		} finally {
		// fermeture du fichier
			if (in != null)      
			in.close();
		}
	}

	Clue getClues(String s) {
		Clue out = new Clue();

		for(int i=0;i<s.size();i++){
			if(word[i]==s[i]){
				out.correct[i]=word[i];
			}
		}

		return out;
	}
}

class Clue {
	char[] correct; //letter correctly placed
	char[] inWord; //lerrer in the word

	void initCorrect(){
		for(char a : correct) {
			a=".";
		}
	}

	void Update (Clue newClue) {return;} //take in new clue info
}