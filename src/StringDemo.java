import java.util.Iterator;

public class StringDemo {
	public static void main(String[] args) {
		String mesaj = "Bugun hava cok guzel.";
		System.out.println(mesaj);
		System.out.println("Eleman Sayisi: "+mesaj.length());// 20
		System.out.println("5. eleman: "+mesaj.charAt(4));// n
		System.out.println(mesaj.concat(" Yasasin!"));//Bugun hava cok guzel. Yasasin!
		System.out.println(mesaj.startsWith("B"));//true
		System.out.println(mesaj.endsWith("."));//true
		
		char[] karakterler=new char[4];
		mesaj.getChars(0, 4, karakterler, 0);
		System.out.println(karakterler);//Bugu -- char[5] olsa idi son deger bos kalacagından bos karakter yerine kare bastırırdır
		
		System.out.println(mesaj.indexOf("c"));// 11
		System.out.println(mesaj.indexOf("h"));// 6
		System.out.println(mesaj.indexOf("a"));// 7
		System.out.println(mesaj.lastIndexOf("a"));// 9
		
		String mesaj2 = mesaj.replace('u','z');
		System.out.println(mesaj2);//Bzgzn hava cok gzzel.
		
		String mesaj3 = mesaj.replace(' ','-');
		System.out.println(mesaj3);//Bugun-hava-cok-guzel.
		
		
		String newSubString = mesaj.substring(7);//ava cok guzel.
		System.out.println(newSubString);
		String newSubString2 = mesaj.substring(0,7);//Bugun h
		System.out.println(newSubString2);
		String newSubString3 = mesaj.substring(2,4);//gu
		System.out.println(newSubString3);
		
		
		String[] kelimeler = mesaj.split(" ");

		for (String kelime : kelimeler) {
			System.out.println(kelime);
			/*
			 	Bugun
				hava
				cok
				guzel.
			 */
		}
		
		
		System.out.println(mesaj.toLowerCase());//bugun hava cok guzel.
		System.out.println(mesaj.toUpperCase());//BUGUN HAVA COK GUZEL.


		String newMesaj = "      Bugun hava cok guzel.      ";
		System.out.println(newMesaj);//      Bugun hava cok guzel.      
		newMesaj=newMesaj.trim();
		System.out.println(newMesaj);//Bugun hava cok guzel.
		
		
		
		
	}
}
