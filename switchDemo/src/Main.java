public class Main {

    public static void main(String[] args) {

        char grade = '2';

        switch (grade){
            case 'A':
                System.out.println("En iyi not");
                break;

            case 'B':
                System.out.println("Mükemmel not");
                break;

            case 'C':
                System.out.println("iyi not");
                break;

            case 'D':
                System.out.println("kötü not");
                break;

            case 'F':
                System.out.println("En kötü not");
                break;

            default:
                System.out.println("Yanlıs bir karakter girdiniz.");
                break;
        }
    }
}
