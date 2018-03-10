


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Emmanuel Gonzalez
 */
import java.util.ArrayList;
import java.util.Scanner;
public class MenuPrincipal {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        
         int var1= 0;
        int var2 = 0;
        boolean flag=true;
        boolean flag2=false;
        
        Auto camioneta = new Auto("Rojo",false,"Ford Lobo","txt-45-21",5);
        Auto  coche = new Auto("Azul",false,"Versa","sxl3334",8);
        Auto camioneta2 = new Auto("Amarillo",false,"Q5","jhs32-45",4);
        Auto coche2 = new Auto("Verde",false,"Focus","15-67-ffgg",4);
        Auto camion = new Auto("Negro",false,"Peterbit","plw-45-22",5);
        
        ArrayList<Auto>Almacen=new ArrayList();
        
        Almacen.add(camioneta);
        Almacen.add(coche);
        Almacen.add(camioneta2);
        Almacen.add(coche2);
        Almacen.add(camion);
        

        
        do{
         try{
             System.out.println("***** MENU PRINCIPAL *****");
        System.out.println("1.- Mostrar vehiculos disponibles");
        System.out.println("2.- Modificar vehiculo");
        System.out.println("3.- Salir");
        System.out.println("->");
        int des=Entrada.nextInt();
        
        
        switch(des){
            case 1:
                System.out.println("\n");
                System.out.println("Vehiculos en Almacen");
                int i=1;
                for(Auto temp:Almacen)
                    {
                        System.out.println(i+".- "+temp.getMarca());
                        i=i+1;
                    }
                System.out.println("\n");
                System.out.println("INGRESE EL NUMERO DE VEHICULO PARA VER DETALLES");
                int vehi=Entrada.nextInt();
                switch(vehi)
                {
                    case 1:
                        System.out.println(camioneta+"\n");
                        flag2 = true;
                    break;
                    case 2:
                        System.out.println(coche+"\n");
                        flag2 = true;
                    break;
                    case 3:
                        System.out.println(camioneta2);
                        flag2 = true;
                    break;
                    case 4:
                        System.out.println(coche2+"\n");
                        flag2 = true;
                    break;
                    case 5:
                        System.out.println(camion+"\n");
                        flag2 = true;
                    break;
                }
                 if(vehi>5 || vehi<1){
                         System.out.println("Vehiculo no existe\n");
                         flag2 = true;
                    }
            break;
                
            case 2:
                System.out.println("\n");
                System.out.println("INGRESA EL NUMERO DE VEHICULO A MOFIDICAR");
                int j=1;
                for(Auto temp:Almacen)
                    {
                        System.out.println(j+".- "+temp.getMarca());
                        j=j+1;
                    }
                System.out.println("->");
                int vehiculo=Entrada.nextInt();
                
                    switch(vehiculo)
                        {
                        case 1:
                            System.out.println(camioneta+"\n");
                            System.out.println("Cual sera el nuevo color?");
                            String ncolor=Entrada.next();
                            System.out.println("Cuale sera la nueva placa?");
                            String nplaca=Entrada.next();
                            System.out.println("Cuntas personas hay arriba?");
                            int nperson=Entrada.nextInt();
                            camioneta.setColor(ncolor);
                            camioneta.setPlacas(nplaca);
                            camioneta.setPersonas(nperson);
                            System.out.println("\n");
                            flag2 = true;
                        break;
                            
                         case 2:
                             System.out.println(coche+"\n");
                             System.out.println("Cual sera el nuevo color?");
                            String ncolorc=Entrada.next();
                            System.out.println("Cuale sera la nueva placa?");
                            String nplacac=Entrada.next();
                            System.out.println("Cuntas personas hay arriba?");
                            int npersonc=Entrada.nextInt();
                            coche.setColor(ncolorc);
                            coche.setPlacas(nplacac);
                            coche.setPersonas(npersonc);
                            System.out.println("\n");
                            flag2 = true;
                        break;
                             
                        case 3:
                            System.out.println(camioneta2+"\n");
                            System.out.println("Cual sera el nuevo color?");
                            String ncolorca2=Entrada.next();
                            System.out.println("Cuale sera la nueva placa?");
                            String nplacaca2=Entrada.next();
                            System.out.println("Cuntas personas hay arriba?");
                            int npersonca2=Entrada.nextInt();
                            camioneta2.setColor(ncolorca2);
                            camioneta2.setPlacas(nplacaca2);
                            camioneta2.setPersonas(npersonca2);
                            System.out.println("\n");
                            flag2 = true;
                        break;
                            
                        case 4:
                            System.out.println(coche2+"\n");
                            System.out.println("Cual sera el nuevo color?");
                            String ncolorco2=Entrada.next();
                            System.out.println("Cuale sera la nueva placa?");
                            String nplacaco2=Entrada.next();
                            System.out.println("Cuntas personas hay arriba?");
                            int npersonco2=Entrada.nextInt();
                            coche2.setColor(ncolorco2);
                            coche2.setPlacas(nplacaco2);
                            coche2.setPersonas(npersonco2);
                            System.out.println("\n");
                            flag2 = true;
                        break;
                            
                        case 5:
                            System.out.println(camion+"\n");
                            System.out.println("Cual sera el nuevo color?");
                            String ncolorcam=Entrada.next();
                            System.out.println("Cuale sera la nueva placa?");
                            String nplacacam=Entrada.next();
                            System.out.println("Cuntas personas hay arriba?");
                            int npersoncam=Entrada.nextInt();
                            camion.setColor(ncolorcam);
                            camion.setPlacas(nplacacam);
                            camion.setPersonas(npersoncam);
                            System.out.println("\n");
                            flag2 = true;
                        break;
                        }//end of switch
                    if(vehiculo>5 || vehiculo<1){
                         System.out.println("Vehiculo no existe\n");
                         flag2 = true;
                    }
            break;   
                
            case 3:
                    flag2 = false;
                    flag = false;
            break;
        }//end of switch
         if(des>4 || des<1){
                         System.out.println("OPCION INCORRECTA!");
                         flag2 = true;
                    }
                } catch (Exception ex) {
                    System.err.println("Valor no concuerda");
                    flag2 = true;
                }
            } while (flag2);
        
        
        
        
        
    }
    
    
}
