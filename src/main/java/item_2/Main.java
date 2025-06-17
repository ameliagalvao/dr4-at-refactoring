package item_2;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Maria", "maria@email.com");
        Invoice invoice = new Invoice(client, 1500.0, InvoiceType.SIMPLES);
        System.out.println(invoice);
        invoice.sendByEmail();
    }
}
