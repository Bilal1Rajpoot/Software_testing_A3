/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import static org.junit.Assert.*;
import software_testing_assignment_2.myClass;

/**
 *
 * @author BiLaL SaBeeL
 */
public class whiteBoxTesting {
    
    public whiteBoxTesting() {
    }
    
    @Test
    public void test_F1(){
        myClass obj=new myClass();
        // return -1 for invalid range
        
        //T1    
        assertEquals(-1, obj.calculateAggeagate(35, 45, 34));
        //T2    
        assertEquals(-1, obj.calculateAggeagate(45, 32,	67));
        //T3    
        assertEquals(-1, obj.calculateAggeagate(40, 65, 34));
        //T4    
        assertEquals(-1, obj.calculateAggeagate(45, 80, 78));
        //T5    
        assertEquals(-1, obj.calculateAggeagate(60, 44, 43));
        //T6    
        assertEquals(-1, obj.calculateAggeagate(60, 44, 70));
        //T7    
        assertEquals(-1, obj.calculateAggeagate(60, 70, 43));
        //T8    
        assertEquals(69, obj.calculateAggeagate(62,75,70));
        
    }
    @Test
    public void test_F2(){
        myClass obj=new myClass();
        // return -1 for invalid range
        //T1
        assertEquals(-1, obj.calculateFinalResult(25, 45, 90));
        //T2
        assertEquals(-1, obj.calculateFinalResult(30, 41, 36));
        //T3
        assertEquals(-1, obj.calculateFinalResult(40, 35, 89));
        //T4
        assertEquals(-1, obj.calculateFinalResult(45, 30, 30));
        //T5
        assertEquals(-1, obj.calculateFinalResult(20, 44, 43));
        //T6
        assertEquals(-1, obj.calculateFinalResult(15, 44, 30));
        //T7
        assertEquals(-1, obj.calculateFinalResult(11, 40, 60));
        //T8
        assertEquals(85, obj.calculateFinalResult(5, 40, 40));
        
    }
    @Test
    public void test_F3(){
        myClass obj=new myClass();
        // return -1 for invalid range
        //T1
        assertEquals(-1, obj.fineCalculate(10));
        //T2
        assertEquals(400, obj.fineCalculate(6));
        
        
    }
}
