import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        BatuGuntingKertas gameBGK = new BatuGuntingKertas();

        System.out.println("============= Batu - Gunting - Kertas =============");
        System.out.print("Berapa kali ingin bermain? ");
        int berapaKali = scan.nextInt();

        int count = 0;
        while (count < berapaKali)
        {
            System.out.println("Pilih tangan: (0: Batu, 1: Kertas, 2: Gunting)");

            System.out.print("Masukkan nomor (0-2): ");
            int pilihTangan = scan.nextInt();

            if (pilihTangan < 0 || pilihTangan > 2)
                pilihTangan = 0;

            System.out.println("Anda memilih: " + gameBGK.pilihanTangan(pilihTangan));

            int randomKomputer = new Random().nextInt(3);
            System.out.println("Komputer memilih: " + gameBGK.pilihanTangan(randomKomputer));

            gameBGK.setGame(pilihTangan, randomKomputer);
            gameBGK.getResult();
            count++;
        }

        gameBGK.hasilPermainan();
        System.out.println("===================================================");
    }
}
