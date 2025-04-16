public class JuniorSupportHandler extends SupportHandler{
    public void handle(String issue){
        if(issue.equalsIgnoreCase("refund_request") || issue.equalsIgnoreCase("billing_issue")){
            System.out.println("[JuniorSupport] Handled "+issue);
        }
        if(supportHandler!=null){
            supportHandler.handle(issue);
        }
    }
}
