package Practico_1;

public class Practico_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Ejercicio1
		//Apartado a.
		/*int numeroInicio = 5, numeroFin = 14;
		
		while(numeroInicio<=numeroFin) {
			System.out.print("- "+numeroInicio);
			numeroInicio = numeroInicio + 1;
		}*/
		
		//Apartado b.
		/*int numeroInicio = 5,numeroFin = 14;
		
		while(numeroInicio<=numeroFin) {
			if(numeroInicio%2==0) {
				System.out.print("- "+numeroInicio);
			}
			numeroInicio = numeroInicio + 1;
		}*/
		
		//Apartado c.
		/*int numeroInicio = 5,numeroFin = 14;
		boolean numerosPares=true;
		
		while(numeroInicio<=numeroFin) {
			if(numerosPares==true) {
				if(numeroInicio%2==0) {
					System.out.print("- "+numeroInicio);
				}
				//Es posible usar dentro del "if" solamente la variable "numerosPares", "if(numerosPares)"
			}else {
				if(numeroInicio%2!=0) {
					System.out.print("- "+numeroInicio);
				}
			}
			numeroInicio = numeroInicio + 1;
		}*/
		
		//Apartado d.
		/*int numeroInicio = 5;
		
		for(int numeroFin=14;numeroFin>=numeroInicio;numeroFin--) {
			if(numeroFin%2==0) {
				System.out.print("- "+numeroFin);
			}
		}*/
		//Ejercicio 2
		//Apartado a.
		/*float ingresos=0;
		int vehiculos=0, antiguedad=0, inmuebles=0;
		boolean embarcacion=true, aereonave=false, titularActivos=false;
		
		if(embarcacion==true || aereonave==true || titularActivos==true) {
			System.out.println("Pertenece al segmento iiii");
		}else {
			if(inmuebles>=3) {
				System.out.println("Pertenece al segmento iii");
			}else {
				if(vehiculos>=3 && antiguedad<5) {
					System.out.println("Pertenece al segmento ii");
				}else {
					if(ingresos<=409.083) {
						System.out.println("Pertenece al segmento i");
					}
				}
			}
		}*/

	}

}