// @author Ivan Prusac

public class WordGame{
	// First we need to initialize instantiable variables
    private boolean valid;
	private String word;
	private int total;
	private String message;
	// Array of computer related words that are allowed to use in game
    private String compWords[] = {"algorithm", "application", "backup", "bit", "buffer", "bandwidth", "broadband", "bug", "binary", "browser", "bus",
"cache", "command", "computer", "cookie", "compiler", "cyberspace", "compress", "configure", "database",
"digital", "data", "debug", "desktop", "disk", "domain", "decompress", "development", "download", "dynamic",
"email", "encryption", "firewall", "flowchart", "file", "folder", "graphics", "hyperlink", "host", "hardware", "icon",
"inbox", "internet", "kernel", "keyword", "keyboard", "laptop", "login", "logic", "malware", "motherboard", "mouse",
"mainframe", "memory", "monitor", "multimedia", "network", "node", "offline", "online", "path", "process",
"protocol", "password", "phishing", "platform", "program", "portal", "privacy", "programmer", "queue",
"resolution", "root", "restore", "router", "reboot", "runtime", "screen", "security", "shell", "snapshot", "spam",
"screenshot", "server", "script", "software", "spreadsheet", "storage", "syntax", "table", "template", "thread",
"terminal", "username", "virtual", "virus", "web", "website", "window", "wireless"};

// Constructor with 3 variables
	public WordGame (){
		message = " ";
		valid = false;
		word = "";

	}


// Setter method for players input
	public void setWord(String myWord){
		word = myWord;}
// Getter method that shows if word is valid or invalid
	public String getMessage(){

		return message;}

// One more getter method that shows number of points for each word
	public int getPoints() {

		return total;}
// Function that transverse word from input and check if matches with words from array
public void checkWord(){
	    valid = false;
        for(int e = 0; e < compWords.length; e++){
            if(word.equalsIgnoreCase(compWords[e])){
		valid = true;}
		}

        if(valid) {
	   message = "Valid";
        }else if(!valid){
	  message = "Invalid";
  }
}


// Function that checks how many vowels are in word and awards 2 points for each double vowel
public void checkPoints(){
int countA = 0;
int countE = 0;
int countI = 0;
int countO = 0;
int countU = 0;

int len = word.length();



for (int i = 0; i < len; i++){

	               char c = word.charAt(i);
		                    if (c == 'a'){
			                    countA++;
                            } else if(c=='e'){
								countE++;
							} else if (c=='i'){
								countI++;
						    } else if (c=='o'){
								countO++;
						    } else if (c=='u'){
							    countU++;
							}
						    }
                            if (countA == 1){
								countA = 0;}

							if (countA>1){
								if (countA%2==0){

							}else {
								   countA = countA - 1;

                               }
						       }
						    if (countE == 1){
								countE = 0;}
							if (countE>1){
							if (countE%2==0){

							}else {
									countE = countE - 1;
									}
								    }
							if (countI == 1){
								countI = 0;}
							if (countI>1){
							if (countI%2==0){

							}else {
									countI = countI - 1;
									}
								    }
							if (countO == 1){
								countO = 0;}
						    if (countO>1){
								if (countO%2==0){

							}else {
									countO = countO - 1;
									}
								    }
							 if (countU == 1){
								countU = 0;}
							 if (countU>1){
								if (countU%2==0){

							}else {
								countU = countU - 1;
									}
									}
total = countA + countE + countI + countO + countU;
if (message.equals ("Invalid")){
	total=0;}
}
}





