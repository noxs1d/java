package com.epam.rd.autotasks.sprintplanning.tickets;

public class UserStory extends Ticket {
    private UserStory[] dependsOn;
    public UserStory(int id, String name, int estimate, UserStory... dependsOn) {
        super(id, name, estimate);
        this.dependsOn = dependsOn != null ? dependsOn.clone() : new UserStory[0];

    }

    @Override
    public void complete() {
        isCompleted=true;
    for(UserStory d : dependsOn){
        if(!d.isCompleted()){
            isCompleted=false;
            break;
        }
    }
    }

    public UserStory[] getDependencies() {
        return dependsOn.clone();
    }

    @Override
    public String toString() {
        return "[US " + getId() + "] " + getName();

    }
}
