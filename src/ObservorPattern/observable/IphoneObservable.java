package ObservorPattern.observable;


import ObservorPattern.observor.NotificationAlertObservor;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservable implements StocksObservable {

    public List<NotificationAlertObservor> observerList = new ArrayList<>();
    public int stockCount = 0;

    @Override
    public void add(NotificationAlertObservor observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(NotificationAlertObservor observer) {
    observerList.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for (NotificationAlertObservor observer : observerList) {
            observer.update() ;
        }
    }

    @Override
    public void setStockCount(int newStockAdded) {
        if (stockCount == 0) {
            notifySubscribers();
        }
        stockCount = stockCount + newStockAdded ;
    }

    @Override
    public int getStockCount() {
        return stockCount ;
    }
}
