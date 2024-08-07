package Observer.string;

public class StringDemo {
    public static void main(String[] args) {
        System.out.println("Enter Text: ");
        EventSource eventSource = new EventSource();

        //lambda expression
        //eventSource.addObserver(event -> System.out.println("Received response: " + event));

        //anonymous class
        eventSource.addObserver(new Observer() {
            @Override
            public void update(String event) {
                System.out.println("Received response: " + event);
            }
        });

        eventSource.scanSystemIn();
    }//end main
}//end StringDemo