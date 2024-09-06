
import java.util.*;
public class examen1 {
    public static void main(String[] args){
        Scanner cin=new Scanner(System.in);

        System.out.println("este es un nuevo mensaje jjsjs");
        System.out.println("ingrese el primer numero:");
        int a=cin.nextInt();
        System.out.println("ingrese el segundo numero:");
        int b=cin.nextInt();
        if(b!=0){
        if(a%b==0){
            System.out.println("es divisible:");
        }else{
            System.out.println("no es divisible:");
        }
    }else{
        System.out.println("no existen division entre cero;");
        }
    }
}