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
public class DailyRental extends Rental {

    public DailyRental(double unitCost, double totalTime) {
        super(unitCost, totalTime);
        this.unitCost = 20.0;
    }

}
