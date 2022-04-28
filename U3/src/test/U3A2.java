package test;
import java.util.Scanner;
public class U3A2 {

	public static void main(String[] args) {
		
		//Welcome code initiation and picture
		welcome();
		System.out.println("");
		
		//Declaring Strings for items
		String item1ns;
		int item1pi;
		String item2ns;
		int item2pi;
		String item3ns;
		int item3pi;
		Scanner scanner = new Scanner(System.in);		
		
		//Asks the user for input on name and price of items
		System.out.println("What is the name & price for:");
		System.out.print("Item #1 Name:");
		item1ns = scanner.next();
		System.out.print("Item #1 Price:");
		item1pi = scanner.nextInt();
		System.out.print("Item #2 Name:");
		item2ns = scanner.next();
		System.out.print("Item #2 Price:");
		item2pi = scanner.nextInt();
		System.out.print("Item #3 Name:");
		item3ns = scanner.next();
		System.out.print("Item #3 Price:");
		item3pi = scanner.nextInt();
		
		double sum = (item1pi + item2pi + item3pi);
		double disc;
		
		//Prints the discount amount and sub-total of the items
		if(item1pi > 50 || item2pi > 50 || item3pi > 50 || sum >= 75) {
			System.out.println("Your total is $" + sum + " with a 30% discount!");
			disc = 0.3;
		}else if(item1pi > 20 && item1pi <= 50|| item2pi > 20 && item2pi <= 50|| item3pi > 20 && item3pi > 50|| sum > 30 && sum <= 75) {
			System.out.println("Your total is $" + sum + " with a 20% discount!");
			disc = 0.2;
		}else {
			System.out.println("Your total is $" + sum + " with no discount :(");
			disc = 0;
		}
		
		//Creates the discounted and sum prices for the items
		double item1pis = (item1pi*disc);
		double item2pis = (item2pi*disc);
		double item3pis = (item3pi*disc);
		double sum2 = ((item1pi-item1pis)+(item2pi-item2pis)+(item3pi-item3pis));
		
		//Creates the variables for sorting values
		String low;
		double lCost;
		String mid;
		double mCost;
		String high;
		double hCost;
		
        if (item1pi>item2pi && item1pi>item3pi) {
            if (item2pi>item3pi) {
                mCost = item2pi;
                mid = item2ns;
                lCost = item3pi;
                low = item3ns;
            }else {
                lCost = item2pi;
                low = item2ns;
                mCost = item3pi;
                mid = item3ns;
            }
            hCost = item1pi;
            high = item1ns;
        }else if (item2pi>item1pi && item2pi>item3pi) {
            if (item1pi>item3pi) {
                mCost = item1pi;
                mid = item1ns;
                lCost = item3pi;
                low = item3ns;
            }else {
                mCost = item3pi;
                mid = item3ns;
                lCost = item1pi;
                low = item1ns;
            }
            hCost = item2pi;
            high = item2ns;
        }else { 
            if (item1pi>item2pi) {
                mCost = item1pi;
                mid = item1ns;
                lCost = item2pi;
                low = item2ns;
            }else {
                lCost = item1pi;
                low = item1ns;
                mCost = item2pi;
                mid = item2ns;
            }
            hCost = item3pi;
            high = item3ns;
        }
		
		//Prints the bill with all the information
		System.out.println("");
		System.out.println(">===================================================<");
		System.out.println(">=====================<<<Bill>>>====================<");
		System.out.println(">===================================================<");
		System.out.println("                                                     ");
        System.out.printf("\n%-15s%-10s%-15s%-10s", "Item", "Cost", "Discount", "Final Price");
        System.out.println("\n=====          ====      ========       ===========");
        System.out.printf("%-15s$%-9s$%-14.2f$%-10.2f\n", low, lCost, item1pis, (item1pi-item1pis));
        System.out.printf("%-15s$%-9s$%-14.2f$%-10.2f\n", mid, mCost, item2pis, (item2pi-item2pis));
        System.out.printf("%-15s$%-9s$%-14.2f$%-10.2f\n", high, hCost, item3pis, (item3pi-item3pis));
        System.out.println();
        System.out.printf("%-40s$%-10.2f","Total: ", sum2);

	}
	
	//Creates the welcome sign and picture
	public static void welcome() {
		System.out.println("<~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~>");
		System.out.println("<           Welcome to Canada Computers           >");
		System.out.println("<=================================================>");
		System.out.println("                      .---.\r\n"
				+ "                     /     \\\r\n"
				+ "                     \\.@-@./\r\n"
				+ "                     /`\\_/`\\\r\n"
				+ "                    //  _  \\\\\r\n"
				+ "                   | \\     )|_\r\n"
				+ "                  /`\\_`>  <_/ \\\r\n"
				+ "                  \\__/'---'\\__/");
	}
}

//End of main