package snackBarApp;

public class Customer
{
	// fields
	private static int maxId = 0;
	private int id;
    private String name;
    private double cash; 

	// constructor
	// initial state of the object
	public Customer(String name, double cash)
	{
		maxId++;

		id = maxId;

		this.name = name;
		this.cash = cash;
	}

	// methods - getters and setters

	public void setName(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return name;
    }
    
    public double getCash()
	{
		return cash;
	}


	// methods
    public double addCash(double addedCash)
    {
    	return this.cash = this.cash + addedCash;
    }

    public double buy(double cashSpent, int quantity)
    {
    	return this.cash = this.cash - (cashSpent*quantity);
    }


    // Object -> Employee
    @Override
    public String toString()
    {
        String rtnStr = "id: " + id + "\n" +
                        "name: " + name + "\n" +
                        "cash: " + cash + "\n";
        return rtnStr;
    }
}
