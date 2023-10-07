public class Main_Q1
{
    public static void main(String[] args)
    {
        double dia_of_sun_in_miles=865000.0;
        double dia_of_earth_in_miles=7600.0;
        
        double radius_of_sun = dia_of_sun_in_miles/2.0;
        double radius_of_earth = dia_of_earth_in_miles/2.0;

        double volume_of_sun=4* Math.PI * Math.pow(radius_of_sun,3)/3;
        double volume_of_earth=4* Math.PI * Math.pow(radius_of_earth,3)/3;

        double Ratio_of_sun_to_Earth= volume_of_sun/volume_of_earth;
 
        System.out.println("Sun volume in cubic miles:"+volume_of_sun);
        System.out.println("Sun volume in cubic miles:"+volume_of_earth);
        System.out.println("Sun Earth Ratio:"+Ratio_of_sun_to_Earth);    
    }
}