import java.util.Scanner;

public class LoginSederhana {

    public static void main(String[] args) {
        Scanner choose = new Scanner(System.in);
        String username, password;
        String nama, NIM;


        System.out.println("Pilih login: ");
        System.out.println("1.Admin");
        System.out.println("2.Mahasiswa");
        System.out.println("Masukkan pilihan: ");
        int pilihan = choose.nextInt();
        choose.nextLine();


        if (pilihan == 1) {
            System.out.println("Masukkan username: ");
            username= choose.nextLine();
            System.out.println("Masukkan password: ");
            password = choose.nextLine();
            if (username.equals("Admin341")) {
                if (password.equals("password341")) {
                    System.out.println("Login Admin berhasil!");
                }
            } else {
                System.out.println("Login gagal! username atau password salah.");
            }
        } else if (pilihan == 2) {
            System.out.println("Masukkan nama:");
            nama = choose.nextLine();
            System.out.println("Masukkan NIM:");
            NIM = choose.nextLine();
            if(nama.equals("Vanisa Putri Fransisca")) {
                if(NIM.equals("202410370110341")){
                    System.out.println("Login Mahasiswa berhasil!");
                }
            } else {
                System.out.println("Login gagal! Nama atau NIM salah.");
            }
        } else {
            System.out.println("Pilihan tidak valid!");
        }
        choose.close();
    }

}

