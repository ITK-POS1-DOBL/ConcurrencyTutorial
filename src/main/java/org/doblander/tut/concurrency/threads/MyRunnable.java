/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.doblander.tut.concurrency.threads;

/**
 *
 * @author intruder
 */
public class MyRunnable implements Runnable {
    private long sum = 0;
    private int maxVal;
    
    public MyRunnable(int maxVal) {
    }

    @Override
    public void run() {
        int i;
        for (i = 1; i < maxVal; i++){
            sum = sum + i;
        }
        
    }
    
}
