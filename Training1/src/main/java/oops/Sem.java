package oops;

class sem11 {
	
public int eng,hindi,math;
public void input1() {
	math=9;
	eng=8;
	hindi=3;
	
}
public void output1(){
	System.out.println("marks in e :"+eng);
	System.out.println("marks in h :"+hindi);
	System.out.println("marks in m :"+math);
	int t=math+eng+hindi;
	
	System.out.println("Total marks in sem1 :"+t);
}
}
class sem2 extends sem11{
	public int c,cpp,jv;
	public void input2() {
		c=20;
		cpp=1;
		jv=3;
		
	}
	public void output2(){
		System.out.println("marks in c :"+c);
		System.out.println("marks in m :"+(cpp));
		System.out.println("marks in jv :"+jv);
		int t=c+cpp+jv;
		
		System.out.println("Total marks in sem1 :"+t);
	}
	
}
class sem3 extends sem2{
	public int a,b,d;
	public void input3() {
		a=10;
		b=1;
		d=1;
		
	}
	public void output3(){
		System.out.println("marks in a :"+a);
		System.out.println("marks in b :"+(b));
		System.out.println("marks in d :"+d);
		int t=a+b+d;
		
		System.out.println("Total marks in sem :"+t);
	}
	//instance can b- pub,pro,def
	//  pri mthd cant b inherited
	// final clas cant b inherited
}

public class Sem {
	public static void main(String[] args) {
		sem3 o=new sem3();
		o.input3();
		o.output3();
		o.input2();
		o.output2();
		o.input1();
		o.output1();
	}
}