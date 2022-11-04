/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examens;

import java.util.Scanner;

/**
 *
 * @author jpsam
 */
public class Examens {

    /**
     * @param args the command line arguments
     */
    public static Examens CL = new Examens();
    public static int settings;
    
    public static void main(String[] args) {
        CL.menu();
    }
    
    
    public void menu(){
    if((settings >= 1) || (settings <=5)){
            System.out.println("ExamenFinal - IPC 1 - Juan Pablo Samayoa Ruiz - 2022");
            System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
            System.out.println("|                      Menú                         *");
            System.out.println("*                   1.Problema 1                    |");
            System.out.println("|                   2.Problema 2                    *");
            System.out.println("*                   3.Problema 3                    |");
            System.out.println("*                   4.Salir                         |");
            System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
            System.out.print("Seleccione una opción --> ");
            
            Scanner OP = new Scanner(System.in);
            String seleccion = OP.next();
            int n = Integer.parseInt(seleccion);
            
            switch(n){
                case 1: CL.Prob1(); break;
                case 2: CL.Prob2(); break;
                case 3: CL.Prob3(); break;
                case 4:System.exit(0); break;
            }
        }else{
            System.out.print("Ninguna de las opciones es valida");
            System.out.print("vuelva a ejecutar el programa");
        }
    }
    
    public void Prob1(){
        Scanner OP = new Scanner(System.in);
        int n1, n2;
        
        System.out.print("->Ingrese el primer numero: ");
        n1 = OP.nextInt();
        
        System.out.print("->Ingrese el segundo numero: ");
        n2 = OP.nextInt();
        
        if(n1>n2){
            System.out.println("El primer numero es mayor");
        }else{
            System.out.println("El segundo numero es mayor");
        }
        
        if((settings >= 1) || (settings <=3)){
            System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
            System.out.println("*             Ingresar otra opcion                 |");
            System.out.println("*                   1.Si                           |");
            System.out.println("|            2.No (menu principal)                 *");
            System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
            System.out.print("Seleccione una opción --> ");
            
            String seleccion = OP.next();
            int n = Integer.parseInt(seleccion);
            
            switch(n){
                case 1: CL.Prob1(); break;
                case 2: CL.menu(); break;
            }
        }
    }
    
    public void Prob2(){
        Scanner OP = new Scanner(System.in);
        int n1, n2;
        
        System.out.print("Ingrese el numéro de filas:");
       int num = 1;
       int FilTam = OP.nextInt();
       
       if (FilTam%2==1) {
            for(int j = 0; j < (FilTam/2)+1; j++) {
                for(int i = FilTam - 1; i > j; i--) {
                    System.out.print(" ");
                }
                for(int i = 0; i < num; i++) {
                    System.out.print("*");
                }
                num += 2;
                System.out.println();
            }
       }else{
           System.out.println("El número no es impar");
       }
        
        if((settings >= 1) || (settings <=3)){
            System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
            System.out.println("*             Ingresar otra opcion                 |");
            System.out.println("*                   1.Si                           |");
            System.out.println("|            2.No (menu principal)                 *");
            System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
            System.out.print("Seleccione una opción --> ");
            
            String seleccion = OP.next();
            int n = Integer.parseInt(seleccion);
            
            switch(n){
                case 1: CL.Prob2(); break;
                case 2: CL.menu(); break;
            }
        }
    }
    
    public void Prob3(){
        Scanner OP = new Scanner(System.in);
        System.out.println("We're no strangers to love\n" +
"You know the rules and so do I (do I)\n" +
"A full commitment's what I'm thinking of\n" +
"You wouldn't get this from any other guy\n" +
"I just wanna tell you how I'm feeling\n" +
"Gotta make you understand\n" +
"Never gonna give you up\n" +
"Never gonna let you down\n" +
"Never gonna run around and desert you\n" +
"Never gonna make you cry\n" +
"Never gonna say goodbye\n" +
"Never gonna tell a lie and hurt you\n" +
"We've known each other for so long\n" +
"Your heart's been aching, but you're too shy to say it (say it)\n" +
"Inside, we both know what's been going on (going on)\n" +
"We know the game and we're gonna play it\n" +
"And if you ask me how I'm feeling\n" +
"Don't tell me you're too blind to see\n" +
"Never gonna give you up\n" +
"Never gonna let you down\n" +
"Never gonna run around and desert you\n" +
"Never gonna make you cry\n" +
"Never gonna say goodbye\n" +
"Never gonna tell a lie and hurt you\n" +
"Never gonna give you up\n" +
"Never gonna let you down\n" +
"Never gonna run around and desert you\n" +
"Never gonna make you cry\n" +
"Never gonna say goodbye\n" +
"Never gonna tell a lie and hurt you\n" +
"We've known each other for so long\n" +
"Your heart's been aching, but you're too shy to say it (to say it)\n" +
"Inside, we both know what's been going on (going on)\n" +
"We know the game and we're gonna play it\n" +
"I just wanna tell you how I'm feeling\n" +
"Gotta make you understand\n" +
"Never gonna give you up\n" +
"Never gonna let you down\n" +
"Never gonna run around and desert you\n" +
"Never gonna make you cry\n" +
"Never gonna say goodbye\n" +
"Never gonna tell a lie and hurt you\n" +
"Never gonna give you up\n" +
"Never gonna let you down\n" +
"Never gonna run around and desert you\n" +
"Never gonna make you cry\n" +
"Never gonna say goodbye\n" +
"Never gonna tell a lie and hurt you\n" +
"Never gonna give you up\n" +
"Never gonna let you down\n" +
"Never gonna run around and desert you\n" +
"Never gonna make you cry\n" +
"Never gonna say goodbye\n" +
"Never gonna tell a lie and hurt you");
        
        if((settings >= 1) || (settings <=3)){
            System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
            System.out.println("*             Ingresar otra opcion                 |");
            System.out.println("*                   1.Si                           |");
            System.out.println("|            2.No (menu principal)                 *");
            System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
            System.out.print("Seleccione una opción --> ");
            
            String seleccion = OP.next();
            int n = Integer.parseInt(seleccion);
            
            switch(n){
                case 1: CL.Prob3(); break;
                case 2: CL.menu(); break;
            }
        }
    }
    
    
}
