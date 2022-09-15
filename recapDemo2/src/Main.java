public class Main {

    public static void main(String[] args) {

        double[] myList = {1.2,1.3,7.3,5.6};
        double total = 0;
        double enBuyuk = myList[0];
        for (double listeler:myList) {
            total = total  + listeler;
            if (enBuyuk<listeler){
                enBuyuk=listeler;
            }

            System.out.println(listeler);
            
        }
        System.out.println(enBuyuk);
        System.out.println("TOPLAM :"+total);

        double[] sayi = {1.5,1.6,5.7,8.5};
        double totall=0;
        double maxx = sayi[0];


        for(double sayilar:sayi ){
            totall = totall+ sayilar;
            if(maxx<sayilar){
                maxx=sayilar;
            }
            System.out.println(sayilar);
        }
        System.out.println(total);
        System.out.println(maxx);
    }
}
