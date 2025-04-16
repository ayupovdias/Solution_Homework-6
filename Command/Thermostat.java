public class Thermostat{
    private int temperature;
    public void setTemperature(int temperature){
        this.temperature=temperature;
        System.out.println("[Thermostat] Setting temperature to "+temperature+ " C");
    }
    public int getTemperature(){
        return temperature;
    }
}
