package com.epam.rd.autotasks;

import java.util.Optional;

public enum Direction {
    N(0), NE(45), E(90), SE(135), S(180), SW(225), W(270), NW(315);

    Direction(final int degrees) {
        this.degrees = degrees;
    }

    private int degrees;

    public static Direction ofDegrees(int degrees) {
    degrees=degrees%360;
    if(degrees<0){
        degrees+=360;
    }
    for (Direction direction : Direction.values()){
        if(direction.degrees==degrees){
            return direction;
        }
    }
    return null;
    }

    public static Direction closestToDegrees(int degrees) {
        degrees = degrees % 360;
        if (degrees < 0) {
            degrees += 360;
        }
        Direction closest = null;
        int minDifference = Integer.MAX_VALUE;

        for (Direction direction : Direction.values()) {
            int difference = Math.abs(direction.degrees - degrees);
            // Adjust the difference for the circular nature of the compass
            difference = Math.min(difference, 360 - difference);
            if (difference < minDifference) {
                minDifference = difference;
                closest = direction;
            }
        }
        return closest;
    }

    public Direction opposite() {
        int oppositeDegree=(this.degrees+180)%360;
        return ofDegrees(oppositeDegree);
    }

    public int differenceDegreesTo(Direction direction) {
        int diference=Math.abs(this.degrees-direction.degrees);
        return Math.min(diference,360-diference);
    }
}
