import java.util.Iterator;

public class MultiDimensionalArray {
	public static void main(String[] args) {
		String[][] cities=new String[3][3];
		cities[0][0] = "Istanbul";
		cities[0][1] = "Bursa";
		cities[0][2] = "Bilecik";
		cities[1][0] = "Ankara";
		cities[1][1] = "Konya";
		cities[1][2] = "Kayseri";
		cities[2][0] = "Diyarbakir";
		cities[2][1] = "Sanliurfa";
		cities[2][2] = "Gaziantep";
		
		for (int i = 0; i < cities.length; i++) {
			System.out.println("xxxxxxxxxxxxxx");
			for (int j = 0; j < cities.length; j++) {
				System.out.println(cities[i][j]);
			}
		}
	}
}
