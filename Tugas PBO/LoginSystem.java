import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
            Scanner choose = new Scanner(System.in);
            KelasAdmin admin = new KelasAdmin();
            KelasMahasiswa mahasiswa = new KelasMahasiswa();

            System.out.println("Pilih login: ");
            System.out.println("1.Admin");
            System.out.println("2.Mahasiswa");
            System.out.println("Masukkan pilihan anda: ");
            int pilihan = choose.nextInt();
            choose.nextLine();


            if (pilihan == 1) {
                System.out.println("Masukkan username: ");
                String user = choose.nextLine();
                System.out.println("Masukkan password: ");
                String password = choose.nextLine();

                if (admin.login(user, password)) {
                    System.out.println("Login Admin berhasil!");
                } else {
                    System.out.println("Error! Username atau Password salah.");
                }
            } else if (pilihan == 2) {
                System.out.println("Masukkan nama anda:");
                String nama = choose.nextLine();
                System.out.println("Masukkan NIM anda:");
                String NIM = choose.nextLine();
                if (mahasiswa.login(nama, NIM)) {
                    mahasiswa.displayInfo();
                } else {
                    System.out.println("Login gagal! Nama atau NIM salah.");
                }
            } else {
                System.out.println("Error! Pilihan anda tidak valid.");
            }
            choose.close();
        }

    }




