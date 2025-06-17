package item_1;

import java.util.List;

public class FrequencyClassifier {

    private final List<FrequencyClassifierStrategy> frequencyStrategies;

    public FrequencyClassifier(List<FrequencyClassifierStrategy> frequencyStrategies) {
        this.frequencyStrategies = frequencyStrategies;
    }

    public void classifyByFrequency(int frequency) {
        for (FrequencyClassifierStrategy strategy : frequencyStrategies) {
            if (strategy.classifyByFrequency(frequency)) {
                System.out.println(strategy.getMensagem());
                return;
            }
        }
    }
}