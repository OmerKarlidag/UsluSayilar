import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı yazıyoruz.

        int n,k;
        Scanner scan = new Scanner(System.in);
        System.out.print("Üssü Alınacak Sayıyı Giriniz : ");
        n = scan.nextInt();
        System.out.print("Üs Olacak Sayıyı Giriniz : ");
        k = scan.nextInt();
        int total = 1;
        /*
        int i = 1;
        while (i <= k){
            total *= n;
            i++;
        }
        System.out.println("Cevap : " + total);
        */
        //Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı
        //"For Döngüsü" kullanarak yapınız.
        for (int i=1; i <= k; i++) {
            total*= n;
        }
        System.out.println("Cevap : " + total);
    }
}