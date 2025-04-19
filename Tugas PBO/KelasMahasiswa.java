public class KelasMahasiswa {
    private String nama = "Vanisa Putri Fransisca";
    private String NIM = "202410370110341";

    public boolean login(String inputNama, String inputNim){
        return inputNama.equals(nama) && inputNim.equals(NIM);
    }
    public void displayInfo(){
        System.out.println("Login sukses!");
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + NIM);
    }
}
