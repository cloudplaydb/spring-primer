package com.spring.primer.a.ioc;

import org.springframework.beans.factory.annotation.Autowired;

public class Car {
    private final Engine engine;
    private final Transmission transmission;

    @Autowired
    public Car(Engine engine, Transmission transmission) {
        this.engine = engine;
        this.transmission = transmission;
    }

    @Override
    public String toString() {
        return String.format("Engine: %s Transmission: %s", engine, transmission);
    }
}
