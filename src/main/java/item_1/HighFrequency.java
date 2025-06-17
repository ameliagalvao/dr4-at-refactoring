package item_1;

public class HighFrequency implements FrequencyClassifierStrategy {
    @Override
    public boolean classifyByFrequency(int frequency){
        return frequency > FrequencyThresholds.MEDIUM_FREQUENCY;
    }
    @Override
    public String getMensagem(){
        return "ALTO";
    }
}
