import java.util.Scanner;
import java.lang.Math;

public class MainClass {
	
static int areacuadrado (int n1){
 return n1*n1;
}

static double areaCirculo(int r){
  double PI=3.1416;
  return  PI * Math.pow(r,2);
}

static int areatriangulo(int a, int b){
 return (a*b)/2;
}

public static void main(String[] args) {
  Scanner teclado = new Scanner(System.in);
  int opcion=0;
  do{
  System.out.println();
  System.out.println();
  System.out.println(" ======== MENU DE OPCIONES ========= ");
  System.out.println(" ___________________________________ ");
  System.out.println(" ======== 1. Cuadrado      ========= ");
  System.out.println(" ======== 2. Circulo       ========= ");
  System.out.println(" ======== 3. Triangulo     ========= ");
  System.out.println(" ___________________________________ ");
  System.out.println(" Ingrese una opcion ");
  opcion = teclado.nextInt();
  switch (opcion){
  case 1:
   System.out.println("Ingrese el lado ");
   int lado = teclado.nextInt();
     System.out.println(" EL AREA DEL CUADRADO ES :"+ areacuadrado(lado));
  break;
        case 2:
         System.out.println("Ingrese el radio ");
        int radio = teclado.nextInt();
          System.out.println(" EL AREA DEL CIRCULO ES :"+ areaCirculo(radio));
  break;
        case 3:
         System.out.println(" Ingrese la base ");
         int base = teclado.nextInt();
         System.out.println(" Ingrese la altura ");
         int altura = teclado.nextInt();
         
         System.out.println(" EL AREA DEL TRIANGULO ES :"+areatriangulo(base,altura));
  break;

  }
 
  }while(opcion!=9);
 }

} 