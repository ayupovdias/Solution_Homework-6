public class FAQBotHandler extends SupportHandler {
    public void handle(String issue){
        if(issue.equalsIgnoreCase("password_reset")){
            System.out.println("[FAQBot] Handled "+issue.toLowerCase());

        }
        if(supportHandler!=null){
            supportHandler.handle(issue);
        }
    }
}
