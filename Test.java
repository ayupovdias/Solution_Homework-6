public class Test {
    public static void main(String[] args){
        SupportHandler faq=new FAQBotHandler();
        SupportHandler junior=new JuniorSupportHandler();
        SupportHandler senior=new SeniorSupportHandler();
        faq.set_next(junior).set_next(senior);
        String[] issues=new String[]{"password_reset","refund_request","account_ban","unknown_bug"};
        for(String issue : issues){
            faq.handle(issue);
        }
    }
}