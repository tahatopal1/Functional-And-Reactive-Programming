package Section16_ReactiveProgramming.Section116_Observer;

// Observable
public interface SubjectLibrary {

    public void subscribeObserver(Observer ob);
    public void unsubscribeObserver(Observer ob);
    public void notifyObserver();

}
