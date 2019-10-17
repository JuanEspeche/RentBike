/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentbike;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author juanl
 */
public class FamilyRental implements TotalCost {

    private List<Rental> rentals = new ArrayList();

    public List<Rental> getRentals() {
        return rentals;
    }

    public void addRentals(Rental rental) {
        this.rentals.add(rental);
    }

    @Override
    public double getTotalCost() {
        double total = 0.0;
        for (Rental r : rentals) {
            total += r.getTotalCost();
        }
        if (rentals.size() >= 3 && rentals.size() <= 5) {
            total *= 0.7;
            return total;
        } else {
            System.out.println("The rent you want to make does not meet the conditions required for family promotion");
            return total;
        }
    }
}
