package com.company_abc;

import java.util.Date;

public class Candidate {
    private String name;
    private Date dob;
    private double hscPCMPercent;
    private double ugCgpa;
    private double pgCgpa;
    private int numProjects;
    private boolean isFullTime;
    private int interviewMarks;
    private String citizenship;


    public Candidate(String name, Date dob, double hscPCMPercent, double ugCgpa, double pgCgpa, int numProjects, boolean isFullTime, int interviewMarks, String citizenship) {
        this.name = name;
        this.dob = dob;
        this.hscPCMPercent = hscPCMPercent;
        this.ugCgpa = ugCgpa;
        this.pgCgpa = pgCgpa;
        this.numProjects = numProjects;
        this.isFullTime = isFullTime;
        this.interviewMarks = interviewMarks;
        this.citizenship = citizenship;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public double getHscPCMPercent() {
        return hscPCMPercent;
    }

    public void setHscPCMPercent(double hscPCMPercent) {
        this.hscPCMPercent = hscPCMPercent;
    }

    public double getUgCgpa() {
        return ugCgpa;
    }

    public void setUgCgpa(double ugCgpa) {
        this.ugCgpa = ugCgpa;
    }

    public double getPgCgpa() {
        return pgCgpa;
    }

    public void setPgCgpa(double pgCgpa) {
        this.pgCgpa = pgCgpa;
    }

    public int getNumProjects() {
        return numProjects;
    }

    public void setNumProjects(int numProjects) {
        this.numProjects = numProjects;
    }

    public boolean isFullTime() {
        return isFullTime;
    }

    public void setFullTime(boolean fullTime) {
        isFullTime = fullTime;
    }

    public int getInterviewMarks() {
        return interviewMarks;
    }

    public void setInterviewMarks(int interviewMarks) {
        this.interviewMarks = interviewMarks;
    }

    public String getCitizenship() {
        return citizenship;
    }

    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }

}