public class LoopDemo {
	public static void main(String[] args) {
		for (int i = 1; i < 11; i++) {
			System.out.println("Sayi-> "+i);
		}
		System.out.println("For Dongusu Bitti");
	
	
		int j=1;
		while (j<10) {
			System.out.println(j);
			j++;
		}
		System.out.println("While Dongusu Bitti");
		
		
		
		//int k=2;
		int k=100;
		do {
			System.out.println(k);
			k+=2;
		} while (k<10);
		System.out.println("Do-While Dongusu Bitti");
	}

}
