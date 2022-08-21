package com.corn.observer.simple;

import java.util.ArrayList;
import java.util.List;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class SimpleSubject implements Subject{
    private List<Observer> observerList = new ArrayList<>();
    private int value = 0;

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observerList) {
            observer.update(value);
        }
    }

    public void setValue(int value) {
        this.value = value;
        notifyObserver();
    }
}
