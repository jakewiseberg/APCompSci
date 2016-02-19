/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author jacob.wiseberg
 */
public interface Car extends Motorvehicle {
    boolean fourWheelDrive();
    String getBrand();
    int seats();
}
