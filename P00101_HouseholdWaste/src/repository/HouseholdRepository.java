/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import dataAccess.HouseholdDao;
import model.Truck;

/**
 *
 * @author Admin
 */
public class HouseholdRepository implements IHouseholdRepository {
    @Override
    public void calculateTime(Truck truck){
        HouseholdDao.Instance().calculateTime(truck);
    }
    
    @Override
    public void calculateCost(Truck truck){
        HouseholdDao.Instance().calculateCost(truck);
    }
    
    @Override
    public void printEstimateCost(Truck truck){
        HouseholdDao.Instance().printEstimateCost(truck);
    }
}
