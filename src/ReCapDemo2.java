import java.util.Iterator;

public class ReCapDemo2 {
	public static void main(String[] args) {
		//double[] myList= new double[4];
		double[] myList= {1.2,6.1,4.3,5.6};
		double total=0;
		double enbuyuk=myList[0];
		
		for(double sayiDouble:myList) {
			if(enbuyuk<sayiDouble) {
				enbuyuk=sayiDouble;
			}
			System.out.println(sayiDouble);
			total+=sayiDouble;
		}
		System.out.println("Toplam: "+total);
		System.out.println("En Buyuk Sayi: "+enbuyuk);
	}

}
