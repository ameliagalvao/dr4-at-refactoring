package item_2;

public class Client {
    private final String name;
    private final String email;

    public Client(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public boolean isEmailValid() {
        return email != null && email.contains("@");
    }
}
