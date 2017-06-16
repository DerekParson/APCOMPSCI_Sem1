import java.util.ArrayList;
public class Satellite
{
	private static double xM, yM; 
   public static void main(String[]args)
   {
       ArrayList<Location> locate = new ArrayList<>();
       double[] honLoc = {3, 6};
       locate.add(new Honda(honLoc));
       locate.add(new Toyota("8, 9"));
       locate.add(new GMC(3, 8));

       double[] home = {0, 0};

       String printout = "\n\n" +
               "==========================\n";
			  
       for (Location l : locate)
       {
		   xM = (double)(Math.random()*100);
		   yM = (double)(Math.random()*100);
		   String xMdec = String.format("%.2f", xM);
		   String yMdec = String.format("%.2f", yM);
           printout += "\nAfter " + l.getID() + " Moved (" + xMdec + ", " + yMdec + ")\n";
		   printout += "New Location: (" + getLocation(l.getLoc()) + ")\n\n";
       }
	   
       printout += "\n" + "==========================" +
                   "\nDistance from home...";

       for (Location l : locate)
       {
           printout += "\n\tDistance for " + l.getID() + ": (" + getDistance(l.getLoc(), home)+ ")";
       }

       System.out.println(printout);
   }

   public static double getDistance(double[] car, double[] home)
   {
       return Math.sqrt((Math.pow((car[0]+xM) - home[0], 2)+ Math.pow((car[1]+yM) - home[1], 2)));
   }

   public static String getLocation(double[] loc)
   {
       return String.format("%.2f" + ", " + "%.2f",loc[0]+xM,loc[1]+yM);
   }
}