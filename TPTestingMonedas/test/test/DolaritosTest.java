/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package test;

import java.util.Arrays;
import java.util.Collection;

import modelo.ConversorMoneda;
import org.junit.Before;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


/**
 *
 * @author Nehuen
 */

@RunWith(Parameterized.class)
public class DolaritosTest {

    private double saldo;
    private double compra;
    private double esperado;

    public DolaritosTest(
            double saldo,
            double compra,
            double esperado) {

        this.saldo = saldo;
        this.compra = compra;
        this.esperado = esperado;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> tomarDatos() {

        return Arrays.asList(
                new Object[][]{

                    {180000, 1500, 181500},

                    {120000, 0, 120000},

                    {100000, -900, 99100}
                });
    }

    @Before
    public void antesDeCadaPrueba() {

        System.out.println(
                "\nPreparando prueba parametrizada...");
    }

    @Test
    public void testSumaParametrizada() {

        System.out.println(
                "Ejecutando: testSumaParametrizada");

        System.out.println(
                "Saldo inicial: " + saldo);

        System.out.println(
                "Compra realizada: " + compra);

        System.out.println(
                "Resultado esperado: " + esperado);

        ConversorMoneda c =
                new ConversorMoneda();

        double resultado =
                c.aumentarSaldo(
                        saldo,
                        compra);

        System.out.println(
                "Resultado obtenido: " + resultado);

        Assert.assertEquals(
                esperado,
                resultado,
                0.001);
    }

    @After
    public void despuesDeCadaPrueba() {

        System.out.println(
                "Prueba finalizada.");
    }
}
