public class Main {

    public static void main(String[] args) {

        int sayi1 = 10;
        int sayi2 = 25;
        int sayi3 = 19;
        int enBuyuk = sayi1;

        if (sayi1 < sayi2) {
            enBuyuk = sayi2;

        }if (sayi2 < sayi3){
            enBuyuk = sayi3;

        }if (sayi3 < sayi1){
            enBuyuk=sayi1;

        }
        System.out.println(enBuyuk);
    }
}
