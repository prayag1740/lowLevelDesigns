package ObservorPattern.observor;

import ObservorPattern.observable.StocksObservable;

public class EmailAlertObservor implements NotificationAlertObservor{

    String emailId ;
    StocksObservable observable ;

    public EmailAlertObservor(String emailId, StocksObservable observable) {
        this.observable = observable ;
        this.emailId = emailId ;
    }

    public void sendMail(String emailId, String msg) {
        System.out.println("email sent to :" + emailId + "with message as " + msg);
    }
    @Override
    public void update() {
        String msg = "Product is in stock !! hurrray" ;
        sendMail(emailId, msg);
    }
}
