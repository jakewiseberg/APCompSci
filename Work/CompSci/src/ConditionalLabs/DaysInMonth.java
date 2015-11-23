/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConditionalLabs;

/**
 *
 * @author jakew
 */

public class DaysInMonth {
    public static void main(String[] args) {
        System.out.println(daysInMonth(2, 1800));
        System.out.println(daysInMonth("februrary", 1999));
    }
    
    public static int daysInMonth(int month, int year) {
        switch (month) {
            case 1: return 31;
            case 2:
                if ( (year%4 == 0 && year%100 != 0 ) || year%400 == 0) return 29;
                else return 28;
            case 3: return 31;
            case 4: return 30;
            case 5: return 31;
            case 6: return 30;
            case 7: return 31;
            case 8: return 31;
            case 9: return 30;
            case 10: return 31;
            case 11: return 30;
            case 12: return 31;
            default: return 0;
        }
    }
    
    public static int daysInMonth(String month, int year) {
        month = month.toLowerCase();
        switch (month) {
            case "january": return 31;
            case "februrary":
                if ( (year%4 == 0 && year%100 != 0 ) || year%400 == 0) return 29;
                else return 28;
            case "march": return 31;
            case "april": return 30;
            case "may": return 31;
            case "june": return 30;
            case "july": return 31;
            case "august": return 31;
            case "september": return 30;
            case "october": return 31;
            case "novemeber": return 30;
            case "december": return 31;
            default: return 0;
        }
    }
}
