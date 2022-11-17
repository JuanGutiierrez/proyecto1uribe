package org.example;

import org.example.clasesHalloween.Fiesta;
import org.example.clasesHalloween.Invitado;
import org.example.clasesHalloween.Lugar;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner entradaPorTeclado=new Scanner(System.in);
        Invitado objetoInvitado = new Invitado();
        Lugar objetoLugar = new Lugar();
        Fiesta objetoFiesta = new Fiesta();

        System.out.println("****** GRAN FIESTA GRUPO URIBE********");
        System.out.println("**************************************\n");

        System.out.print("Digita el aforo del lugar de la fiesta: ");
        objetoLugar.setAforo(entradaPorTeclado.nextInt());
        int aforoGlobal= objetoLugar.getAforo();
        Invitado[] invitados = new Invitado[objetoLugar.getAforo()];


        //CICLO PARA UBICAR INVITADOS DENTRO DEL AFORO

        int variableDeControl=0;
        System.out.println("menu de programa");
        System.out.println("**************************************\n");
        System.out.println("0. Salir");
        System.out.println("1. Registro de lugar");
        System.out.println("2. Registro de la fiesta");
        System.out.println("3. Registro de invitados");
        System.out.println("4. Ver invitados");



        do {
            System.out.print("Digita una opcion del menu: ");
            variableDeControl = entradaPorTeclado.nextInt();

            switch (variableDeControl) {

                case 1:
                    System.out.println("\nDatos del Lugar: ");
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
                    int contadorDeInvitado=aforoGlobal- objetoLugar.getAforo();
                    System.out.print("Digita el nombre del invitado: ");
                    invitados[contadorDeInvitado]=new Invitado();
                    invitados[contadorDeInvitado].setNombres(entradaPorTeclado.next());
                    objetoLugar.setAforo(objetoLugar.getAforo()-1);


                    break;
                case  4:
                    for (int i=0; i<invitados.length; i++) {
                        System.out.println(invitados[i].getNombres());
                    }
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