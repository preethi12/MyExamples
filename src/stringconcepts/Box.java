package stringconcepts;

public class Box {
double width;
double height;
double depth;

Box(double w,double h,double d)
{
	width=w;
	height=h;
	depth=d;
}
public String toString()
{
	return "dimention one"+width+","+height+","+depth;
}
}
