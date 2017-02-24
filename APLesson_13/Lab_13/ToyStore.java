import java.util.ArrayList;
public class ToyStore
{
	private ArrayList<Toy> toyList = new ArrayList<Toy>();
	
	public ToyStore()
	{
		
	}
	public ToyStore(String toyList)
	{
		this.loadToys(toyList);
	}
	public void loadToys(String ts)
	{
		String[]toys = ts.split(", ");
		
		for(int i = 0;i<toys.length;i++)
		{
			String name = toys[i];
			String type = toys[i + 1];
			Toy toy = getThatToy(name);
			if(toy == null)
			{
				if(type.equals("Car"))
					toyList.add(new Car(name, 1));
				else if(type.equals("AF"))
					toyList.add(new aFigure(name, 1));
			}
			else 
			{
				toy.setCount(toy.getCount() + 1);
			}
		}
	}
	public Toy getThatToy(String nm)
	{
		for(Toy toy : toyList)
		{
			if(toy.getName().equals(nm))
			{
				return toy;
			}
			else
			{
				return null;
			}
		}
	}
	public String getMostFrequentToy()
	{
		String name = "";
		int max = Integer.MIN_VALUE;
		for(Toy toy : toyList)
		{
			if(max < toy.getCount())
			{
				max = toy.getCount();
				name = toy.getName();
			}
		}
		return name;
	}
	public String getMostFrequentType()
	{
		int cars = 0;
		int figures = 0;
		for(Toy toy : toyList)
		{
			if(toy.getType().equals("Car"))
				cars++;
			else if(toy.getType().equals("AF"))
				figures++;
		}
		if(cars > figures)
			return "Cars";
		else if(figures > cars)
			return "Action Figures";
		else
			return "Equal amounts of action figures and cars";
	}
	public String toString()
	{
		return toyList.toString();
	}

}