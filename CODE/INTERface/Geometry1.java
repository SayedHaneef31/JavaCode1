import java.util.*;
class Geometry1
{
	static void display(float x,float y)
	{
		System.out.println("Area="+x+"\t"+"Perimeter="+y);
	}
	public static void main(String args[])
	{
		Circle c=new Circle(5.2F);
		GeoAnalyser geo_obj;               // geo_obj is a object for interface GeoAnalyser
		geo_obj=c;
		display(geo_obj.area(),geo_obj.perimeter());
	}
	
	
}