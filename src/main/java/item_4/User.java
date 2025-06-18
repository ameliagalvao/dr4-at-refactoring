package item_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class User {
    private String name;
    private String email;
    private final List<Address> addresses;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
        this.addresses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void addAddress(Address address) {
        addresses.add(address);
    }

    public List<Address> getAddresses() {
        return Collections.unmodifiableList(addresses);
    }

    public String getInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("Usuário: ").append(name)
                .append(" (").append(email).append(")\nEndereços:\n");

        for (Address addr : addresses) {
            sb.append("- ").append(addr.toString()).append("\n");
        }

        return sb.toString();
    }
}