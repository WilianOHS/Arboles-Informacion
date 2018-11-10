/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arboles;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Wilian Osmin Hernandez Sanchez HS17002
 */
public class Arboles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Objeto del tipo ArbolesInfo
        ArbolesInfo Arboles;
        Arboles = new ArbolesInfo();
        //Se crea arraylist para almacenar los datos
        ArrayList<String> Arbol = new ArrayList<>();
        //Se crea scanner para tomar los datos del teclado
        Scanner sr = new Scanner(System.in);
        //Variable para la opcion
        int op;
        //Variable para salir
        boolean salir=false;
        
        
        do{
            //Menu
        System.out.println("-------Menu-------");
        System.out.println("Ingrese una opcion");
        System.out.println("1-Agregar arbol");
        System.out.println("2-Mostrar");
        System.out.println("3-Salir");
        op = sr.nextInt();
        
        switch(op){
               case 1:
        //Se ingresan los datos del arbol
        System.out.println("Ingrese nombre comun");
        Arboles.NombreComun = sr.next();
        System.out.println("Ingrese familia");
        Arboles.familia = sr.next();
        System.out.println("Ingrese Tipo de suelo");
        Arboles.TipoSuelo = sr.next();
        System.out.println("Ingrese zona");
        Arboles.zona = sr.next();
        //Se agregan los datos a la lista
        Arbol.add(Arboles.NombreComun);
        Arbol.add(Arboles.familia);
        Arbol.add(Arboles.TipoSuelo);
        Arbol.add(Arboles.zona); 
               break;
               case 2: 
                int tamanio = Arbol.size();
                for(int i = 0; i<tamanio;i++){
                System.out.println("Nombre comun: "+Arbol.get(i));
                i+=1;
                System.out.println("Familia: "+Arbol.get(i));
                i+=1;
                System.out.println("Tipo de suelo: "+Arbol.get(i));
                i+=1;
                System.out.println("Zona: "+Arbol.get(i));
                  }   
               break;
               case 3:
               salir=true;
               break;
                   
            }
       }while(!salir);
        System.out.println("Hasta luego!...");
    }
    
}
