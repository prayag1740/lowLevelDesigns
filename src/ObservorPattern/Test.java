package ObservorPattern;

import ObservorPattern.observable.IphoneObservable;
import ObservorPattern.observable.StocksObservable;
import ObservorPattern.observor.EmailAlertObservor;
import ObservorPattern.observor.MobileAlertObservor;
import ObservorPattern.observor.NotificationAlertObservor;

public class Test {

    public static void main(String[] args) {

        StocksObservable iphoneStockObservable = new IphoneObservable();
        NotificationAlertObservor obs1 = new EmailAlertObservor("xyz@gmail.com", iphoneStockObservable);
        NotificationAlertObservor obs2 = new EmailAlertObservor("abc@gmail.com", iphoneStockObservable);
        NotificationAlertObservor obs3 = new MobileAlertObservor("xyz2@gmail.com",iphoneStockObservable);

        iphoneStockObservable.add(obs1);
        iphoneStockObservable.add(obs2);
        iphoneStockObservable.add(obs3);

        iphoneStockObservable.setStockCount(10);

    }



}
