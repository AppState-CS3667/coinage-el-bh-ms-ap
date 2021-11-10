package Smelting;
/*  SmeltingBehavior interface
 *  
 *  Stradegy Pattern
 *
 *  Each coin will have a smelting behavior. Some coins will have the
 *  same smelting behaviors. 
 *
 *  Author: Ethan Little
 *  Date: 11/8/2021
 */

public interface SmeltingBehavior 
{
    /**
     * Smelting Specs.
     * @return Smelting specification. Ex: "91.67% Cu, 8.33% Ni".
     */ 
    public String getSmeltingSpecs();
}

