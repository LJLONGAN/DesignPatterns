package Observer.store;

import java.util.ArrayList;
import java.util.List;

public class NotificationService{
    private final List<EmailMsgListener> customers;

    public NotificationService(){
        customers = new ArrayList<>();
    }//end NotificationService

    public void subscribe(EmailMsgListener listener){
        customers.add(listener);
    }//end subscribe

    public void unsubscribe(EmailMsgListener listener){
        customers.remove(listener);
    }//end unsubscribe

    public void notifyCustomers(){
        for (EmailMsgListener customer : customers) {
            customer.update();
        }//end for
    }//end notifyCustomers

    public void displayCustomers(){
        for (EmailMsgListener customer : customers) {
            System.out.println(customer);
        }//end for
    }//end displayCustomers
}//end NotificationService