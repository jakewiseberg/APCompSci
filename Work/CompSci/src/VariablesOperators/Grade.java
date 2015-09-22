/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VariablesOperators;

/**
 *
 * @author jacob.wiseberg
 */
public class Grade {
    public static void main(String[] args) {
        double possPoints = 400;
        double currGrade = 87;
        double nextTestPoints = 50;
        double gradeWanted = 90;
        double currPoints = currGrade/100*possPoints;
        double pointsWanted = gradeWanted/100*(possPoints+nextTestPoints);
    }
}
