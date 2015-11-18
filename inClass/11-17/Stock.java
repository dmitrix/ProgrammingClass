//1.	Write the definition of a class that has the following properties:
//a.	The name of the class is Stock.
public class Stock
{
	//b.	The class Stock has four instance variables: name of type String, previousPrice and closingPrice of type double, and numberOfShares of type int.
	private String name;
	private double previousPrice, closingPrice;
	private int numberOfShares;
	
	public Stock()
	{
		name = "";
		previousPrice = 0.0;
		closingPrice = 0.0;
		numberOfShares = 0;
	}
	
	public Stock(String newName, double newPreviousPrice, double newClosingPrice, int newNumberOfShares)
	{
		name = newName;
		previousPrice = newPreviousPrice;
		closingPrice = newClosingPrice;
		numberOfShares = newNumberOfShares;
	}
	
	
	//•	setName—method to set the name
	public void setName(String newName)
	{
		name = newName;
	}
	
	//•	setPreviousPrice—method to set the previous price of a stock. (This is the closing price of the previous day.)
	public void setPreviousPrice()
	{
		previousPrice = closingPrice;
	}
	
	//•	setClosingPrice—method to set the closing price of a stock
	public void setClosingPrice(double newClosingPrice)
	{
		setPreviousPrice();
		closingPrice = newClosingPrice;
	}
	
	//•	setNumberOfShare—method to set the number of shares owned by the stock
	public void setNumberOfShare(int newNumberOfShare)
	{
		numberOfShares = newNumberOfShare;
	}
	
	//•	getName—value-returning method to return the name
	public String getName()
	{
		return name;
	}
	
	//•	getPreviousPrice—value-returning method to return the previous price of the stock
	public double getPreviousPrice()
	{
		return previousPrice;
	}

	//•	getClosingPrice—value-returning method to return the closing price of the stock
	public double getClosingPrice()
	{
		return closingPrice;
	}
	
	//•	getNumberOfShare—value-returning method to return the number of shares owned by the stock
	public int getNumberOfShare()
	{
		return numberOfShares;
	}
	
	//•	percentGain—value-returning method to return the change in the stock value from the previous closing price and today’s closing price as a percentage
	public double percentGain()
	{
		// percent gain (closing value - previous value) / previous value
		return (closingPrice - previousPrice) / previousPrice;
		
	}
	
	//•	shareValues—value-returning method to calculate and return the total values of the shares owned
	public double shareValues()
	{
		return closingPrice * numberOfShares;
	}
}
