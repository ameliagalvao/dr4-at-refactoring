import item_1.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class FrequencyClassifierTest {
    private FrequencyClassifier classifier;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    void setup() {
        classifier = new FrequencyClassifier(Arrays.asList(
                new HighFrequency(),
                new MediumFrequency(),
                new LowFrequency(),
                new RareFrequency()
        ));
        System.setOut(new PrintStream(outContent));
    }

    @Test
    void testClassificaBaixo() {
        classifier.classifyByFrequency(5);
        assertTrue(outContent.toString().contains("BAIXO"));
    }

    @Test
    void testClassificaMedio() {
        classifier.classifyByFrequency(10);
        assertTrue(outContent.toString().contains("MÉDIO"));
    }

    @Test
    void testClassificaAlto() {
        classifier.classifyByFrequency(15);
        assertTrue(outContent.toString().contains("ALTO"));
    }

    @Test
    void testClassificaCasoRaro() {
        classifier.classifyByFrequency(-9999);
        assertTrue(outContent.toString().contains("CASO RARO"));
    }
}
