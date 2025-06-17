package item_2;

public enum InvoiceType {
    SIMPLES("Simples"),
    COM_IMPOSTO("Com imposto"),
    FANTASMA("Fantasma"),
    DESCONHECIDO("Desconhecido");

    private final String description;

    InvoiceType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
