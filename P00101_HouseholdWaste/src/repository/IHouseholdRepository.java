/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repository;

import model.Truck;

/**
 *
 * @author Admin
 */
public interface IHouseholdRepository {

    void calculateCost(Truck truck);

    void calculateTime(Truck truck);

    void printEstimateCost(Truck truck);
    
}
