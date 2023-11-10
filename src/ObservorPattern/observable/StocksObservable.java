package ObservorPattern.observable;

import ObservorPattern.observor.NotificationAlertObservor;

public interface StocksObservable {

    public void add(NotificationAlertObservor observer) ;
    public void remove(NotificationAlertObservor observer) ;
    public void notifySubscribers() ;
    public void setStockCount(int newStockAdded) ;
    public int getStockCount() ;

}
