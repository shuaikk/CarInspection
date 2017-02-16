/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.carInspection.dbHandler;

/**
 *
 * @Shuai Wang tmpuser-10209
 */
public class InspectionCostDTO {
    private int cost;
    private RegNoDTO regNo; 
    
    public InspectionCostDTO(int cost,RegNoDTO regNo)
    {
        this.cost = cost;
        this.regNo = regNo;
    }

    public InspectionCostDTO() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public int getcost()
    {
        return this.cost;
    }
    
    public RegNoDTO getregNo()
    {
        return this.regNo;
    }
    
    //Judge if it is the input vehicle’s license number.
    boolean matches(RegNoDTO regNo)
    {   
        if (this.regNo == regNo)
            {return true;}
        else 
            {return false;}
    }       
}
