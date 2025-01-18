import java.util.*;
class threerandom{
	public static void main(String[] args){
		int a1 = (int)Math.floor(Math.random()*900 + 100);
		int a2 = (int)Math.floor(Math.random()*900 + 100);
		int a3 = (int)Math.floor(Math.random()*900 + 100);
		int a4 = (int)Math.floor(Math.random()*900 + 100);
		int a5 = (int)Math.floor(Math.random()*900 + 100);
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		System.out.println(a5);

		System.out.println("max value " + Math.max(a1,Math.max(a2,Math.max(a3,Math.max(a4,a5)))));
		System.out.println("min value " + Math.min(a1,Math.min(a2,Math.min(a3,Math.min(a4,a5)))));
	}


}
