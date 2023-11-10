package ObservorPattern.observor;

import ObservorPattern.observable.StocksObservable;

public class MobileAlertObservor implements NotificationAlertObservor{

    String emailId ;
    StocksObservable observable ;

    public MobileAlertObservor(String emailId, StocksObservable observable) {
        this.observable = observable ;
        this.emailId = emailId ;
    }

    public void sendMsg(String emailId, String msg) {
        System.out.println("msg sent to :" + emailId + "with message as " + msg);
    }
    @Override
    public void update() {
        String msg = "Product is in stock !! hurrray" ;
        sendMsg(emailId, msg);
    }
}
