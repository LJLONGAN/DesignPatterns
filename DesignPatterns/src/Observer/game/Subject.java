package Observer.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Subject {

    List<Observer> observers = new ArrayList<>();

    public Subject(){}// no arg ctor

    public void addObserver(Observer observer){
        observers.add(observer);
    }//end addObserver

    public void removeObserver(Observer observer){
        observers.remove(observer);
    }//end removeObserver

    public void notifyObservers(String event){
        for(Observer observer : observers) {
            observer.update(event);
        }//end for
    }//end notifyObservers

    public void scanSystemIn() {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            notifyObservers(line);
            showObservers();
        }//end while
    }//end scanSystemIn

    public void showObservers(){
        for(Observer observer : observers) {
            System.out.println(observer);
        }//end for
    }//end showObservers
}//end Subject