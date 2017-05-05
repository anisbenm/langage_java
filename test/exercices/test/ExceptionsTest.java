/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Administrateur
 */
public class ExceptionsTest {

    public float div(int a, int b) {

        return a / b;
    }

    @Test
    public void test1() {
        int a = 0, b = 0;
        div(a,b);
    }
    
        @Test
    public void test2() throws FileNotFoundException {
       new FileInputStream(new File("bb.txt"));//ne compile pas sans l'exception
    }

}
