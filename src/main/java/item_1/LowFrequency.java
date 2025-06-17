package item_1;

public class LowFrequency  implements FrequencyClassifierStrategy {
    @Override
    public boolean classifyByFrequency(int frequency){
        return frequency < FrequencyThresholds.MEDIUM_FREQUENCY && frequency > FrequencyThresholds.RARE_FREQUENCY;
    }
    @Override
    public String getMensagem(){
        return "BAIXO";
    }
}
