

import java.util.Scanner;
public class ReceiptMaker {

	public static final String SENTINEL = "checkout";
	public final int MAX_NUM_ITEMS;
	public final double TAX_RATE;
	private String [] itemNames;
	private double [] itemPrices;
  private int  MIN_NUM_ITEMS;
	private int numItemsPurchased;

	public ReceiptMaker(){
		MAX_NUM_ITEMS = 10;
		TAX_RATE = .0875; 
    MIN_NUM_ITEMS = 10;
		itemNames = new String[MAX_NUM_ITEMS];
		itemPrices = new double[MIN_NUM_ITEMS];
		numItemsPurchased = 0;
	}
	public ReceiptMaker(int maxNumItems, double taxRate){
		if(isValid(maxNumItems)){
			MAX_NUM_ITEMS = maxNumItems;
			}
		else{
			MAX_NUM_ITEMS= 10;
		}
		if(isValid(taxRate)){
			TAX_RATE = taxRate;
		}
		else{
			TAX_RATE = .0875;
		}
		itemNames = new String[MAX_NUM_ITEMS];
		itemPrices = new double[MAX_NUM_ITEMS];
		numItemsPurchased = 0;
	}
	
	public void greetUser(){
		System.out.println("Welcome to the "+MAX_NUM_ITEMS+" items or less checkout line");
	}
	public void promptUserForProductEntry(){
		System.out.println("Enter item #"+(numItemsPurchased+1)+ "'s name and price separated by a space, or enter \"" + SENTINEL + "\" to end transaction early");
	}
	public void addNextPurchaseItemFromUser(String itemName, double itemPrice){
		itemNames[numItemsPurchased] = itemName;
		itemPrices[numItemsPurchased] = itemPrice;
		numItemsPurchased++;
	}
	public double getSubtotal(){
		double subTotal = 0;
		for(int i=0; i<numItemsPurchased; i++){
			subTotal += itemPrices[i];
		}
		return subTotal;
	}
	public double getMinPrice(){
		double minPrice =  1000000.00;	
		for(int i=0; i<numItemsPurchased; i++){
			if(itemPrices[i]<minPrice){
				minPrice = itemPrices[i];
			}
		}
		return minPrice;
	}
	public int getIndexOfMinPrice(){
		int indexOfMin = 0;
		for(int i=1; i < numItemsPurchased; i++){
			if(itemPrices[i] < itemPrices[indexOfMin]){
				indexOfMin = i;
			}
		}
		return indexOfMin;
	}
	public double getMaxPrice(){
		double maxPrice = Integer.MIN_VALUE;
		for(int i=0; i<numItemsPurchased; i++){
			if(itemPrices[i] > maxPrice){
				maxPrice = itemPrices[i];
			}
		}
		return maxPrice;
	}
	public int getIndexOfMaxPrice(){
		int indexOfMax = 0;
		for(int i=1; i<numItemsPurchased; i++){
			if(itemPrices[i] > itemPrices[indexOfMax]){
				indexOfMax = i;
			}
		}
		return indexOfMax;
	}
	public double getMeanPrice(){
			return getSubtotal()/numItemsPurchased;
	}

	public double getTaxOnSubtotal(){
			return getSubtotal() * TAX_RATE;
	}

	public double getTotal(){
		return getSubtotal() + getTaxOnSubtotal();
	}
	
	public void displayReceipt(){
		System.out.println("-------------------------------------------------");
		System.out.printf("Subtotal: $ %04.2f    | # of Items %02d\n", getSubtotal(),numItemsPurchased);
		System.out.printf("     Tax: $ %05.2f \n",getTaxOnSubtotal());
		System.out.printf("   Total: $ %04.2f \n", getTotal());
		System.out.println("--------------------THANK YOU--------------------");
	}
	
	public void displayReceiptStats(){
		System.out.println("\n-----------------RECEIPT STATS-----------------");
		System.out.println("Min Item Name: " + itemNames[getIndexOfMinPrice()] + " | Price: $ " + getMinPrice());
		System.out.println("Max Item Name: " + itemNames[getIndexOfMaxPrice()] + " | Price: $ " + getMaxPrice());
		System.out.printf("Mean price of %02d items purchased:  $ %04.2f\n\n", numItemsPurchased, getMeanPrice());
		}
	public void displayAllItemsWithPrices(){
		System.out.println("\n---------------RECEIPT BREAKDOWN---------------");
		for(int i=0; i<numItemsPurchased; i++){
			System.out.printf("Item #%02d   Name: %3s | Price: $ %04.2f\n",(i+1), itemNames[i], itemPrices[i]);
		}
	}
	private double getItemPriceFromUser(Scanner scanner){
		//does not handle InputMismatchException
		double price = -1;
			while( (price = scanner.nextDouble()) < 0 ){
				System.out.println("Price \""+price+ "\" cannot be negative.\nReenter price");
			}
		return price;
		
	}
	public void scanCartItems(Scanner scanner){

		while(numItemsPurchased < MAX_NUM_ITEMS){
			promptUserForProductEntry();
      // System.out.print("YERRR");
			String token1;
			double token2 =-1;
			if(!(token1 = scanner.next()).equalsIgnoreCase(SENTINEL)){
        token2 = getItemPriceFromUser(scanner);
        addNextPurchaseItemFromUser(token1, token2);
			}
			else{
				break;
			}
		}
	}

	private boolean isValid(int a) {
		return (a >= 0);
	}
	private boolean isValid(double a) {
		return (a >= 0);
	}
	
	
	public static void main(String [] args){
		Scanner scanner = new Scanner(System.in);
		ReceiptMaker rm = new ReceiptMaker();
		rm.greetUser();
		rm.scanCartItems(scanner);
		rm.displayReceipt();
		rm.displayReceiptStats();
		rm.displayAllItemsWithPrices();
		scanner.close();
		
		
	}

	
	
	
	
	
	
	
	
	
}
