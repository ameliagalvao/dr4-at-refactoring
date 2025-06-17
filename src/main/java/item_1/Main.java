package item_1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        FrequencyClassifier frequencyClassifier = new FrequencyClassifier(Arrays.asList(
                new HighFrequency(),
                new MediumFrequency(),
                new LowFrequency(),
                new RareFrequency()
        ));

        frequencyClassifier.classifyByFrequency(5);
        frequencyClassifier.classifyByFrequency(10);
        frequencyClassifier.classifyByFrequency(15);
        frequencyClassifier.classifyByFrequency(-9999);
    }
}