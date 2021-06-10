import java.util.*;

public class Ejercicio12{

	public static void main(String[] args) {
		//Inicializamos scanner y declaramos variables
		Scanner scanner = new Scanner(System.in);
		double altura;
		double alturaTotalHombres;
		double alturaTotalMujeres;
		double contador;
		double contadorHombres;
		double contadorMujeres;
		double edad;
		double edadTotal;
		double sexo;
		double contadorPersonas;
		//inicializamos
		altura = 0;
		contadorHombres = 0;
		alturaTotalHombres = 0;
		contadorPersonas = 0;
		edadTotal = 0;
		contadorMujeres = 0;
		alturaTotalMujeres = 0;
		// creamos un ciclo 
		while(altura >= 0){
			System.out.println("Ingrese atura: ");
			altura = scanner.nextDouble();
			if (altura >= 0) {
				System.out.println("Ingrese edad: ");
				edad = scanner.nextDouble();
				System.out.println("Ingrese un numero dependiendo de su sexo: 1 = masculino o 2 = femenino: ");				
				sexo = scanner.nextDouble();
				if (sexo == 1) {
					contadorHombres = contadorHombres+1;
					alturaTotalHombres = alturaTotalHombres+altura;					
				} else {
					contadorMujeres = contadorMujeres+1;
					alturaTotalMujeres = alturaTotalMujeres+altura;
				}
				contadorPersonas = contadorPersonas+1;
				edadTotal = edadTotal+edad;
			}
		}
		System.out.println("");
		System.out.println("El promedio de altura de las mujeres es: "+alturaTotalMujeres/contadorMujeres);
		System.out.println("El promedio de altura de los varones es: "+alturaTotalHombres/contadorHombres);
		System.out.println("Promedio edad de los participantes: "+edadTotal/contadorPersonas);

	}

}