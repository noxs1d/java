package com.epam.rd.autotasks;

public class CompleteByRequestTask implements Task {
    private boolean finished;
    private boolean completed;

    public CompleteByRequestTask() {
        this.finished = false;
        this.completed=false;
    }

    @Override
    public void execute() {
        if(completed){
            finished=true;
        }
    }

    @Override
    public boolean isFinished() {
        return finished;
    }

    public void complete() {
        completed=true;
    }
}
