
public class Arrays {
	public static void main(String[] args) {
		
		String ogrenci1 = "Emin";
		String ogrenci2 = "Can";
		String ogrenci3 = "Eren";
		String ogrenci4 = "Cagdas";
		
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);
		
		System.out.println("-----------------------------");
		
		String[] students = new String[4];
		students[0] = "Emin";
		students[1] = "Can";
		students[2] = "Eren";
		students[3] = "Cagdas";
		
		for(int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}
		System.out.println("****************");
		for (String student : students) {
			System.out.println(student);
		}
	}
}
