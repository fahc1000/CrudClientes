/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.model;


public abstract class Validator {

    public int ParseInt(String validate){
        int response = 0;
        if(validate.matches("^[0-9]*$") && !validate.equals("")){
            response = Integer.parseInt(validate);
        }
        return response;
    }
    public float ParseFloat(String validate){
        float response;
        try {
            response = Float.parseFloat(validate);
        } catch (NumberFormatException e) {
            response = 0;
        }
        return response;
    }
}
