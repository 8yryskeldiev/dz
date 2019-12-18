package com.company;

public class Compilator<T extends  Number> implements Countable <T> {
private T number;

    public T getNumber() {
        return number;
    }

    public Compilator(T number) {
        this.number = number;
    }

    @Override
    public void showTask(T t) {
        this.number=number;
    }

    @Override
    public T countTask() {
        return getNumber() ;
    }
}
