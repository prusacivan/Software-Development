// @author Ivan Prusac

public class LoginNameBuilder{
 // at beginning we need to declare instance variables
 private String name;
 private String loginName;
// here we declare setter method
 public void setName(String name){
 		this.name = name;
	}

public LoginNameBuilder() {
}
// here is getter method
public String getLoginName(){
		return loginName;
	}

public void logBuild (){

     // if we want to modify sNameFname we need to use StringBuffer
	 StringBuffer sb = new StringBuffer();

	 //next we move to traversing the word
	 for (int i = 0; i < name.length(); i++){
	// we use if statement to change name and surname to login name
		 char b = name.charAt(i);
		if (b == 'b' || b == 'c' || b == 'd' || b == 'f' || b == 'g' || b == 'h' || b == 'j'|| b == 'k'|| b == 'l'|| b == 'm'|| b == 'n'|| b == 'p'|| b == 'r'|| b == 's' || b == 't' || b == 'v'|| b == 'w'|| b == 'x'|| b == 'y'|| b == 'z' ){
						sb.append("");
					} else if (b == ' '){
						sb.append("");

					} else {
				sb.append(b);
}
}
		loginName = sb.toString();

 }




}