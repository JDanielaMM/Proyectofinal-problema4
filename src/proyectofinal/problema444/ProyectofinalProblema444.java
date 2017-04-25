/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal.problema444;

import javax.swing.JOptionPane;

/**
 *
 * @author danii
 */
public class ProyectofinalProblema444 {

    /**
     * @param args the command line arguments
     * 
     * Johanna Daniela Macías Martínez A01411534
   Iván Constantino Hernández A01411529
   Maythe Portales Barrios A01411461
   Luisa Fernanda Sosa Brambila A01411485
     */
    public static void main(String[] args) {
       String arreglo[][] = new String [3][9];
       String arreglo2[][] = new String [3][9];
       String cosa[]={"Clave: ","Descripción: ","Precio: "}; 
       boolean flag = true;  
       int opc=0;
       do{
           try{
            String menu=JOptionPane.showInputDialog("Ingrese la opcion deseada: \n"
                   + "1. Inventario \n"
                   + "2. Vender \n"
                   + "3. Salir \n");
            opc=Integer.parseInt(menu);
           }
           catch(Exception e){
               opc=3;
           }
                 
        switch(opc){
            
            case 1:         
                double precio1=0;
                String precio2;
        for (int i=0; i<2;i++){     
            for (int j=0;j<2;j++){
               String dato=JOptionPane.showInputDialog(cosa[j]); 
               arreglo[i][j]=dato;
            }
            precio1=solicitadouble("Precio: ");
            precio2=Double.toString(precio1);
            arreglo[i][2]=precio2;
        }               
                flag=true;
               break;
    
        case 2:
         String clave;  
         int x=0;
         boolean band;
         do{
              try{       
         band=true;
         x=0;
         clave=JOptionPane.showInputDialog("Escribe la clave: "); 
         
         for (int i=0; i<2;i++){ 
           for (int j=0;j<3;j++){   
             
             if (clave.equals(arreglo[i][0])){                 
             arreglo2[i][j]=arreglo[i][j];
             x=1;
            }
             
            }
           
         }   System.out.println(x);
         
         if (x==0){
         JOptionPane.showMessageDialog(null, "No existe la clave");
         x=1;
            }    
              }
         catch(Exception e){
                 band=false;
               }
              
       
         }while(band);
            break;
               
            
        case 3:
            String suma="";
            double total=0;
            suma=suma+"Productos vendidos\n";
            for (int i=0; i<2;i++){                 
                
           for (int j=0; j<3;j++){
               
           if(arreglo2[i][j]!=null){        
             suma=suma+cosa[j]+arreglo2[i][j]+"\n"; 
             if(j==2){
             total=total+Double.parseDouble(arreglo2[i][j]);
             }
            }
            }
           suma=suma+"\n";
            }           
            JOptionPane.showMessageDialog(null, suma);
         JOptionPane.showMessageDialog(null, "Total de productos vendidos: \n"+total);
            flag=false;
            break;
    }
        
    }while(flag); 
        
    }
    
    public static double solicitadouble(String men){
        double num=0;
        boolean flag;
        do{
            try{
                String dato = JOptionPane.showInputDialog(men);
                num = Double.parseDouble(dato);
                flag=false;
            }
            catch(Exception e){

                JOptionPane.showMessageDialog(null, "No tecleaste un número entero","Error",0);
                flag=true;
            }
        }
        while(flag);
        return num;
    }
}        
