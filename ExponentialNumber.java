import java.util.Scanner;

public class ExponentialNumber {
    public static void main(String[] args) {
        int us,taban ;
        int sonuc=1;

        Scanner input=new Scanner(System.in);
        System.out.print("Taban sayısını giriniz =");
        taban=input.nextInt();

        System.out.print("Üs sayısını giriniz =");
        us=input.nextInt();

        for (int i=0;i<us;i++){
            sonuc*=taban;
        }
        System.out.println("Sonuç = "+sonuc);

    }
}
