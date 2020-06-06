package org.example.bean;

public class CricketCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "practice spin bowling today.";
    }
}
