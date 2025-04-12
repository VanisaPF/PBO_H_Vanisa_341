public class KelasAdmin {
    private String username = "Admin341";
    private String password = "password341";

    public boolean login(String inputUser, String inputPassword) {
        return inputUser.equals(username) && inputPassword.equals(password);
    }

}
