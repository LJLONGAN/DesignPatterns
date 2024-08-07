package Observer.store;

public class EmailMsgListener implements EventListener{
    private final String email;

    public EmailMsgListener(String email){
        this.email = email;
    }//ctor

    @Override
    public void update(){
        System.out.println("Email sent");
    }//end update
}//end EmailMsgListener
