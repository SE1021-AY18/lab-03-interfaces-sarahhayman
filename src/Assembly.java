/*
 * SE1021
 * Winter 2017-2018
 * Lab 3 - Interfaces
 * Name: Sarah Hayman
 * Created: 12/14/17
 */

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Assembly implements Part {


    private DecimalFormat costFormat = new DecimalFormat("#0.00");

    private String name;
    private ArrayList<Part> subParts = new ArrayList<>();
    public static final double USD_PER_SUB_PART = 0.25;

    private DecimalFormat weightFormat = new DecimalFormat("#0.###");

    public void addPart(Part part){

    subParts.add(part);

    }

    public Assembly(String name){

    this.name = name;

    }

    public double getCost(){

        double totalCost = 0.0;

        for (int i = 0; i < subParts.size(); i++){

            totalCost += subParts.get(i).getCost();

        }

        totalCost += subParts.size() * USD_PER_SUB_PART;
        return totalCost;

    }

    public String getName(){
        return name;
    }

    public double getWeight(){

        double sumOfParts = 0;
        for(int i = 0; i < subParts.size(); i++){

            sumOfParts += subParts.get(i).getWeight();

        }

        return sumOfParts;

    }

    public void printBillOfMaterials(){
    //Total cost: $7.12
    //Total weight: 1.5 lbs

        System.out.println("==========================");
        System.out.println(getName());
        System.out.println("==========================");

        for(int i = 0; i < subParts.size(); i++){

            System.out.println("Part: " + subParts.get(i).getName());
            System.out.println("Cost: $" + costFormat.format(subParts.get(i).getCost()));
            System.out.println("Weight: " + weightFormat.format(subParts.get(i).getWeight()) + " lbs\n");
        }
        System.out.println("Total cost: $" + costFormat.format(getCost()));
        System.out.println("Total weight: " + weightFormat.format(getWeight()) + " lbs\n");

        for(int i = 0; i < subParts.size(); i++){

            subParts.get(i).printBillOfMaterials();

        }
    }
}
