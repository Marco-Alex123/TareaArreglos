package tarea1;
import java.util.Scanner;
import java.util.Random;
public class tarea1{

    static int num = 7;
    static int resp=1;
    static     int resp2= 0;
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        //LLAMADA AL METODO MENU
        menu(resp2);
        
    }
// EN ESTE METODO SE ELIJE QUE METODO SE EJECUTA
    public static void menu(int resp2) {
        do {
            System.out.println("QUE METODO DESEA EJECUTAR?");
            System.out.println("1=======>DIAGONAL PRINCIPAL ");
            System.out.println("2=======>DIAGONAL PRINCIPAL HACIA ARRIBA");
            System.out.println("3=======>MATRIZ B");
            System.out.println("4=======>MAYOR Y MENOR");
     
            resp2= leer.nextInt();
        
 
           
                    
            switch (resp2) {
            case 1:
                System.out.println("INGRESE UN NUMERO PARA DEFINIR EL TAMAÑO ");
                num = leer.nextInt();
                met1(num);
                System.out.println("DESEA CONTINUAR?1=SI 0=NO");
                resp= leer.nextInt();
                break;

            case 2:
                
                System.out.println("INGRESE UN NUMERO PARA DEFINIR EL TAMAÑO ");
                num = leer.nextInt();
                met2(num);
                System.out.println("DESEA CONTINUAR?1=SI 0=NO");
                resp= leer.nextInt();
                break;
            case 3:
                
                System.out.println("INGRESE UN NUMERO PARA DEFINIR EL TAMAÑO ");
                num = leer.nextInt();
                met3(num);
                System.out.println("DESEA CONTINUAR?1=SI 0=NO");
                resp= leer.nextInt();
                break;
                
            case 4:
                
                System.out.println("INGRESE UN NUMERO PARA DEFINIR EL TAMAÑO ");
                num = leer.nextInt();
                met4(num);
                System.out.println("DESEA CONTINUAR?1=SI 0=NO");
                resp= leer.nextInt();
                break;
            }           
        }while (resp>0);
    }
        
                
        
        
    
//ESTE ES EL METODO NUMERO1 QUE RECIBE COMO PARAMETRO LA VARIABLE DE TIPO ENTERO NUM
    //NUM DEFINE EL TAMAÑO DEL ARREGLO
    public static void met1(int num) {
        //CREAMOS UNA MATRIZ CON NUM
        int[][] a = new int[num][num];
        System.out.println("*** METODO #1 *******");
//  RECORRE EL ARREGLO EN LA POSICION I
for (int i = 0; i < num; i++) {
    //  RECORRE EL ARREGLO EN LA POSICION J
            for (int x = 0; x < num; x++) {
                //CONDICION QUE DEFINE QUE CUANDO I Y J SEAN IGUALES REGRESARA UN 1 
                //EN CASO DE SER DIFERENTES REGRESARA UN 0
                if (i == x) {
                    a[i][x] = 1;
                } else {
                    a[i][x] = 0;
                }
            }

        }
//ESTE METODO IMPRIME EL ARREGLO
        for (int i = 0; i < num; i++) {
            for (int x = 0; x < num; x++) {
                System.out.print(" " + a[i][x]);
            }
            System.out.println();
        }
    }
// METODO QUE EJECUTA EL EJERCICIO 2
    public static void met2(int num) {
      int[][] a = new int[num][num];
        System.out.println("*** METODO #2 *******");
//SE USAN PARA RECORRER EL ARREGLO
        for (int i = 0; i < num; i++) {
            for (int x = 0; x < num; x++) {
               //CONDICION QUE ASIGNA UN UNO CUANDO X+I SEAN IGUALES AL LARGO DEL ARREGLO MENOS UNO
              
                if (i+x==num-1) {
                    a[i][x] = 1;
                } else { //A LOS DEMAS LES PONE CEROS
                    a[i][x] = 0;
                }
            }

        }
        for (int i = 0; i < num; i++) {
            for (int x = 0; x < num; x++) {
                System.out.print(" " + a[i][x]);
            }
            System.out.println();
        }
    }
public static void met3(int num){
        Random aleatorio = new Random(System.currentTimeMillis());
 
           System.out.println("*** METODO #3 *******");
           
    int[][] a = new int[num][num];
    //RELLENA EL ARREGLO CON VALORES RANDOM
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
              int ale = aleatorio.nextInt(100);
                a [i][j] =ale;
            }
        }
        //IMPRIME EL ARREGLO
        for (int i = 0; i < num; i++) {
            for (int x = 0; x < num; x++) {
                System.out.print(" " + a[i][x]);
            }
            System.out.println("");
        }
       //RECORRE EL ARREGLO Y SACA EL MOD DE CADA UNO DE LOS VALORES, SI ESTE ES IGUAL A 0 LO GUARDA EN UN ACUMULADOR
        for (int i = 0; i < num; i++) 
        {
                    int acum = 0;
            for (int j = 0; j < num; j++) {
                if (a[i][j]%2==0) {
                    acum+=a[i][j];
                }
                
            }
            //SALIENDO DEL PRIMER FOR SE IMPRIME EL VALOR DE ACUM Y TE DICE QUE FILA SUMO
                            if (acum!=0 ) {
                    System.out.println("La suma de los valores en la Fila '" +i+"' es igual a ="+ acum);    
                }
        }

    }
    
    
    public static void met4(int num){
        Random aleatorio = new Random(System.currentTimeMillis());
 
           System.out.println("*** METODO #4 *******");
    int[][] a = new int[num][num];
    //RELLENA EL ARREGLO CON VALORES RANDOM
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
              int ale = aleatorio.nextInt(100);
                a [i][j] =ale;
            }
        }
        //IMPRIME EL ARREGLO
        for (int i = 0; i < num; i++) {
            for (int x = 0; x < num; x++) {
                System.out.print(" " + a[i][x]);
            }
            System.out.println("");
        }
        //SE CREAN VARIABLES ENTERAS DONDE SE LES ASIGNA LO QUE TENGA EL ARREGLO EN SUS POSICIONES 0
        int nummay = a[0][0];
        int nummen = a[0][0];
        //RECORRE EL ARREGLO Y HACE UNA COMPARACION
        for (int i = 0; i < num; i++) 
        {
            for (int j = 0; j < num; j++) {
                // COMPARACION EN LA CUAL SI LA VARIABLE NUMMAY ES MENOR A EL NUMERO EN LA POSICION DEL ARREGLO
                //A LA VARIABLE NUMMAY SE LE ASIGNA LO QUE TENGA EL ARREGLO EN DICHA POSICION
                if (a[i][j]>= nummay) {
                    nummay=a[i][j];
                }
                 // COMPARACION EN LA CUAL SI LA VARIABLE NUMMEN ES MAYOR A EL NUMERO EN LA POSICION DEL ARREGLO
                //A LA VARIABLE NUMMEN SE LE ASIGNA LO QUE TENGA EL ARREGLO EN DICHA POSICION
                if (a[i][j]<= nummen) {
                    nummen=a[i][j];
                }
            }
        }
        System.out.println("El mayor es: "+ nummay);
        System.out.println("El menor es: "+ nummen);
    }
}
