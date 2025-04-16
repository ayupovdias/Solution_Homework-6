public class SetThermostatCommand implements Command{
    private Thermostat thermostat;
    private int newTemp;
    private int prevTemp;
    public SetThermostatCommand(Thermostat thermostat,int newTemp){
        this.thermostat=thermostat;
        this.newTemp=newTemp;
    }
    public void execute(){
        prevTemp=thermostat.getTemperature();
        thermostat.setTemperature(newTemp);
    }
    public void undo(){
        thermostat.setTemperature(prevTemp);
        System.out.println("[Thermostat] Reverting to previous temperature "+prevTemp+" C");
    }
}
