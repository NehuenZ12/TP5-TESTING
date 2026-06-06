/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Nehuen
 */

public class ConversorMoneda {

    public ConversorMoneda() {

    }

    // convertir pesos a dólares
    public double convertir(double pesos, double cotizacion) {

        return pesos / cotizacion;
    }

    // calcular cotización
    public double calcularCotizacion(double pesos,
                                     double dolares) {

        if (dolares == 0) {
            throw new ArithmeticException(
                    "No se puede dividir por cero");
        }

        return pesos / dolares;
    }

    // aumentar saldo
    public double aumentarSaldo(double saldo,
                                double compra) {

        return saldo + compra;
    }

    // retirar dólares
    public double retirarDolares(double saldo,
                                 double retiro) {

        return saldo - retiro;
    }
}
