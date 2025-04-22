// Superclass Karakter dalam game
class GameKarakter {
    private String name;
    private int kesehatan;

    // Constructor
    public GameKarakter(String name, int kesehatan) {
        this.name = name;
        this.kesehatan = kesehatan;
    }
    //metode yang bisa di override subclass
    public void serang(GameKarakter target) {
        System.out.println(name + " attack " + target.name+ "!");
    }

    // Getter, mengambil nama karakter
    public String getName() {
        return name;
    }
    //setter, mengubah
    public void setName(String name) {
        this.name = name;
    }
    //getter, mengambil nilai kesehatan
    public int getKesehatan() {
        return kesehatan;
    }
    //setter,mengubah nilai karakter
    public void setKesehatan(int kesehatan) {
        this.kesehatan = kesehatan;
    }

    // Method menampilkan status karakter
    public void tampilkanStatus() {
        System.out.println(name + " memiliki kesehatan: " + kesehatan);
    }
}

// Subclass Pahlawan
class Pahlawan extends GameKarakter {
    public Pahlawan(String name, int kesehatan) {
        super(name, kesehatan);
    }
    //override serang metode dari superclass
    @Override
    public void serang(GameKarakter target) {
        System.out.println(getName() + " menyerang " + target.getName() + " menggunakan Orbital Strike!");
        target.setKesehatan(target.getKesehatan() - 20);
        System.out.println("Kesehatan " + target.getName() + " menurun." +"Kesehatan " + target.getName()+" sekarang: " + target.getKesehatan());
    }
}

// Subclass Musuh
class Musuh extends GameKarakter {
    public Musuh(String name, int kesehatan) {
        super(name, kesehatan);
    }
    //metode override serang dari superclass
    @Override
    public void serang(GameKarakter target) {
        System.out.println(getName() + " menyerang " + target.getName() + " menggunakan Snake Bite!!");
        target.setKesehatan(target.getKesehatan() - 15);
        System.out.println(target.getName() + " sekarang memiliki kesehatan " + target.getKesehatan());
    }
}

// Kelas Main (Kelas utama)
public class Main {
    public static void main(String[] args) {
        // Membuat objek karakter
        GameKarakter karakterUmum = new GameKarakter("Karakter Umum", 100);
        Pahlawan brimstone = new Pahlawan("Brimstone", 150);
        Musuh viper = new Musuh("Viper", 200);

        // Menampilkan status awal
        System.out.println("Status awal:");
        brimstone.tampilkanStatus();
        viper.tampilkanStatus();

        // Simulasi pertarungan
        System.out.println("\nFight Starts!");
        brimstone.serang(viper);
        viper.serang(brimstone);
    }
}