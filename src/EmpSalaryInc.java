/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

// import libraries

/**
 *
 * @author CPAL-Admin_mobile
 */
import java.util.*;
import java.io.*;

import javax.swing.JOptionPane;

public class EmpSalaryInc {
    public static void main(String []args) throws FileNotFoundException{
        String filepath = "C:\\Users\\umanz\\IdeaProjects\\FA26-COSC112_ProgramAssignment1\\src\\EmpData.txt";
        Scanner fin = new Scanner(new FileReader(filepath));

        String lastName, firstName;
        double salary, newSalary;
        double payIncrease; // percentage pay increase
        double increaseAmount;

        lastName = fin.next();
        firstName = fin.next();
        salary = fin.nextDouble();
        payIncrease = fin.nextDouble() / 100;

        increaseAmount = salary * payIncrease;
        newSalary = salary + increaseAmount;

        // mirror output
        /*
        Employee name: Miller, Andrew
        Current Salary: $65789.87
        % pay rise: 5%
         */

        System.out.printf("Employee name: %s, %s%n", lastName , firstName);
        System.out.printf("Current Salary: $%.2f \n", salary);
        System.out.printf("%% pay rise: %.0f%%%n", payIncrease * 100);
        System.out.printf("=== New salary amount: $%.2f\n", newSalary);

        JOptionPane.showMessageDialog( null,
                "Employee name: " + lastName + ", " + firstName + "\n"
                        + "Current Salary: $" + String.format("%.2f", salary) + "\n"
                        + "% pay rise: " + String.format("%.0f%%", payIncrease * 100) + "\n"
                        + "=== New salary amount: $" + String.format("%.2f", newSalary) );

        lastName = fin.next();
        firstName = fin.next();
        salary = fin.nextDouble();
        payIncrease = fin.nextDouble() / 100;

        increaseAmount = salary * payIncrease;
        newSalary = salary + increaseAmount;

        System.out.printf("Employee name: %s, %s%n", lastName , firstName);
        System.out.printf("Current Salary: $%.2f \n", salary);
        System.out.printf("%% pay rise: %.0f%%%n", payIncrease * 100);
        System.out.printf("=== New salary amount: $%.2f\n", newSalary);

        JOptionPane.showMessageDialog( null,
                "Employee name: " + lastName + ", " + firstName + "\n"
                        + "Current Salary: $" + String.format("%.2f", salary) + "\n"
                        + "% pay rise: " + String.format("%.0f%%", payIncrease * 100) + "\n"
                        + "=== New salary amount: $" + String.format("%.2f", newSalary) );

        lastName = fin.next();
        firstName = fin.next();
        salary = fin.nextDouble();
        payIncrease = fin.nextDouble() / 100;

        increaseAmount = salary * payIncrease;
        newSalary = salary + increaseAmount;

        System.out.printf("Employee name: %s, %s%n", lastName , firstName);
        System.out.printf("Current Salary: $%.2f \n", salary);
        System.out.printf("%% pay rise: %.0f%%%n", payIncrease * 100);
        System.out.printf("=== New salary amount: $%.2f\n", newSalary);

        JOptionPane.showMessageDialog( null,
                "Employee name: " + lastName + ", " + firstName + "\n"
                        + "Current Salary: $" + String.format("%.2f", salary) + "\n"
                        + "% pay rise: " + String.format("%.0f%%", payIncrease * 100) + "\n"
                        + "=== New salary amount: $" + String.format("%.2f", newSalary) );

    }
}
