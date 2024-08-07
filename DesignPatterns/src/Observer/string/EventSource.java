package Observer.string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EventSource {
    List<Observer> observers = new ArrayList<>();

    public EventSource(){}//no arg ctor

    public void notifyObservers(String event) {
        observers.forEach(observer -> observer.update(event));
    }//end notifyObservers

    public void addObserver(Observer observer) {
        observers.add(observer);
    }//end addObserver

    public void scanSystemIn() {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            notifyObservers(line);
        }//end while
    }//end scanSystemIn
}//end EventSource
