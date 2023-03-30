package com.OOP.interfaces;

public class Car {
    private Engine engine;
    private Media player= new MediaPlayer();
    public Car(){
        engine = new PowerEngine();
    }
    public Car(Engine engine){
        this.engine = engine;
    }
    public void start(){
        engine.start();
    }
    public void stop(){
        engine.stop();
    }
    public void startMusic(){
        player.start();
    }
    public void stopMusic(){
        player.stop();
    }

    public void upgradeEngine(){
        this.engine = new ElectricEngine();
    }
}
