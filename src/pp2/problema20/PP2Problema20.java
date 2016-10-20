/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.problema20;
import java.util.*;
/**
 *
 * @author Enano
 */
public class PP2Problema20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables
        int num1,num2;
        // Resolución
        num1=getNum(1);
        num2=getNum(2);
        print(calcIsFriendNum(num1,num2));
    }
    public static int getNum(int num) //Se recibe el número
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese el número "+num+" :");
        return in.nextInt();
    }
    public static boolean calcIsFriendNum(int num1, int num2) 
    {
        boolean isFrNum=false; //Booleano que determine si son números amigos, se inicializa en falso.
        int checksum1=0;int checksum2=0;
        for(int i=1;i<num1;i++) //Se hace un ciclo, que intenta con números desde el 1.
        {
            if(num1%i==0)  //Si es un múltiplo
            {
                checksum1=checksum1+i; //Lo agrega a los múltiplos del primer número.
            }
            if(checksum1==num2) //Si la suma es igual al segundo número...
            {
                for(int j=1;j<num2;j++) //Se consiguen los múltiplos de la misma manera
                {
                    if(num2%j==0)
                    {
                        checksum2=checksum2+j;  
                    }
                }
            }
            if (checksum2==num1) //Y se comprueba si la suma del segundo es igual al primer número
            {
                isFrNum=true;   //El booleano regresa verdadero
            }
        }
        return isFrNum;
    }
    public static void print(boolean isFrNum)   //Se imprime dependiendo si es falso o verdadero.
    {
        if(isFrNum==true)
        {
            System.out.println("Los números son amigos!");
        }
        else
        {
            System.out.println("Los números no son amigos...");
        }
    }
}
