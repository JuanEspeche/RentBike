/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentbike;

/**
 *
 * @author juanl
 */
public abstract class Rental implements TotalCost {

    protected double unitCost;
    protected double totalTime;

    public Rental() {

    }

    public Rental(double unitCost, double totalTime) {
        this.unitCost = unitCost;
        this.totalTime = totalTime;
    }

    public void setUnitCost(double unitCost) {
        this.unitCost = unitCost;
    }

    public double getUnitCost() {
        return unitCost;
    }

    public double getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(double totalTime) {
        this.totalTime = totalTime;
    }

    @Override
    public double getTotalCost() {
        return unitCost * totalTime;
    }

}
