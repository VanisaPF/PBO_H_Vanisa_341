public class User {
    private String name;
    private String NIM;
    public boolean login(String x, String y){
       return false;
    }


    User(String name, String NIM){
        this.name = name;
        this.NIM = NIM;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public String getNIM() {
        return NIM;
    }
    public void displayInfo(){
        System.out.println("Login sukses");
        System.out.println("Nama: "+name);
        System.out.println("NIM: "+NIM);
    }
}



