public class BatuGuntingKertas
{
    public int inputPemain;
    public int inputKomputer;
    private int nilaiPemain;
    private int nilaiKomputer;

    public void setGame(int player, int komputer)
    {
        // Input value yang dipilih oleh pemain atau komputer
        this.inputPemain    = player;
        this.inputKomputer  = komputer;

        // Jika player menang tambahkan skor milik pemain, dan sebaliknya
        if ((player == 0 && komputer == 2) ||
                (player == 2 && komputer == 1) ||
                (player == 1 && komputer == 0))
            this.nilaiPemain++;
        else if ((komputer == 0 && player == 2) ||
                (komputer == 2 && player == 1) ||
                (komputer == 1 && player == 0))
            this.nilaiKomputer++;
    }

    public void getResult()
    {
        String getResult;

        // Jika pemain menang, Cetak "Hasil: Menang"
        if ((this.inputPemain == 0 && this.inputKomputer == 2) ||
                (this.inputPemain == 2 && this.inputKomputer == 1) ||
                (this.inputPemain == 1 && this.inputKomputer == 0))
        {
            getResult = "Menang";
        }
        // Jika komputer menang, Cetak "Hasil: Kalah"
        else if ((this.inputKomputer == 0 && this.inputPemain == 2) ||
                (this.inputKomputer == 2 && this.inputPemain == 1) ||
                (this.inputKomputer == 1 && this.inputPemain == 0))
        {
            getResult = "Kalah";
        }
        // Jika skor sama, Cetak "Hasil: Seri"
        else getResult = "Seri";

        System.out.println("Hasil: " + getResult);
    }

    public String pilihanTangan(int tipe)
    {
        if (tipe == 0)
            return "Batu";
        else if (tipe == 1)
            return "Kertas";
        else
            return "Gunting";
    }

    public void hasilPermainan()
    {
        String hasilPemain;

        if (this.nilaiPemain > this.nilaiKomputer)
            hasilPemain = "Anda telah menjadi juara dan komputer kalah.";
        else if (this.nilaiPemain < this.nilaiKomputer)
            hasilPemain = "Komputer telah menjadi juara dan Anda kalah.";
        else hasilPemain = "Tidak ada yang juara, skor yang diperoleh sama.";

        System.out.println("\nHasil Permainan: ");
        System.out.println("* Anda mendapatkan skor: " + this.nilaiPemain);
        System.out.println("* Komputer mendapatkan skor: " + this.nilaiKomputer);
        System.out.println(hasilPemain);
    }
}