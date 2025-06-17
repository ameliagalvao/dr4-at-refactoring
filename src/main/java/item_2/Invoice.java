package item_2;

public class Invoice {
    private final Client client;
    private final double amount;
    private final InvoiceType type;

    public Invoice(Client client, double amount, InvoiceType type) {
        if (!client.isEmailValid()) {
            throw new IllegalArgumentException("Email inválido.");
        }
        this.client = client;
        this.amount = amount;
        this.type = type;
    }

    @Override
    public String toString() {
        return "--- NOTA FISCAL ---\n" +
                "Cliente: " + client.getName() + "\n" +
                "Valor: R$ " + amount + "\n" +
                "Tipo: " + type.getDescription() + "\n" +
                "---------------------";
    }

    public void printInvoice() {
        System.out.println(this);
    }

    public void sendByEmail() {
        System.out.println("Enviando email para: " + client.getEmail());
        System.out.println("Conteúdo:\n" + this);
    }

}
