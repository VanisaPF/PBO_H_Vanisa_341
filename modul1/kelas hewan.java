public class Main {
    public static class Hewan { //kelas hewan
       //ngedeklair tipe data
        String name;
        String jenis;
        String suara;


        void tampilkaninfo() {
            //menampilkan info hewan
            System.out.println("Nama: " + name + "Jenis: " + jenis + "Suara: " + suara);
        }

    }
    public static void main(String[] args) {
        //buat 2 objek dari class hewan
            Hewan hewan1 = new Hewan();
            Hewan hewan2 = new Hewan();

            //mengisi data hewan
            hewan1.name =  "Kucing\n";
            hewan1.jenis = "Mamalia\n";
            hewan1.suara = "Nyann~~\n\n";
            hewan2.name =  "Anjing\n";
            hewan2.jenis = "Mamalia\n";
            hewan2.suara = "Woof-Woof!! ";

            //memanggil tampilkan info
           hewan1.tampilkaninfo();
           hewan2.tampilkaninfo();


        }
    }

