/*
 * SE1021
 * Winter 2017-2018
 * Lab 3 - Interfaces
 * Name: Sarah Hayman
 * Created: 12/14/17
 */

import java.text.DecimalFormat;

public class Duplicate implements Part {

    private DecimalFormat costFormat = new DecimalFormat("$##.00");   //getter but no setter?

    private Part identicalPart;

    private int numDuplicates;

    public static double REDUCTION_FACTOR1 = 0.95;

    public static double REDUCTION_FACTOR2 = 0.9;

    public static int USD_THRESHOLD1 = 5;

    public  static int USD_THRESHOLD2 = 10;

    private DecimalFormat weightFormat = new DecimalFormat(("##.###"));


    public Duplicate(Part identicalPart, int numDuplicates){   //Constructor

    }

    public double getCost(){

    }

    public String getName(){

    }

    public double getWeight(){

    }

    public void printBillOfMaterials(){

    }



}
