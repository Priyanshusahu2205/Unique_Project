package com.lmsInterview5;

class TaxCalculator {

    //Method to calculate tax
    public double calculateTax(String empName, boolean isIndian, double empSal)
            throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException {

        //check if employee is not Indian
        if (!isIndian) {
            throw new CountryNotValidException("The employee should be an Indian citizen for calculating tax.");
        }

        //check the employee name is empty
        if (empName == null || empName.isEmpty()) {
            throw new EmployeeNameInvalidException("The employee name cannot be empty.");
        }

        //Tax calculate logic
        if (empSal > 100000 && isIndian) {
            return empSal * 8 / 100;
        } else if (empSal >= 50000 && empSal <= 100000 && isIndian) {
            return empSal * 6 / 100;
        } else if (empSal >= 30000 && empSal < 50000 && isIndian) {
            return empSal * 5 / 100;
        } else if (empSal >= 10000 && empSal < 30000 && isIndian) {
            return empSal * 4 / 100;
        } else {
            throw new TaxNotEligibleException("The employee does not need to pay tax.");
        }
    }
}
public class CalculatorSimulator {
	
	public static void main(String[] args) {
        TaxCalculator taxCalculator = new TaxCalculator();

        //test case 1
        try {
            System.out.println("Test Case 1");
            double tax = taxCalculator.calculateTax("Ron", false, 34000);
            System.out.println("Tax amount is: " + tax);
        } catch (CountryNotValidException | EmployeeNameInvalidException | TaxNotEligibleException e) {
            //e.printStackTrace();
            System.out.println(e.getMessage());
            
        }

        //test case 2
        try {
            System.out.println("Test Case 2");
            double tax = taxCalculator.calculateTax("Tim", true, 1000);
            System.out.println("Tax amount is: " + tax);
        } catch (CountryNotValidException | EmployeeNameInvalidException | TaxNotEligibleException e) {
            //e.printStackTrace();
            System.out.println(e.getMessage());
            
        }

        //test case 3
        try {
            System.out.println("Test Case 3");
            double tax = taxCalculator.calculateTax("Jack", true, 55000);
            System.out.println("Tax amount is: " + tax);
        } catch (CountryNotValidException | EmployeeNameInvalidException | TaxNotEligibleException e) {
            //e.printStackTrace();
            System.out.println(e.getMessage());
            
        }

        //test case 4
        try {
            System.out.println("Test Case 4");
            double tax = taxCalculator.calculateTax("", true, 30000);
            System.out.println("Tax amount is: " + tax);
        } catch (CountryNotValidException | EmployeeNameInvalidException | TaxNotEligibleException e) {
            //e.printStackTrace();
            System.out.println(e.getMessage());
            
        }
    }
}
