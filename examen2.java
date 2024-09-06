

import java.util.Scanner;
public class examen2 {
    public static void main(String[] args){
        Scanner cin=new Scanner(System.in);
        System.out.println("ingrese el n numero de las palabras que ingresar.");
        int n=cin.nextInt();
        String [] nom=new String[n];
        for(int i=0; i<n; i++){
            nom[i]=cin.next();
            //array.s
        }
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(nom[j].compareTo(nom[i])<0){
                    String aux=nom[i];
                    nom[i]=nom[j];
                    nom[j]=aux;
                }
            }
        }
                for(String r: nom)
                System.out.print(r+" ");
    }
}
    /*public static void main(String[] args){
        Scanner cin=new Scanner(System.in);
        String nombre=cin.nextLine();
        String[] vect=nombre.split(" ");
        Arrays.sort(vect, String.CASE_INSENSITIVE_ORDER);
            for(int i = 0; i < vect.length; i++){
                System.out.print(vect[i] + " ");
                }
    }
}*/