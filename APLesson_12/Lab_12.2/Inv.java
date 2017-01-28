public class Inv
{
	private String itemManufacturer, itemName, itemCategory;
	private int upc;
	private double price;

	public Inv()
	{
		itemCategory = "";
		itemManufacturer = "";
		itemName = "";
	}
	
	public Inv(String man, String name)
	{
		itemManufacturer = man;
		itemCategory = "";
		itemName = name;
		upc = (int)(Math.random() * 10000000) + 1;
		price = 99.99;		
	}
	public Inv(String man, String name, String cat, double num)
	{
		itemManufacturer = man;
		itemName = name;
		itemCategory = cat;
		upc = (int)(Math.random() * 10000000) + 1;
		price = num;
	}
	public void setInv(String man, String name, double num)
	{
		itemManufacturer = man;
		itemName = name;
		itemCategory = "Null";
		upc = (int)(Math.random() * 10000000) + 1;
		price = num;
	}
	public String toString()
	{
		return "\nItem Lookup:\nItem Manufacturer: " + itemManufacturer + "\nItem Name: " + itemName + "\nItem Category: " + itemCategory + "\nUPC #: " + upc + "\nPrice: " + price;
	}
}