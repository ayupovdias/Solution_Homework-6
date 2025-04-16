import java.util.Map;
import java.util.HashMap;
import java.util.Stack;
public class SmartHomeRemoteControl {
    private Map<String, Command> slots=new HashMap<>();
    private Stack<Command> history=new Stack<>();
    public void setCommand(String text,Command command){
        slots.put(text,command);
    }
    public void press_button(String slot){
        Command command=slots.get(slot);
        if(command!=null){
            command.execute();
            history.push(command);
        }
        else{
            System.out.println("There is no such a command as "+slot);
        }
    }
    public void undo_button(){
        if(!history.isEmpty()){
            Command lastCommand=history.pop();
            System.out.println("Undo the last command");
            lastCommand.undo();
        }
        else{
            System.out.println("Nothing undoes");
        }
    }
}
