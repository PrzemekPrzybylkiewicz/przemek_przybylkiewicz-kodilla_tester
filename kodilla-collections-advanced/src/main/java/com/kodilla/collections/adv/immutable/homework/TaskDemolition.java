package com.kodilla.collections.adv.immutable.homework;

public class TaskDemolition extends Task {
    private int trueDuration;

    public TaskDemolition(String title, int duration) {
        super(title, duration);
        trueDuration = duration;
    }

    public void demolitionHammer(int newDuration){
        trueDuration = newDuration;
    }
    public int getDuration() {
        return trueDuration;
    }
}
