package Homework4.Task3;

public class Player implements Playable, Recordable{
    @Override
    public void play() {
        System.out.println("Recording is playing.");
    }
    @Override
    public void record() {
        System.out.println("Recording in progress.");
    }
    @Override
    public void pause() {
        System.out.println("Recording paused.");
    }
    @Override
    public void stop() {
        System.out.println("Recording stopped.");
    }
}