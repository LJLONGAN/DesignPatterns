package Observer.store;

public class Store {
    private final NotificationService notificationService;

    public Store(){
        notificationService = new NotificationService();
    }//end ctor

    public void newItemPromo(){
        notificationService.notifyCustomers();
    }//end newItemPromo

    public NotificationService getNotificationService(){
        return notificationService;
    }//end notificationService
}//end Store
