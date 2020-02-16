package com.kodilla.collections.adv.immutable.homework;

public class TaskDemolition {
    private int trueDuration;

    public TaskDemolition(String title, int duration) {

        trueDuration = duration;
    }

    public void demolitionHammer(int newDuration){
        trueDuration = newDuration;
    }
    public int getDuration() {
        return trueDuration;
    }
}
