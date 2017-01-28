import java.lang.Math.*;
public class mph
{
	private int distance, hours, minutes;
	private double speed;
	
	public mph()
{
	distance = 0;
	hours = 0;
	minutes = 0;
	speed = 0;
}
public mph(int dis, int hr, int mins)
{
	distance = dis;
	hours = hr;
	minutes = mins;
	speed = 0;
}
public void setValues(int dis, int hr, int mins)
{
	distance = dis;
	hours = hr;
	minutes = mins;
	speed = 0;
}
public double getMPH()
{
	return speed = Math.round(distance / (hours + minutes / 60.0));
}
}
