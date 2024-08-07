package Observer.game;

public class ObserverDemo {
    public static void main(String[] args){
        System.out.println("ObserverDemo start.");
        Subject subject = new Subject();
        PlayerObserver playerObserver = new PlayerObserver();
        EnemyObserver enemyObserver = new EnemyObserver();
        subject.addObserver(playerObserver);
        subject.addObserver(enemyObserver);
        subject.showObservers();

        subject.addObserver(new Observer() {
            @Override
            public void update(String event) {
                System.out.println("Received response: " + event);
            }
        });
        subject.showObservers();

    }//end main
}//end ObserverDmo
