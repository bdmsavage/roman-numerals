package com.paltaie.romannumerals;

public class RomanNumeralServiceImpl implements RomanNumeralService {


    public int romanToDecimal(String roman) {

        int decimal = 0;

        for (char myChar : roman.toCharArray()) {
            switch (myChar) {
                case 'M':
                    decimal += 1000;
                    break;
                case 'D':
                    decimal += 500;
                    break;
                case 'C':
                    decimal += 100;
                    break;
                case 'L':
                    decimal += 50;
                    break;
                case 'X':
                    decimal += 10;
                    break;
                case 'V':
                    decimal += 5;
                    break;
                case 'I':
                    decimal += 1;
            }
        }

        if (roman.contains("IV")) {
            decimal -= 2;
        }
        if (roman.contains("IX")) {
            decimal -= 2;
        }
        if (roman.contains("XL")) {
            decimal -= 20;
        }
        if (roman.contains("XC")) {
            decimal -= 20;
        }
        if (roman.contains("CD")) {
            decimal -= 200;
        }
        if (roman.contains("CM")) {
            decimal -= 200;
        }

        return decimal;
    }

    @Override
    public String decimalToRoman(int decimal) {
        String roman = "";
        while (decimal >= 1000) {
            roman = roman + "M";
            decimal -= 1000;        }
        while (decimal >= 900) {
            roman = roman + "CM";
            decimal -= 900;
        }
        while (decimal >= 500) {
            roman = roman + "D";
            decimal -= 500;
        }
        while (decimal >= 400) {
            roman = roman + "CD";
            decimal -= 400;
        }
        while (decimal >= 100) {
            roman = roman + "C";
            decimal -= 100;
        }
        while (decimal >= 90) {
            roman = roman + "XC";
            decimal -= 90;
        }
        while (decimal >= 50) {
            roman = roman + "L";
            decimal -= 50;
        }
        while (decimal >= 40) {
            roman = roman + "XL";
            decimal -= 40;
        }
        while (decimal >= 10) {
            roman = roman + "X";
            decimal -= 10;
        }
        while (decimal >= 9) {
            roman = roman + "IX";
            decimal -= 9;
        }
        while (decimal >= 5) {
            roman = roman + "V";
            decimal -= 5;
        }
        while (decimal >= 4) {
            roman = roman + "IV";
            decimal -= 4;
        }
        while (decimal >= 1) {
            roman = roman + "I";
            decimal -= 1;
        }
        return roman;
    }

}