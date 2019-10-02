package snackBarApp;

public class Main 
{
	// fields - information
	// methods - do behaviors

	public static void main(String[] args)
	{
		Customer jane = new Customer("Jane", 45.25);
		Customer bob = new Customer("Bob", 33.14);

		VendingMachine food = new VendingMachine("Food");
        VendingMachine drink = new VendingMachine("Drink");
        VendingMachine office = new VendingMachine("Office");

        Snack chips = new Snack("Chips", 36, 1.75, food.getId());
        Snack chocolateBar = new Snack("Chocolate Bar", 36, 1.00, food.getId());
        Snack pretzel = new Snack("Pretzel", 30, 2.00, food.getId());
        
        Snack soda = new Snack("Soda", 24, 2.50, drink.getId());
        Snack water = new Snack("Water", 20, 2.75, drink.getId());



        System.out.println("*** Query Data ***");
        System.out.println("*** 1 ***");
        System.out.println(soda.subtractQuantity(3));
        System.out.println(jane.buy(soda.getCost(),3));
        System.out.println("*** 2 ***");
        System.out.println(pretzel.subtractQuantity(1));
        System.out.println(jane.buy(pretzel.getCost(),1));
        System.out.println("*** 3 ***");
        System.out.println(soda.subtractQuantity(2));
        System.out.println(bob.buy(soda.getCost(),2));
        System.out.println("*** 4 ***");
        System.out.println(jane.addCash(10.00));
        System.out.println("*** 5 ***");
        System.out.println(chocolateBar.subtractQuantity(1));
        System.out.println(jane.buy(chocolateBar.getCost(),1));
        System.out.println("*** 6 ***");
        System.out.println(pretzel.addQuantity(12));
        System.out.println("*** 7 ***");
        System.out.println(pretzel.subtractQuantity(3));
        System.out.println(bob.buy(pretzel.getCost(),3));

        System.out.println("*** Stretch ***");
        System.out.println(chips.getName());
        // System.out.println();
        // System.out.println(c1.debt);
        // c1.debt = -c1.debt;
        // System.out.println(c1.debt);

        // System.out.println("*** Strings ***");

        // String localStr;
        // localStr = emp1.getFname() + " " + emp3.getLname();
        // System.out.println(localStr);
        // String noVowels = localStr.toLowerCase().replaceAll("[a,e,i,o,u]", "_");
        // System.out.println(noVowels);

        // System.out.println();
        // System.out.println("*** Numbers ***");
        // System.out.println("Original / 5 " + (c1.debt / 5));
        // System.out.println("Original / 7 " + (c1.debt / 7));
        // System.out.println("Original / 7.0 " + (c1.debt / 7.0));
        // System.out.println("Original / 7 " + ((double)c1.debt / 7));
        // System.out.println("Original mod 3 " + (c1.debt % 3));
	} 
}



