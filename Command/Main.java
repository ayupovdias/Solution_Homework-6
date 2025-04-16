public class Main {
    public static void main(String[] args){
        Command command=new TurnOnLightCommand(new Light());
        Command commandOne=new SetThermostatCommand(new Thermostat(),22);
        SmartHomeRemoteControl remote=new SmartHomeRemoteControl();
        remote.setCommand("Turn on light",command);
        remote.setCommand("Set temperature",commandOne);
        remote.press_button("Turn on light");
        remote.press_button("Set temperature");
        remote.undo_button();

    }
}
