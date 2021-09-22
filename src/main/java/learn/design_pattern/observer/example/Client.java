package learn.design_pattern.observer.example;

import learn.design_pattern.observer.example.observer.ConcreteObserver1;
import learn.design_pattern.observer.example.observer.ConcreteObserver2;
import learn.design_pattern.observer.example.observer.Observer;
import learn.design_pattern.observer.example.subject.ConcreteSubject;
import learn.design_pattern.observer.example.subject.Subject;

public class Client {
    public static void main(String[] args) {
        Observer observer = new ConcreteObserver1();
        Observer observer2 = new ConcreteObserver2();

        Subject subject = new ConcreteSubject();
        subject.add(observer);
        subject.add(observer2);
        subject.notifyObserver();
    }
}
