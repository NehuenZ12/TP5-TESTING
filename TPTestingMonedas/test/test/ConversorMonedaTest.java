/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package test;

import modelo.ConversorMoneda;
import org.junit.*;

public class ConversorMonedaTest {

    private static ConversorMoneda conversor;

    @BeforeClass
    public static void iniciar() {

        conversor = new ConversorMoneda();

        System.out.println(" INICIO DE PRUEBAS DEL CONVERSOR ");
    }

    @Before
    public void antesDeCadaPrueba() {

        System.out.println("\nPreparando ejecución del test...");
    }

    @Test
    public void testAumentarSaldo() {

        System.out.println(
                "Ejecutando: testAumentarSaldo");

        double esperado = 800;

        double obtenido =
                conversor.aumentarSaldo(
                        500,
                        300);

        Assert.assertEquals(
                esperado,
                obtenido,
                0.001);

        System.out.println(
                "Resultado esperado: " + esperado);

        System.out.println(
                "Resultado obtenido: " + obtenido);
    }

    @Test
    public void testRetirarDolares() {

        System.out.println(
                "Ejecutando: testRetirarDolares");

        double esperado = 1900;

        double obtenido =
                conversor.retirarDolares(
                        2100,
                        200);

        Assert.assertEquals(
                esperado,
                obtenido,
                0.001);

        System.out.println(
                "Resultado esperado: " + esperado);

        System.out.println(
                "Resultado obtenido: " + obtenido);
    }

    @After
    public void despuesDeCadaPrueba() {

        System.out.println(
                "Prueba finalizada, campos en 0");
    }

    @AfterClass
    public static void finalizar() {

        System.out.println(" LA OPERACIÓN HA FINALIZADO ");
    }
}