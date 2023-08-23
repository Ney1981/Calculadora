package com.example.calculadora;

public class Operacion {
    public String suma(String numero_uno, String numero_dos) {
        int resultado = Integer.valueOf(numero_uno) + Integer.valueOf(numero_dos);
        return String.valueOf(resultado);
    }
    public String resta(String numero_uno, String numero_dos){
        int resultado = Integer.valueOf(numero_uno) - Integer.valueOf(numero_dos);
        return String.valueOf(resultado);
    }
    public String division(String numero_uno, String numero_dos){
        int resultado = Integer.valueOf(numero_uno) / Integer.valueOf(numero_dos);
        return String.valueOf(resultado);
    }
    public String multiplicacion(String numero_uno, String numero_dos){
        int resultado = Integer.valueOf(numero_uno) * Integer.valueOf(numero_dos);
        return String.valueOf(resultado);
    }

}
