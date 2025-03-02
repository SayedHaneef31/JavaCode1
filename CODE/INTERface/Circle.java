//Interface ka phla example hhhhhh.


interface GeoAnalyser
{
	final static float pi=3.14F;
	float area();
	float perimeter();
}
class Circle implements GeoAnalyser
{
	float radius;
	Circle (float radius)
	{
	this.radius=radius;
    }
    public float area()
    {
		return(pi*radius*radius);
		
	}	
    public float perimeter()
	{
		return(2*pi*radius);
	}	
 }