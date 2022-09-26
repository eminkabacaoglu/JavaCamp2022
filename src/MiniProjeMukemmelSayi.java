
public class MiniProjeMukemmelSayi {
	public static void main(String[] args) {
		int sayi=5;
		int toplam=0;
		for(int i=1;i<sayi;i++) {
			if(sayi%i==0) {
				toplam+=i;
			}
		}
		
		if(sayi==toplam) {
			System.out.println("Mukemmel Sayi");
		}
		else {
			System.out.println("Mukemmel Sayi Degil");
		}
	}
}
