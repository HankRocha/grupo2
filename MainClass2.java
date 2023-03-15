import java.util.Scanner;
import java.lang.Math;

public class Geometricas {
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
    static int arearectangulo(int b , int h){
        return b*h ;
    }
    static int areapentagono(int p, int a){
        return (p*a) / 2;
    }
    static int arearombo(int D,int d){
        return (D*d)/2 ;
    }
    static int arearomboide(int b,int h){
        return b*h ;
    }
    static int areatrapecio (int B , int b , int h){

        return ((B+b)/2)*h;
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
            System.out.println(" ======== 4. Rectangulo    ========= ");
            System.out.println(" ======== 5. Pentagono     ========= ");
            System.out.println(" ======== 6. Rombo         ========= ");
            System.out.println(" ======== 7. Romboide      ========= ");
            System.out.println(" ======== 8. Trapecio      ========= ");
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
                case 4:
                    System.out.println(" Ingrese la BASE ");
                    int base_rec = teclado.nextInt();
                    System.out.println(" Ingrese la ALTURA ");
                    int altura_rec = teclado.nextInt();
                    System.out.println(" EL AREA DEL RECTANGULO ES :"+arearectangulo(base_rec,altura_rec));
                    break;
                case 5:
                    System.out.println(" Ingrese el perimetro");
                    int perimetro = teclado.nextInt();
                    System.out.println("Ingrese el Apotema");
                    int apotema= teclado.nextInt();
                    System.out.println(" EL AREA DEL PENTAGONO ES :"+areapentagono(perimetro,apotema));
                    break;
                case 6:
                    System.out.println("Ingrese el Diagonal Mayor");
                    int Diagonal_Ma=teclado.nextInt();
                    System.out.println("Ingrese el Diagonal Menor");
                    int Diagonal_Me=teclado.nextInt();
                    System.out.println(" EL AREA DEL ROMBO ES :"+arearombo(Diagonal_Ma,Diagonal_Me));
                    break;
                case 7:
                    System.out.println("Ingrese la base");
                    int base_r =teclado.nextInt();
                    System.out.println("Ingrese la Altura");
                    int altura_r =teclado.nextInt();
                    System.out.println(" EL AREA DEL ROMBOIDE ES :"+arearomboide(base_r,altura_r));
                    break;
                case 8:
                    System.out.println("INGRESE LA BASE MAYOR");
                    int base_ma=teclado.nextInt();
                    System.out.println("INGRESE LA BASE MENOR");
                    int base_me=teclado.nextInt();
                    System.out.println("INGRESE LA ALTURA");
                    int altura_t=teclado.nextInt();
                    System.out.println(" EL AREA DEL TRAPECIO ES :"+areatrapecio(base_ma,base_me,altura_t));
                    break;

            }

        }while(opcion!=9);
    }

} 