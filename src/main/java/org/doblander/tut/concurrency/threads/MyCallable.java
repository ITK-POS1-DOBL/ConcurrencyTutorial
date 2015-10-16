/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.doblander.tut.concurrency.threads;

import java.util.concurrent.Callable;

/**
 *
 * @author intruder
 */
public class MyCallable implements Callable<Long> {

    public MyCallable() {
    }

    @Override
    public Long call() throws Exception {
        int i;
        long mySum  = 0;
        
        for (i = 1; i<100000000; i++){
            mySum = mySum + i;
        }
        
        return mySum;
    }
    
}
