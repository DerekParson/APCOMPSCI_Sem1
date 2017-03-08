public class PC extends GameSystem
{
	private String platform;
	private int serialNo;
	
	public PC()
	{
		super();
	}
	public PC(String p)
	{
		super(p);
	}
	public String systemInput = "Keyboard + Mouse";
	public String toString()
	{
		return "Platform: " + super.getPlatform() +
				"\n Serial #: " + super.getSerial() +
				"\n System Input: " + systemInput;
	}
}