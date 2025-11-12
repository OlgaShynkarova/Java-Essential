package Homework3.Task2;

public class BadPupil extends Pupil{
    @Override
    public void study(){
        System.out.println("Bad pupil studies poorly.");
    }
    @Override
    public void read(){
        System.out.println("Bad pupil reads slowly.");
    }
    @Override
    public void write(){
        System.out.println("Bad pupil writes illiterately.");
    }
    @Override
    public void relax(){
        System.out.println("Bad pupil resting.");
    }
}