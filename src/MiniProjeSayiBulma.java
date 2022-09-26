
public class MiniProjeSayiBulma {
	public static void main(String[] args) {
		int[] sayilar = new int[] {1,2,5,7,9,0};
		int aranacak=5;
		boolean isFound=false;

		for(int sayi : sayilar){
			if(sayi==aranacak) {
				isFound=true;
				break;
			}
		}

		if(isFound) {
			System.out.println("Sayi Bulundu.");
		}
		else {
			System.out.println("Sayi Bulunamadi !!!!");
		}
				
	}
}
