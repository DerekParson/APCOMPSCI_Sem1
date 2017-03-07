import java.util.ArrayList;
import java.util.Arrays;
public class ToyStore
{
	private ArrayList<Toy> toyList = new ArrayList<Toy>();
	
	public ToyStore()
	{
		toyList = new ArrayList<>();		
	}
	public ToyStore(String tl)
	{
		toyList = loadToys(tl);
	}
	public ArrayList<Toy> loadToys(String ts)
	{
		toyList = new ArrayList<>();
		ArrayList<String> toys = new ArrayList<String>(Arrays.asList(ts.split(", ")));
		
		for(int i = 0;i<toys.size();i+=2)
		{
			String name = toys.get(i);
			String type = toys.get(i + 1);
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
		return toyList;
	}
	public Toy getThatToy(String nm)
	{
		for(Toy toy : toyList)
		{
			if(toy.getName().equals(nm))
			{
				return toy;
			}
		}
		return null;
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