package Homework3.Task2;

public class GoodPupil extends Pupil{
    @Override
    public void study(){
        System.out.println("Good pupil studies well.");
    }
    @Override
    public void read(){
        System.out.println("Good pupil reads well.");
    }
    @Override
    public void write(){
        System.out.println("Good pupil writes correctly.");
    }
    @Override
    public void relax(){
        System.out.println("Good pupil resting.");
    }
}