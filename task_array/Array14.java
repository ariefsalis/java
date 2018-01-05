public class Array14{

	public static void main(String[] args){
		String[] kata = {"Supriatna", "arief", "sal"};
		int a, b, c, maks, min;

		a = kata[0].length();
		b = kata[1].length();
		c = kata[2].length();

		if (a > b && b > c){
			maks = a;
			min = c;
			System.out.println("The shortest array length is " + min + ". The longest array length is " + maks);
		}
		if (b > c && c > a){
			maks = b;
			min = a;
			System.out.println("The shortest array length is " + min + ". The longest array length is " + maks);
		}
		if (c > a && a > b){
			maks = c;
			min = b;
			System.out.println("The shortest array length is " + min + ". The longest array length is " + maks);
		}

	}
}
