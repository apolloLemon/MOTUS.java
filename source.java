class Game {
	Board[] boards;
	Dictionary dictionary;
	int score;

	void GenerateBoards(){return;}
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
	char[] chars;

	void ColorClues(){return;}
	void Prefil(){return;}
	void ReadPlayer(){return;}
	boolean CheckWord(){return;}
}

class Dictionary {
	ArrayList<String> words;
	String word;

	boolean wordMatch(String s){return true;}
	void newWord(){return;}

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

	Clue getClues() {return new Clue();}
}

class Clue {
	char[] correct; //letter correctly placed
	char[] inWord; //lerrer in the word

	void Update (Clue new) {return;} //take in new clue info
}