public class konstuktor {
    public String username;
    public String password;

    public konstuktor(String username, String password){
        this.username = username;
        this.password = password;
    }

}


    class konstuktorr{
    public static void main(String[] args) {
        konstuktor SiaUniska = new konstuktor("18630255", "blablabla");
        System.out.println("Username: " + SiaUniska.username);
        System.out.println("Password: " + SiaUniska.password);
    }
}
