package item_4;

public class Address {
    private final String street;
    private final String city;
    private final String state;
    private final String zipCode;
    private final String description;

    public Address(String street, String city, String state, String zipCode, String description) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.description = description;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return description + ", " + street + ", " + city + " - " + state + ", " + zipCode;
    }
}
