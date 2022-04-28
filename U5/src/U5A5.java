//Ethan Martinez-Mar
//U5A5 Who's a Winner?

import java.util.Scanner;
public class U5A5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner scanner = new Scanner(System.in);
		
		welcome();
		
		//Number of Players
		System.out.println("");
		System.out.print("Enter Number of Players: ");
		String playernum = scanner.nextLine();
		int pn = Integer.parseInt(playernum);
		System.out.println("");
		
		//Variables
		String names [] = new String[pn]; 
		int scores [] = new int[pn];
		String value;
		
		//New PLayers
		for(int i=0; i<names.length; i++) {
			System.out.print("Enter Name #" +(i+1)+": ");
			names[i] = scanner.nextLine();
			System.out.print("Enter Score #" +(i+1)+": ");
			value = scanner.nextLine();
			scores[i] = Integer.parseInt(value);
	}
		
		//Calling Methods	
			System.out.println("");
			System.out.println("-<>-<>-<>-<>-<>-<Statistics>-<>-<>-<>-<>-<>-");
			System.out.println("");
			System.out.println("Wins: " + printScores(scores));
			System.out.println("Most Wins: "+ maxScores(scores));
			System.out.println("Least Wins: "+ minScores(scores));
			System.out.println("Wins (Lowest to Highest): " + sortScoresLtoH(scores));
			System.out.println("Wins (Highest to Lowest): " + sortScoresHtoL(scores));
			System.out.printf("Average: %.1f", average(scores));
			System.out.printf("Median: %.1f", median(scores));
			System.out.print("Longest Name: " + longestName(names));
			graphWins(names,scores);
		
	}
	
	//prints player wins
	public static String printScores(int scores[]) {
		String sl = "";
		for(int i=0; i<scores.length; i++) {
			sl+=(scores[i]+(i!=scores.length-1?",":""));
		}
		return sl;
	}
	
	//prints highest number of wins
	public static int maxScores(int scores[]) {
		int[] clone= new int [scores.length];
		for(int i=0; i<clone.length; i++) {
			clone[i]=scores[i];
		}
	      int temp;
	      for(int i = 0; i<clone.length; i++ ){
	         for(int j = i+1; j<clone.length; j++){
	            if(clone[i]>clone[j]){
	               temp = clone[i];
	               clone[i] = clone[j];
	               clone[j] = temp;
	            }
	         }
	      }
	      return clone[clone.length-1];
	}
	
	//prints lowest number of wins
	public static int minScores(int scores[]) {
		int[] clone= new int [scores.length];
		for(int i=0; i<clone.length; i++) {
			clone[i]=scores[i];
		}
	      int temp;
	      for(int i = 0; i<clone.length; i++ ){
	         for(int j = i+1; j<clone.length; j++){
	            if(clone[i]>clone[j]){
	               temp = clone[i];
	               clone[i] = clone[j];
	               clone[j] = temp;
	            }
	         }
	      }
	      return clone[0];
	}
	
	//prints numbers lowest to highest
	public static String sortScoresLtoH(int scores[]) { 
		int[] clone= new int [scores.length];
		for(int i=0; i<clone.length; i++) {
			clone[i]=scores[i];
		}
        int temp;    
        String sk = "";
        for (int i = 0; i < clone.length; i++) {     
            for (int j = i+1; j < clone.length; j++) {     
               if(clone[i] > clone[j]) {    
                   temp = clone[i];    
                   clone[i] = clone[j];    
                   clone[j] = temp;
               }     
            }     
        }    
        for (int i = 0; i < clone.length; i++) {     
            sk+=(clone[i]+(i!=clone.length-1?",":""));    
        }
        return sk;
	}
	
	//prints numbers highest to lowest
	public static String sortScoresHtoL(int scores[]) {
		int[] clone= new int [scores.length];
		for(int i=0; i<clone.length; i++) {
			clone[i]=scores[i];
		}
		int temp;
		String sm = "";
        for (int i = 0; i < clone.length; i++) {     
            for (int j = i+1; j < clone.length; j++) {     
               if(clone[i] < clone[j]) {    
                   temp = clone[i];    
                   clone[i] = clone[j];    
                   clone[j] = temp;    
               }     
            }     
        }        
        for (int i = 0; i < clone.length; i++) {     
            sm+=(clone[i]+(i!=clone.length-1?",":""));    
        }    
        return sm;
	}
	
	//calculates and prints average number of wins
	public static double average(int scores[]) {
        double total = 0;
        for(int i=0; i<scores.length; i++){
        	total = total + scores[i];
        }
        double average = total / scores.length;
        return average;
	}
	
	//calculates and prints the middle number of wins
	public static double median(int scores[]) {
		double medi;
		if(scores.length%2==1){
			medi=scores[(scores.length+1)/2-1];
		}else{
			medi=(scores[scores.length/2-1]+scores[scores.length/2])/2;
		}
		   System.out.println("");
	       return medi;
	}
	
	//prints the longest string name in the array
	public static String longestName(String names[]) {
		int index = 0; 
		int namel = names[0].length();
		for(int i=1; i<names.length; i++) {
		    if(names[i].length() > namel) {
		        index = i; 
		        namel = names[i].length();
		    }
		}
		System.out.println("");
		return names[index];
	}
	
	//prints a graph of each players wins
	public static void graphWins(String names[], int scores[]) {
		int namec;
		int winc;
		String namecsize;
		String wincsize;
		String sign;
		double dif;
		namec = longestName(names).length()+3;
		if (namec<14) {
			namec=14;
		}
		winc = maxScores(scores)+3;
		if (winc<12) {
			winc=12;
		}
		namecsize = String.valueOf(-namec);
		wincsize = String.valueOf(-winc);
		System.out.println("\n-<>-<>-<>-<>-<>-<Score Graph>-<>-<>-<>-<>-<>-\n");
		System.out.printf("%"+namecsize+"s%"+wincsize+"s%s\n", "Player Name", "Games Won", "Wins Above Average");
		System.out.printf("%"+namecsize+"s%"+wincsize+"s%s\n", "===========", "=========", "==================");
		for (int i = 0; i<names.length; i++) {
			StringBuilder winCnt = new StringBuilder(scores[i]);
			for (int j = 0; j<scores[i]; j++) {
				winCnt.append("X");
			}
			sign = scores[i]>=average(scores) ? "+" : "";
			dif = scores[i]-average(scores);
			System.out.printf("%"+namecsize+"s%"+wincsize+"s%s%.1f\n", names[i], winCnt.toString(), sign, dif);
		}
	}
	
	//prints a welcome sign
	public static void welcome() {
		System.out.println("             ___________\r\n"
				+ "            '._==_==_=_.'\r\n"
				+ "            .-\\:      /-.\r\n"
				+ "           | (|:.     |) |\r\n"
				+ "            '-|:.     |-'\r\n"
				+ "              \\::.    /\r\n"
				+ "               '::. .'\r\n"
				+ "                 ) (\r\n"
				+ "               _.' '._\r\n"
				+ "              `\"\"\"\"\"\"\"`");
		System.out.println("-<>-<>-<Welcome to Who is a Winner!!>-<>-<>-");
	
	}
}