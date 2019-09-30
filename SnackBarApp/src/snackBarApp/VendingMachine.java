package snackBarApp;

public class VendingMachine
{
	// fields
	private static int maxId = 0;
	private int id;
	private String name;

	// constructor
	// initial state of the object
	public VendingMachine(String name)
	{
		maxId++;

		id = maxId;

		this.name = name;
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


	// methods
    // public String getName()
    // {
    // 	return fname + " " + lname;
    // }

    // Object -> Employee
    @Override
    public String toString()
    {
        String rtnStr = "id: " + id + "\n" +
                        "name: " + name + "\n";
        return rtnStr;
    }
}
