public class Main {

    public static void main(String[] args) {
	String ogrenci1 = "Engim";
    String ogrenci2 = "Derin";
    String ogrenci3 = "Salih";

    String[] ogrenciler = {"Engin","Derin","Salih"};

        for (String ogrenci: ogrenciler) {
            System.out.println(ogrenci);
        }
        for (int i = 0; i < ogrenciler.length ; i++) {
            System.out.println(ogrenciler[i]);
        }
    }
}
