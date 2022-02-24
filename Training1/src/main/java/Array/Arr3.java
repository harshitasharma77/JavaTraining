package Array;

// MAKING OBJECTS

public class Arr3 {
	public void display(int arr[])
	
	// Member Function.Functn.Method {
	// becoz this iss nt static henc need to make obj for this to b called
	
	{
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);

		}
	}

	public double[] marks() {
		double marks[] = { 33.9, 44, 33.8, 44, 55.6 };
		return marks;
		// return array of dbl type
	}

public static void main(String[] args) {
	
	Arr3 obj=new Arr3();
 
	int score[]= {10,20,30,40,50};
	obj.display(score); //Func call
	
	System.out.println("-------------------------------");
	
	double marks2[]=obj.marks();
	
	for (int l=0;l<marks2.length;l++)
	{
		System.out.println(marks2[l]);
	}
}
}
