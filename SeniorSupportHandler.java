public class SeniorSupportHandler extends SupportHandler{
    public void handle(String issue){
        if(issue.equalsIgnoreCase("account_ban") || issue.equalsIgnoreCase("data_lose")){
            System.out.println("[SeniorSupport] Handled "+issue);
        }
        else if(issue.equalsIgnoreCase("password_reset") ||
                issue.equalsIgnoreCase("refund_request") ||
                issue.equalsIgnoreCase("billing_issue")){

        }
        else{
            System.out.println("[SeniorSupport] Cannot handle "+issue+" - escalate manually");
        }
        if(supportHandler!=null){
            supportHandler.handle(issue);
        }
    }
}
