/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.akeed.training.customexceptions;


public class WithdrawalFailedException extends Exception {
    
    public WithdrawalFailedException(String message, Exception ex){
        super(message, ex);
    }

}