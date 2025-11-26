package Homework7.Task2;

public class Worker {
    private String surnameInitials;
    private String jobTitle;
    private int yearOfEmployment;

    public Worker(String surnameInitials, String jobTitle, int yearOfEmployment) {
        this.surnameInitials = surnameInitials;
        this.jobTitle = jobTitle;
        this.yearOfEmployment = yearOfEmployment;
    }
    public String getSurnameInitials() {
        return surnameInitials;
    }
    public String getJobTitle() {
        return jobTitle;
    }
    public int getYearOfEmployment() {
        return yearOfEmployment;
    }
}