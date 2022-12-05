package convo1;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class tienda {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int opcion =1;
		while(opcion != 0) {
		System.out.println("--------------------------------");
		System.out.println("Bienvenido a Electroman");
		System.out.println("--------------------------------");
		System.out.println("Tienda de Electrodomesticos");
		System.out.println("--------------------------------");
		System.out.println("Para ver que productos tenemos presione...");
		System.out.println("1. Productos.");
		System.out.println("2. para realizar una compra presione 2.");
		System.out.println("3. Salir del programa.");
		int op = sc.nextInt();
		
		switch(op) {
		case 1:
			lavadora  producto1 = new lavadora("Lavadora", "TelStar", 5800);
			microondas producto2 = new microondas("Microondas", "Black+Decker", 2000);
			televisor producto3 = new televisor("Televisor", "LG", "42pulgadas", 4800);
			
			System.out.println("Lavadora ");
			producto1.mostrar();
			System.out.println();
			System.out.println("Microondas ");
			producto2.mostrar();
			System.out.println();
			System.out.println("Televisor ");
			producto3.mostrar();
			break;
		case 2:
			System.out.println("1.comprar Lavadora ");
			System.out.println("2.comprar Microondas ");
			System.out.println("3.comprar Televisor");
			int po = sc.nextInt();
			switch(po) {
			case 1:
				System.out.println("***compra de lavadora***");
				System.out.println("***Solo se acepta pago en cordoba***");
				System.out.println("Lavadora = " + mostrar1());
				System.out.println("Con cuanto va a pagar");
				int pago = sc.nextInt();
				if( pago > 5800) {
					double resultado = 0;
					resultado = pago - 5800;
					System.out.println("Paga con: " + pago);
					System.out.println("Su cambio es de: " + resultado);
				}else if(pago == 5800) {
					System.out.println("Su cambio es de 0.");
				}else if(pago < 5800){
					System.out.println("ERROR EN EL SISTEMA");
				}
				 break;
			case 2:
				System.out.println("***compra de microondas***");
				System.out.println("***Solo se acepta pago en cordoba***");
				System.out.println("Microondas = " + mostrar2());
				System.out.println("Con cuanto va a pagar");
				int pagom = sc.nextInt();
				if( pagom > 2000) {
					double resultado = 0;
					resultado = pagom - 2000;
					System.out.println("Paga con: " + pagom);
					System.out.println("Su cambio es de: " + resultado);
				}else if(pagom == 2000) {
					System.out.println("Su cambio es de 0.");
				}else if(pagom < 2000){
					System.out.println("ERROR EN EL SISTEMA");
				}
				 break;
			case 3:
				System.out.println("***compra de televisor***");
				System.out.println("***Solo se acepta pago en cordoba***");
				System.out.println("Televisor = " + mostrar3());
				System.out.println("Con cuanto va a pagar");
				int pagot = sc.nextInt();
				if( pagot > 4800) {
					double resultado = 0;
					resultado = pagot - 4800;
					System.out.println("Paga con: " + pagot);
					System.out.println("Su cambio es de: " + resultado);
				}else if(pagot == 4800) {
					System.out.println("Su cambio es de 0.");
				}else if(pagot < 4800){
					System.out.println("ERROR EN EL SISTEMA");
				}
				break;
			}
			break;
		case 3:
			System.out.println("Fin del programa.");
			System.out.println("Felices fiestas.");
			System.exit(opcion);
			break;
		 default:
             System.out.println("ERROR! escoge una opcion valida!");
             break;
		 }
	   }
    }

	
    private static String mostrar1() {
		return "5800";
	}
	private static String mostrar2() {
		return "2000";
	}
	private static String mostrar3() {
		return "4800";
	}

}
