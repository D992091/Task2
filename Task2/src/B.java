public class B {
	public static void main(String...args){
		A a = new A(1,2,3,4,5,6,7,8);
		System.out.println(a.toString());
		a.sortArr();
		System.out.println(a.toString());
		System.out.println(a.printFirstArr());
	}
}

