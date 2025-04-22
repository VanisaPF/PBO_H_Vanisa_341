import java.time.LocalDate; //pakai tahun sekarang
import java.util.Scanner;//karena pakai scanner


public class codelab { //nama class
    public static void main(String[] args) { //kode untuk method main
        //scanner untuk menginput
        Scanner scan = new Scanner(System.in);
        //mendeklarasikan tipe data
        String name;
        char jenisKelamin;
        int tahunLahir;

        System.out.print("Masukkan nama: "); //output
        name = scan.nextLine(); //input sesuai tipe data

        System.out.print("Masukkan jenis kelamin (P/L): ");
        jenisKelamin = scan.next().charAt(0);

        System.out.print("Masukkan tahun lahir: ");
        tahunLahir = scan.nextInt();

        //menutup pemindai yang dibuat dengan system.in, jadi tidak dapat digunakkan setelahnya
        scan.close();

        int yearNow = LocalDate.now().getYear(); //pakai tahun sekarang
        int umur = yearNow - tahunLahir; //untuk menghitung umur pengguna

        // menentukan jenis kelamin pakai switch-case
        String genderStr;
        switch (Character.toLowerCase(jenisKelamin)) { //agar bisa pakai huruf kecil juga
            case 'l':
                genderStr = "Laki-laki";
                break;
            case 'p':
                genderStr = "Perempuan";
                break;
            default:
               genderStr = "Tidak diketahui";
        }
        //output
        System.out.println("\nData Diri:");
        System.out.println("Nama: " + name);//memanggil name
        System.out.println("Jenis Kelamin: " + genderStr);
        System.out.println("Umur: " + umur + " tahun");

    }
}
