import java.util.Scanner; //pengguna dapat menginput

public class Main {

    public static class RekeningBank { //class rekening bank
        //mendeklair tipe data
        String nomorRekening;
        String namaPemilik;
        double saldo;

        public void tampilkanInfo() {
            //menampilkan info rekening
            System.out.println("Nomor Rekening:" + nomorRekening + "Nama Pemilik:" + namaPemilik+ "Saldo:" + saldo);
            System.out.println();
        }

        public void setorUang(double jumlah) {
            //cek jumlah setor, lebih dari 0
            if (jumlah > 0) {
                saldo += jumlah; //nambahin jumlah ke saldo
                System.out.println(namaPemilik+ "menyetor " + jumlah+" ");
                System.out.println("Saldo sekarang " + saldo); //nampilkan saldo setelah menyetor
                System.out.println();
            }
        }

        public void narikUang(double jumlah) {
            //cek jumlah nariknya sesuai atau kurang
            if (jumlah > 0 && jumlah <= saldo) {
                saldo -= jumlah; //kurangin saldo
                System.out.print(namaPemilik + "menarik " + jumlah + "(Berhasil) saldo sekarang " + saldo);
            } else {
                System.out.print(namaPemilik + "menarik " + jumlah + "(Gagal, saldo tidak mencukupi) saldo saat ini " + saldo+" ");
            }
        }

    }


    public static void main(String[] args){
        Scanner scan = new Scanner(System.in); //input user
        //bikin 2 objek rekening
        RekeningBank rekening1 = new RekeningBank();
        RekeningBank rekening2 = new RekeningBank();

        //data rekning 1
        rekening1.nomorRekening = "202410370110341\n";
        rekening1.namaPemilik= "Vanisa\n";
        rekening1.saldo= 300000;

        //data rekening 2
        rekening2.nomorRekening = "202410370110343\n";
        rekening2.namaPemilik="Zaskia\n";
        rekening2.saldo= 450000;

        //nampilin informasi awal
        rekening1.tampilkanInfo();
        rekening2.tampilkanInfo();

        //input setor uang
        System.out.println("Masukkan jumlah uang(Rekening Vanisa):");
        double setorUangVanisa = scan.nextDouble();
        rekening1.setorUang(setorUangVanisa);

        System.out.println("Masukkan jumlah uang(Rekening Zaskia):");
        double setorUangZaskia = scan.nextDouble();
        rekening2.setorUang(setorUangZaskia);

        //input narik uang
        System.out.println("Masukkan jumlah uang yang ingin anda tarik(Rekening Vanisa):");
        double narikUangVanisa = scan.nextDouble();
        rekening1.narikUang(narikUangVanisa);

        System.out.println("\nMasukkan jumlah uang yang ingin anda tarik(Rekening Zaskia):");
        double narikUangZaskia = scan.nextDouble();
        rekening2.narikUang(narikUangZaskia);

        //nampilin informasi setelah penyetoran dan penarikan
        System.out.println("\nInformasi terakhir rekening:\n");
        rekening1.tampilkanInfo();
        rekening2.tampilkanInfo();





    }
}