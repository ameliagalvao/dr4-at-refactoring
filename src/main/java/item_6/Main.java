package item_6;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Document> documents = Arrays.asList(
                new PdfDocument(),
                new HtmlDocument(),
                new UnknownDocument()
        );

        for (Document doc : documents) {
            doc.print();
        }
    }
}