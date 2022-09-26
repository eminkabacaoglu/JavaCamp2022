
public class MiniProjeAsalMi {
	public static void main(String[] args) {
		int number = 25;
		//int remainder = number % 2;
		boolean isPrime = true;
		
		if (number == 1) {
			System.out.println("Asal degildir");
			return;
		}
		
		if (number < 1) {
			System.out.println("Gecersiz sayi");
			return;
		}
		
		for (int i = 2; i < number; i++) {
            if (number % i == 0) { 
            	isPrime = false;
            }
        }
		
		if (isPrime) {
			System.out.println( number + " asaldir");
		} else {
			System.out.println( number + " asal degildir");
		}
	}
	
}
