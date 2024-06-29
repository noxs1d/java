package com.epam.rd.autotasks.sprintplanning;

import com.epam.rd.autotasks.sprintplanning.tickets.Bug;
import com.epam.rd.autotasks.sprintplanning.tickets.Ticket;
import com.epam.rd.autotasks.sprintplanning.tickets.UserStory;

public class Sprint {
    private int capacity;
    private int ticketsLimit;
    private Ticket[] tickets;
    private int ticketCount;
    private int totalEstimate;


    public Sprint(int capacity, int ticketsLimit) {
        this.capacity=capacity;
        this.ticketsLimit=ticketsLimit;
        this.tickets = new Ticket[ticketsLimit];
        this.ticketCount = 0;
        this.totalEstimate = 0;
    }

    public boolean addUserStory(UserStory userStory) {
        if (userStory == null || userStory.isCompleted() || ticketCount >= ticketsLimit ||
                totalEstimate + userStory.getEstimate() > capacity) {
            return false;
        }
        for (UserStory dependency : userStory.getDependencies()) {
            if (!dependency.isCompleted() || !isInSprint(dependency)) {
                return false;
            }
        }
        tickets[ticketCount++] = userStory;
        totalEstimate += userStory.getEstimate();
        return true;
    }

    public boolean addBug(Bug bugReport) {
        if (bugReport == null || bugReport.isCompleted() || ticketCount >= ticketsLimit ||
                totalEstimate + bugReport.getEstimate() > capacity) {
            return false;
        }
        tickets[ticketCount++] = bugReport;
        totalEstimate += bugReport.getEstimate();
        return true;
    }
    private boolean isInSprint(UserStory userStory) {
        for (int i = 0; i < ticketCount; i++) {
            if (tickets[i] == userStory) {
                return true;
            }
        }
        return false;
    }
    public Ticket[] getTickets() {
        Ticket[] result = new Ticket[ticketCount];
        System.arraycopy(tickets, 0, result, 0, ticketCount);
        return result;    }

    public int getTotalEstimate() {
        return totalEstimate;

    }
}
