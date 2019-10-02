package snackBarApp;

public class Snack
{
	// fields
	private static int maxId = 0;
	private int id;
	private String name;
	private int quantity;
	private double cost; 
	private int vendingId;


	// constructor
	// initial state of the object
	public Snack(String name, int quantity, double cost, int vendingId)
	{
		maxId++;

		id = maxId;

		this.name = name;
		this.quantity = quantity;
		this.cost = cost;
		this.vendingId = vendingId;
	}

	// methods - getters and setters
	public int getId()
	{
		return id;
    }

    public void setId(int id)
	{
		this.id = id;
	}
    
	public void setName(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return name;
	}

	public void setCost(double cost)
	{
		this.cost = cost;
	}

	public double getCost()
	{
		return cost;
	}

    public int getVendingId()
    {
        return vendingId;
    }

    public void setVendingId(int vendingId)
    {
        this.vendingId = vendingId;
    }

    public int getQuantity()
    {
        return quantity;
    }


	// methods
    public int addQuantity(int quantityAdded)
    {
    	return this.quantity = this.quantity + quantityAdded;
    }

    public int subtractQuantity(int quantitySubtracted)
    {
    	return this.quantity = this.quantity - quantitySubtracted;
    }

    public double totalCost(int quantityBought)
    {
    	return cost*quantityBought;
    }
    // Object -> Employee
    @Override
    public String toString()
    {
        String rtnStr = "id: " + id + "\n" +
                        "name: " + name + "\n" +
                        "quantity: " + quantity + "\n" +
                        "cost: " + cost + "\n" +
                        "vendingId: " + vendingId  + "\n";
        return rtnStr;
    }
}
