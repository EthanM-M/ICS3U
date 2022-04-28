
import java.util.Scanner;
public class U4A4 {

	public static void main(String[] args) {
		

		Scanner scanner = new Scanner(System.in);
		
		welcome();
		System.out.print("Enter Phrase (6 Words max): ");
		String phrase = scanner.nextLine();
		System.out.println("");
		System.out.println("Your Phrase Converted: ");
		System.out.println("UPPER: " + phrase.toUpperCase());
		System.out.println("lower: " + phrase.toLowerCase());
		countWords(phrase);
		alternate(phrase);
		vowelsNum(phrase);
		vowelsUpper(phrase);
		reverse(phrase);
		besandthes(phrase);
		stack(phrase);
			
	}

    public static void countWords(String phrase) {
    	final int OUT = 0;
        final int IN = 1;
        int state = OUT;
        int wc = 0;
        int i = 0;
        while (i < phrase.length())	{
            if (phrase.charAt(i) == ' ' || phrase.charAt(i) == '\n'
                    || phrase.charAt(i) == '\t')
                state = OUT;          
            else if (state == OUT) {
                state = IN;
                ++wc;
            }
            ++i;
        }
        System.out.println("# of Words: " + wc);
    }	
    
    public static void alternate(String phrase) {
	    String sample = phrase; 
	    StringBuffer updatedString = new StringBuffer(); 
	    char[] characters = sample.toCharArray(); 
	    for (int index = 0; index < characters.length; index++) { 
	      char c = characters[index]; 
	      if (index % 2 != 1) {  
	        c = Character.toUpperCase(c); 
	      } 
	      updatedString.append(c); 
	    } 
	    System.out.print("Mix #1: " + updatedString.toString()); 
    }
    
    public static void vowelsNum(String phrase) {
    	String line = phrase;
	    int vowels = 0;
	    line = line.toLowerCase();
	    for (int i = 0; i < line.length(); ++i) {
	      char ch = line.charAt(i);
	      if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	        ++vowels;
	      	}
	    }
	      System.out.println(" ");
	      System.out.println("# of Vowels: " + vowels + " vowels");
    }
    
    public static void vowelsUpper(String phrase) {
        String str = phrase;
        System.out.println("Mix #2: " + str.replaceAll("a", "A").replaceAll("e", "E").replaceAll("i", "I").replaceAll("o", "O").replaceAll("u", "U"));
    }
    
    public static void reverse(String phrase) {
        String str = phrase, nstr="";
        char ch;
      for (int i=0; i<str.length(); i++)
      {
        ch= str.charAt(i);
        nstr= ch+nstr;
      }
      System.out.println("Reverse: "+ nstr);
    }
    
    public static void besandthes(String phrase) {
		String str = phrase;
		String word = "be";
		String word1 = "the";
	    String a[] = str.split(" ");
	    int count = 0;
	    for (int i = 0; i < a.length; i++){
	    if (word.equals(a[i])|| word1.equals(a[i]))
	        count++;
	    } 
	  System.out.println("# of be's and the's: " + count); 
    }
    
    public static void stack(String phrase) {
    	  int mid = phrase.length()/2;
    	  int space = mid+2;
    	  if(phrase != null){
    	        for(int i = 0; i < phrase.length(); i++){
    	            if(Character.isWhitespace(phrase.charAt(i))){
    	            	System.out.println("Word Stack: Hey man, you can't do that!");
    	            	return;
    	            }
    	        }
    	    }
    	    int no = 1;
    	    
    	  System.out.print("Word Stack: ");
    	  if(phrase.length()%2!=1 && no == 1) {
    	  for(int i = 0; i<=mid; i++) {
    		  for(int k = space; k>0; k--) {
    			  System.out.print(" ");
    		  }
    		  	space--;
    			  System.out.println(phrase.substring(mid-i,mid+i));
    	  		}
    	  	
    	  }else{
    		  System.out.println("Hey man, you can't do that!");
    	  }
    }
	
	public static void welcome() {
					
					Scanner scanner = new Scanner(System.in);
					
					System.out.println("Welcome to Change That Message!");
					System.out.println(" ");
					System.out.println("(\\ \r\n"
							+ "\\'\\ \r\n"
							+ " \\'\\     __________  \r\n"
							+ " / '|   ()_________)\r\n"
							+ " \\ '/    \\ ~~~~~~~~ \\\r\n"
							+ "   \\       \\ ~~~~~~   \\\r\n"
							+ "   ==).      \\__________\\\r\n"
							+ "  (__)       ()__________)");
					System.out.println(" ");
					
				}

}