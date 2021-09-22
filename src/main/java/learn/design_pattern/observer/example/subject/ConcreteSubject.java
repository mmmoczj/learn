package learn.design_pattern.observer.example.subject;

import learn.design_pattern.observer.example.observer.Observer;

public class ConcreteSubject extends Subject {
    @Override
    public void notifyObserver() {
        System.out.println("具体目标发生改变...");
        System.out.println("--------------");
        observers.forEach(Observer::response);
    }
}
