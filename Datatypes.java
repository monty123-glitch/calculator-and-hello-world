public class Datatypes
{
    public static void main(String[] args)
	{
		byte d = 5;
		ops (1,2.5f,2.5,10,d); 
	}
	public static void ops(int a, float b, double c, long l, byte d)
	{
        
         double p =  c/b;
         double q =  c/a;
         double r = c/a;
         double m = r+l; 
         int s = a/d;
        
         
        System.out.println(p + " " + q + " " + r + " " + m + " " + s);
        
    }
}


