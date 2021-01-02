/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runner;


import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import runner.Find;
/**
 *
 * @author HP
 */
public class priceTest {
    Find f;
    
    @Before
    public void setUp() throws Exception {
        f = new Find();
    }
    
    @Test
    public void testGetTax() {
        
        assertEquals(60, f.getTax(600), 0);

    }

}
