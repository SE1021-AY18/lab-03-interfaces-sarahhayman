/*
 * SE1021
 * Winter 2017-2018
 * Lab 3 - Interfaces
 * Name: Sarah Hayman
 * Created: 12/14/17
 */

import java.text.DecimalFormat;

public class Duplicate implements Part {

    private DecimalFormat costFormat = new DecimalFormat("#0.00");   //getter but no setter?

    private Part identicalPart;

    private int numDuplicates;

    public static final double REDUCTION_FACTOR1 = 0.95;

    public static final double REDUCTION_FACTOR2 = 0.9;

    public static final int USD_THRESHOLD1 = 5;

    public static final int USD_THRESHOLD2 = 10;

    private DecimalFormat weightFormat = new DecimalFormat(("#0.0"));


    public Duplicate(Part identicalPart, int numDuplicates){   //Constructor

    this.identicalPart = identicalPart;
    this.numDuplicates = numDuplicates;

    }

    public double getCost(){

        double cost = (identicalPart.getCost() * numDuplicates);

        if(numDuplicates >= 10){
            cost *= .9;
        }
        else if(numDuplicates >= 5){
            cost *= .95;
        }

        return cost;

    }

    public String getName(){

        String duplicatesName = (numDuplicates + " " + identicalPart.getName() + "s");

        return duplicatesName;

    }

    public double getWeight(){

        return (identicalPart.getWeight() * numDuplicates);

    }

    public void printBillOfMaterials(){

        System.out.println("==========================");
        System.out.println(getName());
        System.out.println("==========================");
        System.out.println("Duplicate part: " + identicalPart.getName());
        System.out.println("Copies: " + numDuplicates);
        System.out.println("Individual cost: $" + costFormat.format(identicalPart.getCost()));
        System.out.println("Individual weight: " + weightFormat.format(identicalPart.getWeight()) + " lbs\n");
        System.out.println("Total cost: $" + costFormat.format(getCost()));
        System.out.println("Total weight: " + weightFormat.format(getWeight()) + " lbs\n");

        identicalPart.printBillOfMaterials();


    }



}
