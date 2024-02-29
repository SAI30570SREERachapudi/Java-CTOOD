Design a class named Stock that contains:
 A string data field named symbol for the stock’s symbol.
 A string data field named name for the stock’s name.
 A double data field named previousClosingPrice that stores the stock 
price for the previous day.
 A double data field named currentPrice that stores the stock price 
for the current time.
 A method named getChangePercent () that returns the percentage 
changed from previousClosingPrice to currentPrice.
Draw the class diagram for the class and then implement the class. Write a 
test program that creates two Stock objects
1. Stock symbol ORCL, the name Oracle Corporation, and the previous 
closing price of 34.5. Set a new current price to 34.35 and display the pricechange percentage.
2. Stock symbol MC, the name Microsoft Corporation, and the previous 
closing price of 85.5. Set a new current price to 24.35 and display the pricechange percentage.
Class Diagram:
Program:
public class Stock {
 private String symbol;
 private String name;
 private double previousClosingPrice;
 private double currentPrice;
 
 public Stock(String symbol, String name, double previousClosingPrice) 
{
 this.symbol = symbol;
 this.name = name;
 this.previousClosingPrice = previousClosingPrice;
 }
 
 
 
 public void setCurrentPrice(double currentPrice) {
 this.currentPrice = currentPrice;
 }
 
 
 public double getChangePercent() {
 return ((currentPrice - previousClosingPrice) / 
previousClosingPrice) * 100;
 }
 
 
 public static void main(String[] args) {
 // Creating Stock objects
 Stock s1 = new Stock("ORCL", "Oracle", 34.5);
 Stock s2 = new Stock("MC", "Microsoft", 85.5);
 
 // Setting current prices
 s1.setCurrentPrice(34.35);
 s2.setCurrentPrice(24.35);
 
 // Displaying price-change percentage
 System.out.println("ORCL percentage: " + s1.getChangePercent() + 
"%");
 System.out.println("MC percentage: " + s2.getChangePercent() + 
"%");
}
}
