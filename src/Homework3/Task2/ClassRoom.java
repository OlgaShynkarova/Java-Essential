package Homework3.Task2;

public class ClassRoom {
    private Pupil[] pupils;
    public ClassRoom(Pupil p1, Pupil p2) {
        this.pupils = new Pupil[]{p1, p2};
    }
    public ClassRoom(Pupil p1, Pupil p2, Pupil p3) {
        this.pupils = new Pupil[]{p1, p2, p3};
    }
    public ClassRoom(Pupil p1, Pupil p2,Pupil p3, Pupil p4) {
        this.pupils = new Pupil[]{p1, p2, p3, p4};
    }
    public void showPupilSkills(){
        int i = 1;
        for (Pupil pupil:pupils) {
            System.out.println("Pupil " + i + " :");
            pupil.study();
            pupil.read();
            pupil.write();
            pupil.relax();
            i++;
        }
    }
}