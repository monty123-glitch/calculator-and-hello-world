public class Triangles
{
	public void area(int a,int b,int c);
	void perimeter(int a,int b,int c);
};

void Triangle::area(int a,int b,int c)
{
	float s=((a+b+c)/2.0),A=sqrt(s*(s-a)*(s-b)*(s-c));
	
}

void Triangle::perimeter(int a,int b,int c)
{
	
}

int main()
{
	Triangle tr1;
	int side1=3,side2=4,side3=5;
	tr1.area(side1,side2,side3);
	tr1.perimeter(side1,side2,side3);
	return 0;
}