package com.epam.rd.autotasks;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Collection;

public class NewPostOffice {
    private final Collection<Box> listBox;
    private static final int COST_KILOGRAM = 5;
    private static final int COST_CUBIC_METER = 100;
    private static final double COEFFICIENT = 0.5;

    public NewPostOffice() {
        listBox = new ArrayList<>();
    }

    public Collection<Box> getListBox() {
        return (Collection<Box>) ((ArrayList<Box>) listBox).clone();
    }

    static BigDecimal calculateCostOfBox(double weight, double volume, int value) {
        BigDecimal costWeight = BigDecimal.valueOf(weight)
                .multiply(BigDecimal.valueOf(COST_KILOGRAM), MathContext.DECIMAL64);
        BigDecimal costVolume = BigDecimal.valueOf(volume)
                .multiply(BigDecimal.valueOf(COST_CUBIC_METER), MathContext.DECIMAL64);
        return costVolume.add(costWeight)
                .add(BigDecimal.valueOf(COEFFICIENT * value), MathContext.DECIMAL64);
    }

    // implements student
    public boolean addBox(String addresser, String recipient, double weight, double volume, int value) {
        if(weight>=0.5 & 20<=weight & volume>0 & volume<0.25 & value >0){
            throw new IllegalArgumentException();
        }
        listBox.add(new Box(addresser,recipient,weight,volume));
        return true;
    }

    // implements student
    public Collection<Box> deliveryBoxToRecipient(String recipient) {
        Collection<Box> boxes=new ArrayList<>();
        for (Box b:listBox){
            if(b.getRecipient().equals(recipient)){
                boxes.add(b);
                listBox.remove(b);
            }
        }
        return boxes;
    }

    public void declineCostOfBox(double percent) {
        Box[] boxes=(Box[]) listBox.toArray();
        for(int i=0;i<listBox.size();i++){
            boxes[i].setCost((boxes[i].getCost().multiply(BigDecimal.valueOf(percent),MathContext.DECIMAL64).divide(BigDecimal.valueOf(100),MathContext.DECIMAL64)));
        }
    }

}
