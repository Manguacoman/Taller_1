# Taller_1
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

/**
 *
 * @author Rodriguez-Alexander_Bañares-Matias
 */
public class Info {

    double AveragePrice;
    double Volume;
    double smallHass;
    double largeHass;
    double extraLargeHass;
    double TotalBags;

    public Info(double AveragePrice, double Volume, double smallHass, double largeHass, double extraLargeHass, double TotalBags) {
        this.AveragePrice = AveragePrice;
        this.Volume = Volume;
        this.smallHass = smallHass;
        this.largeHass = largeHass;
        this.extraLargeHass = extraLargeHass;
        this.TotalBags = TotalBags;
    }
    
    //numero,Date,AveragePrice,Total Volume,4046,4225,4770,Total Bags,Small Bags,Large Bags,XLarge Bags,type,year,region

    @Override
    public String toString() {
        return "Info{" + "AveragePrice=" + AveragePrice + ", Volume=" + Volume + ", smallHass=" + smallHass + ", largeHass=" + largeHass + ", extraLargeHass=" + extraLargeHass + ", TotalBags=" + TotalBags + '}';
    }

    public double getVolume() {
        return Volume;
    }

    public double getTotalBags() {
        return TotalBags;
    }
    
    
    
    
    
}
