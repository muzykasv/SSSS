package com.company;

public class SwitchStatement {
    public static void main(String[] args) {
        int month = 11, year = 2000, numDays = 0;
        boolean hYear = true;
        switch (month){
            case 1: case 3: case 5:
            case 7: case 8: case 10:
            case 12:
                numDays = 31; break;
            case 4: case 6:
            case 9: case 11:
                numDays = 30; break;
                case 2:
                if (hYear) {numDays = 29;}
                else {numDays = 28;}
                break;
                default:
                    System.out.println("Invalid month");
                    break;
        }
        System.out.println("Number of Days = " + numDays);
    }
}
