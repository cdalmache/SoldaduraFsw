
package daniel.soldadura11_fsw;

/**
 * @author ALMACHE CRISTIAN
 */
import java.util.*;
import java.util.Scanner;
public class Soldadura11_Fsw {

    public static void Encabezado(){
        System.out.println("UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE");
        System.out.println("Soldadura Fws");        
    }
    
    
    public static int Determinar_presion(){ 
        int valor_presion;
        Scanner newton=new Scanner(System.in);
         valor_presion=newton.nextInt();      
         return valor_presion;
   }    
    
    
    public static void Determinar_velocidad(){
        int valor_velocidad;
         Scanner vel=new Scanner(System.in);
        System.out.println("Valor maximo 1120 rpm  ");
        System.out.print("INGRESE LA VELOCIDAD REQUERIDA PARA LA SOLDADURA: ");
         valor_velocidad=vel.nextInt();
         if(valor_velocidad<1120){
             System.out.println("Es posible soldar");
         }else{
             System.out.println("No es posible soldar");
       }
     }
    
    
    public static float Ubicar_pieza(){
        float lado,base, altura;
        String material;
          Scanner matpieza=new Scanner(System.in);
          Scanner pieza=new Scanner(System.in);
          System.out.println("INGRESE LAS DIMENCIONES DE LA PIEZA");
          System.out.print("LADO: ");
           lado=pieza.nextFloat();
          System.out.print("BASE: ");
          base=pieza.nextFloat();
          System.out.print("ALTURA : ");
          altura=pieza.nextFloat();
           System.out.print("TIPO DE MATERIAL : ");
          material=matpieza.next();
          return lado;
    }
    
    
    public static float Ubicar_riel(){
        float mlado=350,mbase=200, maltura=100;
        
        String alimentacion;
        
        
          return 0;
    }
          
    
   public static float Rotar_motor(){
       float velocidad_motor=450,voltaje_alimentacion=330;
       String tipo_motor;      
       
       return velocidad_motor; 
    }
    
   
    public static float Desplazar_riel(){
       float dimension_riel=350, velocidad_desplazamiento=40, valor_presion;
    
       return dimension_riel;
      
   }
   
    public static float Detener_riel(){
        float dimension_riel=40, presion_riel,desplazamiento_max_riel=40;
        
        
        return dimension_riel;
    }
    
    public static void main(String[] args) {
        Encabezado();
        System.out.println("Valor maximo 20KN ");
        System.out.print("INGRESE LA PRESION REQUERIDA PARA LA SOLDADURA: ");
        Determinar_presion();
        Determinar_velocidad();
        Ubicar_riel();        
        Ubicar_pieza();
        Rotar_motor();
        Desplazar_riel();
        Detener_riel();
        
        System.out.println(Determinar_presion());
          
    }
   }
