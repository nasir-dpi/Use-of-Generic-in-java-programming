package useOfgenerics;

public class ClassGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericExample<String> a1 = new GenericExample<>();
		GenericExample<Integer> b1 = new GenericExample<>();
		a1.sum("You Should ");
		a1.add("do it");
		b1.sum(50);
		b1.add(100);
//		System.out.println(a1.print());
//		System.out.println(b1.print());
		System.out.println(a1.get()+a1.print());
		System.out.println(b1.print()+b1.get());
	}

}
