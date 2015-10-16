/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.doblander.tut.concurrency.atomic;

import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author intruder
 */
public class Atomic {

    private AtomicInteger myAtomicInt;

    public Atomic() {
      
        myAtomicInt = new AtomicInteger();
        
    }

    public void incAtomic() {
      myAtomicInt.getAndIncrement();
    }
}
