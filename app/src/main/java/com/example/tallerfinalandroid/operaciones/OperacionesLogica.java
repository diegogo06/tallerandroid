package com.example.tallerfinalandroid.operaciones;

import java.util.Random;

public class OperacionesLogica {

    int numero1;
    int numero2;
   int resultado;
    int opcion;
  String operador;

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    public int getOpcion() {
        return opcion;
    }

    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public int generarnumero(int max) {

        Random random = new Random();
        random.setSeed(System.currentTimeMillis());
        int numerorandom=random.nextInt(max);

        return numerorandom;

    }
    public int generarnumero1(int max) {

        Random random = new Random();
        random.setSeed(System.currentTimeMillis());
        int numerorandom=random.nextInt(max);

        return numerorandom;

    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }


    private void operacion() {


switch (getOpcion()) {
   //1 para la suma
    case 1:
        operador="+";
        resultado = getNumero1()+getNumero2();

       //2 para resta



        break;
    case 2:
        operador="-";
        resultado=getNumero1()-getNumero2();
        break;
        //3 multiplicar
    case 3:

        operador="x";
        resultado = getNumero1()*getNumero2();
        break;

        //4 para dividir
    case 4:
    operador ="/";
    resultado=getNumero1()/getNumero2();

}

    }
}
