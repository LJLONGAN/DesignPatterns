package Observer.store;

public class StoreDemo {
    public static void main(String[] args){
        Store store = new Store();
        store.getNotificationService().subscribe(new EmailMsgListener("name1@fake.com"));
        store.getNotificationService().subscribe(new EmailMsgListener("name2@fake.com"));
        store.getNotificationService().subscribe(new EmailMsgListener("name3@fake.com"));
        store.newItemPromo();
        store.getNotificationService().displayCustomers();
    }//end main
}//end StoreDemo
