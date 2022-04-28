//U4A1 My Paint Store Loops
//Ethan Martinez-Mar

import java.util.Scanner;
public class U4A3 {

//Boolean initialization code
	static boolean op1 = false;
	static boolean op2 = false;
	static boolean op3 = false;
	static boolean op4 = false;
	static boolean op5 = false;
	static boolean op6 = false;
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);	
		
		welcome();
		
		System.out.print("Enter your choice: ");
		int choice = scanner.nextInt();
		System.out.println(" ");
		
		int inrow1, incolumn1;
		int inrow2, incolumn2;
		int inrow3, incolumn3;
		int inrow4, incolumn4;
		int inrow5, incolumn5;
		int sraint;
		int xsize;

//Menu code
		int casechoices = choice;
		switch(casechoices) {
		
		case 1:
			System.out.print("Enter amount of rows: ");
			inrow1 = scanner.nextInt();
			System.out.print("Enter amount of columns: ");
			incolumn1 = scanner.nextInt();
			System.out.println("You will need: " + inrow1*incolumn1 + " cans!");
			System.out.println(" ");
			System.out.print("");
			rectangle(inrow1,incolumn1);
			break;

		case 2:
			System.out.print("Enter amount of rows: ");
			inrow2 = scanner.nextInt();
			System.out.println("You will need: " + inrow2*inrow2 + " cans!");
			System.out.println(" ");
			System.out.print("");
			triangleup(inrow2);
			break;
		
		case 3: 
			System.out.print("Enter amount of rows: ");
			inrow3 = scanner.nextInt();
			System.out.println("You will need: " + inrow3*inrow3 + " cans!");
			System.out.println(" ");
			System.out.print("");
			triangledown(inrow3); 
			break;
		
		case 4:
			System.out.print("Enter amount of rows: ");
			inrow4 = scanner.nextInt();
			System.out.println("You will need: " + ((inrow4*inrow4/2)+1) + " cans!");
			System.out.println(" ");
			System.out.print("");
			diamond(inrow4); 
			break;
		
		case 5:
			System.out.print("Enter number to be factorialized: ");
			sraint = scanner.nextInt();
			System.out.println("");
			System.out.print("You can arrange the paint cans " + sra(sraint) + " ways!");
			break;
			
		case 6:
			System.out.print("Enter size of X: ");
			xsize = scanner.nextInt();
			System.out.println("You will need: " + ((xsize*2)-1) + " cans!");
			System.out.println(" ");
			System.out.print("");
			myX(xsize); 
			break;
		}
	}
	
	public static void rectangle(int rows1, int columns1) {
			for (int i = 0; i < rows1; i++) {
				for(int j = 0; j < columns1; j++) {
					System.out.print("X");
				}
					System.out.println();
		}
	}
		
	public static void triangleup(int rows2) {
			int k = 0;
			for (int i = 1; i <= rows2; ++i, k = 0) {
			      for (int space = 1; space <= rows2 - i; ++space) {
			        System.out.print("  ");
			      }
			      while (k != 2 * i - 1) {
			        System.out.print("X ");
			        ++k;
			      }

			      System.out.println();
			    }
			  }
		
	public static void triangledown(int rows3) {
			for(int i=rows3;i>0 ;i--)
            {
	        for(int j=0;j<rows3-i;j++)
             
                    {
                            System.out.print(" ");
                    }
                    for(int j=0;j<(i*2)-1;j++)
             
                    {
                            System.out.print("X");
                    }
                   System.out.println();
		}
	}
		
	public static void diamond(int rows4) {
			 int size = rows4,odd = 1, nos = size/2; //
		        for (int i = 1; i <= size; i++) { 
		            for (int k = nos; k >= 1; k--) {
		                                               
		                System.out.print(" ");
		            }
		            for (int j = 1; j <= odd; j++) { 
		                                                
		                System.out.print("X");
		            }
		            System.out.println();
		            if (i < size/2+1) {
		                odd += 2;
		                nos -= 1;
		            } else {
		                odd -= 2;
		                nos += 1;

		            }
		        }
		    }
		
	public static int sra(int sraint) {;
	        int sum = 1;
	        if (sraint < 1) {
	        	return 0;
	        }
	    	for(int i = 1; i <= sraint; i++){
	    		sum=sum*i;
	    }
	    	return (sum);
		}
		
	public static void myX(int xsize) {
			for(int i=1;i<=xsize;i++){       
				for(int j=1;j<=xsize;j++){      		
					if(j==i || j==xsize-i+1)
		             System.out.print("X");
		             System.out.print(" ");
				}
					System.out.println();
			}                    
		}
		
	public static void welcome() {
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("   Paint Can Store Display Centre");
			System.out.println(" ");
			System.out.println("       	,.--'`````'--., \r\n"
					+ "       (\\'-.,_____,.-'/)\r\n"
					+ "       	\\\\-.,_____,.-//\r\n"
					+ "       	;\\\\         //|\r\n"
					+ "       	| \\\\  ___  // |\r\n"
					+ "       	|  '-[___]-'  |\r\n"
					+ "       	|             |\r\n"
					+ "       	|             |\r\n"
					+ "       	|             |\r\n"
					+ "       	`'-.,_____,.-''");
			System.out.println(" ");
			System.out.println("1) Make a Rectangle Paint Can Display");
			System.out.println("2) Make a Pyramid");
			System.out.println("3) Make an Inverted Pyramid");
			System.out.println("4) Make a Diamond Display (Odd Amount of Can's Greater Than 3 Only)");
			System.out.println("5) Signature Row Arrangment Ways?");
			System.out.println("6) Custom X Formation (Odd Amount of Cans Only)");
			System.out.println(" ");
		}

}