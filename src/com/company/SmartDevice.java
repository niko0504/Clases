package com.company;
public class SmartDevice {

  
    public static void main(String[] args){
        SmartPhone smartphone = new SmartPhone ("Honor", "50", "Honor Code",128, "Android");
        SmartWatch smartWatch = new SmartWatch("Huawei", "GT 2e", "Negro",1.39 , "Bluetooth");

        System.out.println("El smartphone es: " + smartphone + "\nEl smartwatch es: " + smartWatch);
    }

  
  
    String marca, modelo, color;

    public SmartDevice() { // Constructor

    }

    public SmartDevice(String marca, String modelo, String color) {  //Definimos una clase
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    public static class SmartPhone extends SmartDevice {   //Subclase
        int memoria;
        String sistema;

        public SmartPhone(){
            super();            //Llamamos a la clase padre
        }

        public SmartPhone(String  marca, String modelo, String color, int memoria, String sistema) {
            super(marca, modelo, color);
            this.memoria = memoria;
            this.sistema = sistema;
        }

        @Override
        public String toString() {
            return "marca = " + marca +
                    ", modelo = " + modelo +
                    ", color = " + color +
                    ", memoria = " + memoria+
                    ", sistema = " + sistema;
        }
    }

    public static class SmartWatch extends SmartDevice {  //Subclase
        double pulgadas;
        String conectividad;

        public SmartWatch(){
            super();             //Llamamos a la clase padre
        }

        public SmartWatch(String marca, String modelo, String color, double pulgadas, String conectividad){
            super(marca, modelo, color);
            this.pulgadas = pulgadas;
            this.conectividad = conectividad;
        }
        @Override
        public String toString(){
            return "marca = " + marca +
            ", modelo = " + modelo +
            ", color = " + color +
            ", pulgadas = " + pulgadas +
            ", conectividad = " + conectividad;
        }
    }
}
