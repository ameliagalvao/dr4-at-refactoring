package item_1;

public class MediumFrequency implements FrequencyClassifierStrategy {
    @Override
    public boolean classifyByFrequency(int frequency){
        return frequency == FrequencyThresholds.MEDIUM_FREQUENCY;
    }
    @Override
    public String getMensagem(){
        return "MÉDIO";
    }
}
