import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Parqueadero pp= new Parqueadero();

        int op=0;

        do{
            System.out.println("Ingrese la opcion del menu");
            System.out.println("1. Ingresar carro a parqueadero");
            System.out.println("2 Dar salida a un carro del paqueader");
            System.out.println("3 Informar los ingresos del parqueadero");
            System.out.println("4 cinsultar cantidad de puestos disponibles");
            System.out.println("5 Avanzar reloj del parqueadero");
            System.out.println("6 cambiar tarifa del parqueadero");

            op = Integer.parseInt(sc.next());
            switch (op){
                case 1:

                    System.out.println("Ingrese la placa");
                    String pPlaca = sc.next();
                    System.out.println("Ingrese la Hora");
                    int pHora=Integer.parseInt(sc.next());
                    pp.entrarCarro(pPlaca, pHora);
                    System.out.println("El carro se ha ingresado exitosamente");

                    break;
                case 2:

                    System.out.println("Ingrese la placa del vehiculo que desea sacar");
                    pPlaca = sc.next();
                    System.out.println("Ingrese la Hora de salida");
                    int pHoraSalida=Integer.parseInt(sc.next());
                    pp.sacarCarro(pPlaca, pHoraSalida);
                    break;
                case 3:
                    System.out.println("Los ingresos son: "+ pp.darMontoCaja());
                    break;
                case 4:
                    System.out.println("Los puestos disponibles son: "+pp.calcularPuestosLibres());
                    break;
                case 5:
                    pp.avanzarHora();
                    break;
                case 6:
                    System.out.println("Ingrese la nueva tarifa: ");
                    int pTarifa = Integer.parseInt(sc.next());
                    pp.cambiarTarifa(pTarifa);
                    break;





            }

        }while(op!=7);
    }
}