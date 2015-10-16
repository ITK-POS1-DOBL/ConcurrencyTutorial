/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.doblander.tut.concurrency.main;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.doblander.tut.concurrency.threads.MyCallable;
import org.doblander.tut.concurrency.threads.MyRunnable;

/**
 *
 * @author intruder
 */
public class MyConcurrentTutExMain {

    private static final int N_MAX_THREADS = 500;

    /**
     * Constant to switch between examples in main... 
     * 1: Executor Framework Runnable
     * 2: Executor Framework Callable
     * 3: Fork-Join
     */
    private static final int SWITCH_EXAMPLE = 2;

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     * @throws java.util.concurrent.ExecutionException
     */
    public static void main(String[] args) throws InterruptedException, ExecutionException {

        Runnable myWork = new MyRunnable(10000000);

        Callable myCallable = new MyCallable();

        ExecutorService executor = Executors.newFixedThreadPool(N_MAX_THREADS);

        switch (SWITCH_EXAMPLE) {
            case 1:
                executor.execute(myWork);
                System.out.println("Computation finished!");
                break;
            case 2: // Executor with Callable
                Future myFuture = executor.submit(myCallable);
                System.out.println("Computation finished! Summe: " + myFuture.get());
                break;
            case 3:
                
                break;
            default:
                break;
        }
    }

}
