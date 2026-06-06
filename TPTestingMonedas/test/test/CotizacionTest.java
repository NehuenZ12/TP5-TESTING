/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package test;

import modelo.ConversorMoneda;
import org.junit.Test;

/**
 *
 * @author Nehuen
 */

public class CotizacionTest {

    @Test(expected = ArithmeticException.class)
    public void testCotizarCero() {

        ConversorMoneda c =
                new ConversorMoneda();

        c.calcularCotizacion(
                180000,
                0);
    }
}

