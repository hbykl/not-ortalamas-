import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        int ma,f,k,tu,ta,mu;
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Matematik notunuzu giriniz.");
            ma =input.nextInt();

            System.out.println("Fizik notunuzu giriniz.");
            f =input.nextInt();;

            System.out.println("Kimya notunuzu giriniz.");
            k =input.nextInt();;
            
            System.out.println("Türkçe notunuzu giriniz.");
            tu =input.nextInt();;

            System.out.println("Tarih notunuzu giriniz.");
            ta =input.nextInt();;

            System.out.println("Müzik notunuzu giriniz.");
            mu =input.nextInt();
        }
        ;

        double ort=(ma+f+k+tu+ta+mu)/6;
        System.out.println("Notların ortalaması="+ort);

        String sonuc = ort>60 ? "Sınıfı geçti" : "Sınıfta kaldı";
        System.out.println(sonuc);
    }
}
