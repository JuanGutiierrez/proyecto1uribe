package org.example;

import org.example.clasesHalloween.Fiesta;
import org.example.clasesHalloween.Invitado;
import org.example.clasesHalloween.Lugar;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner entradaPorTeclado=new Scanner(System.in);
        Lugar objetoLugar = new Lugar();
        Fiesta objetoFiesta = new Fiesta();

        //Creando nuestro primer arraylist
        ArrayList<Invitado> invitados=new ArrayList<Invitado>();

        System.out.println("****** GRAN FIESTA GRUPO URIBE********");
        System.out.println("**************************************");


        //CICLO PARA UBICAR INVITADOS DENTRO DEL AFORO

        int variableDeControl=0;
        System.out.println("menu de programa");
        System.out.println("**************************************\n");
        System.out.println("0. Salir");
        System.out.println("1. Registro de lugar");
        System.out.println("2. Registro de la fiesta");
        System.out.println("3. Registro de invitados");
        System.out.println("4. Ver invitados");
        System.out.println("5. Ver costos");
        System.out.println("6. Ver ganancias");

        do {
            System.out.print("\nDigita una opcion del menu: ");
            variableDeControl = entradaPorTeclado.nextInt();
            switch (variableDeControl) {
                case 1:
                    System.out.println("\n**************************************");
                    System.out.println("Datos del Lugar: ");
                    System.out.println("**************************************\n");
                    System.out.print("Digita el aforo: ");
                    objetoLugar.setAforo(entradaPorTeclado.nextInt());
                    System.out.print("Digita la direccion: ");
                    objetoLugar.setDireccion(entradaPorTeclado.next());
                    break;
                case 2:
                    System.out.print("Fecha: ");
                    objetoFiesta.setFecha(entradaPorTeclado.next());
                    System.out.print("Costos de alimentos: ");
                    objetoFiesta.setCostosAlimentos(entradaPorTeclado.nextDouble());
                    System.out.print("Costos de bebidas: ");
                    objetoFiesta.setCostosBebidas(entradaPorTeclado.nextDouble());
                    System.out.print("Costos de lugar: ");
                    objetoFiesta.setCostosLugar(entradaPorTeclado.nextDouble());
                    System.out.print("Costos de equipos: ");
                    objetoFiesta.setCostosEquipos(entradaPorTeclado.nextDouble());
                    break;
                case 3:

                    if(objetoLugar.getAforo()>=1){

                        //Restamos en 1 el aforo total cada que entra alguien a la fiesta
                        objetoLugar.setAforo(objetoLugar.getAforo()-1);

                        //Si voy a guardar objetos de una clase CUALQUIERA
                        //en una arraylist primero debo crear un objeto
                        //de esa clase cualquiera
                        Invitado objetoInvitado = new Invitado();

                        //LLENAR/PEDIR ALMACENAR/SETEAR/LLEVAR LOS ATRIBUTOS
                        //DEL OBJETO QUE ACABO DE CREAR
                        System.out.print("\nDigita el nombre del invitado: ");
                        objetoInvitado.setNombres(entradaPorTeclado.next());
                        System.out.print("Digita la edad del invitado: ");
                        objetoInvitado.setEdad(entradaPorTeclado.nextInt());
                        System.out.print( "Digita el id del invitado:");
                        objetoInvitado.setId(entradaPorTeclado.next());
                        System.out.print("El invitado aplica cover?: ");
                        objetoInvitado.setAplicaCover(entradaPorTeclado.nextBoolean());

                        //Si ya tiene mi objeto entonces agregamos
                        //el objeto a la lista
                        invitados.add(objetoInvitado);

                    }else {

                        System.out.println("Aragan, no te entra mas gente ahi\n");

                    }

                    break;
                case  4:
                    //COMO RECORRO UN ARRAYLIST?
                    //con un ciclo for ADAPTADO recorremos facilmete un ARRAYLIST
                    for (Invitado invitado:invitados){

                        System.out.println("Nombre: "+invitado.getNombres()+"\n"+"Edad: "+invitado.getEdad()+"\n"+"Id: "+invitado.getId()+"\n"+
                                "Aplica cover?: "+invitado.isAplicaCover()+"\n");
                    }

                    break;
                case  5:
                    System.out.println("El costo de la fiesta fue: "+objetoFiesta.calcularCostosTotales(0.19));

                break;
                case  6:
                    //llamar al metodo que calcula ganancias
                    double ganancias=objetoFiesta.calcularGanancias(invitados.size());
                    System.out.println("Las ganancias fueron: "+ganancias);


                    break;


                default:
                    System.out.println("Selecciona una opcion valida");
            }
        }while (variableDeControl != 0);


       /* System.out.println("CREANDO ARREGLOS");
        // ARREGLOS PRIMITIVOS
        int[] numeros=new int[10];
        int cargar;
        //SI QUIERO ACCEDER A UN PEDACITO DE MEMORIA
        //DENTRO DEL ARREGLO DEBO USAR LA POSICION O INDICE
        //mostrando lo que almaceno en el arreglo
        //CON UN CICLO FOR YO PUEDO RECORRER UN ARREGLO
        for(int i=0; i<numeros.length; i++){
            System.out.println("ingrese un numero: ");
            numeros[i]=entradaPorTeclado.nextInt();
        }

        for(int i=0; i<numeros.length; i++){
            System.out.println(numeros[i]);
        }*/











    }
}