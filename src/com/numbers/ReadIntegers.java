package com.numbers;

import javax.swing.*;

public class ReadIntegers {
    public static void main(String[] args) {
        int firstNumber;
        int secondNumber;

        String input;
        input = JOptionPane.showInputDialog("Please Enter the First Number");
        firstNumber = Integer.parseInt(input);
        input = JOptionPane.showInputDialog("Please Input the Second Number");
        secondNumber = Integer.parseInt(input);

        int average = (firstNumber+secondNumber)/2;
        JOptionPane.showMessageDialog(null,"Average is : "+ average);


    }

}
