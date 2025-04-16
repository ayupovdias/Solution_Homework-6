public abstract class SupportHandler {
    SupportHandler supportHandler;
    public SupportHandler set_next(SupportHandler handler){
        supportHandler=handler;
        return supportHandler;
    }
    public abstract void handle(String issue);
}