package Array;

public class PsgAryAsArg {
	private static void ll(Integer[] p){
		for( int i=0;i<p.length;i++)
		{
			System.out.println(p[i]);
		}
	}
	public static void main(String[] args)
	{
		Integer[] h= {1,2,3,4};
		ll(h);
	}

}
