class A {
	int a, b;

	void add(int x, int y) {
		a = x;
		b = y;
	}
}

class B extends A {
	void result() {
		System.out.println("The Value Of A and B Is:\t" + a + "\t" + b);
		System.out.println("\nSum==>\t" + (a + b));
		System.out.println("\nSub==>\t" + (a - b));
		System.out.println("\nMul==>\t" + (a * b));
		System.out.println("\nDiv==>\t" + (float) (a / b));
		System.out.println("\nMod==>\t" + (a % b));
	}
}

class Singinh {
	public static void main(String s[]) {
		B b1 = new B();
		b1.add(74, 23);
		b1.result();
	}
}
