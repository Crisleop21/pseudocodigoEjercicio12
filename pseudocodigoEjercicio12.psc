Algoritmo pseudocodigoEjercicio12
	altura = 0
	contadorHombres = 0
	alturaTotalHombres = 0
	contadorPersonas = 0
	edadTotal = 0
	contadorMujeres = 0
	alturaTotalMujeres = 0
	Mientras altura>=0 Hacer
		Escribir "Ingrese altura: "
		Leer altura
		Si altura >= 0 Entonces
			Escribir "Ingrese edad: "
			Leer edad
			Escribir "Ingrese un numero dependiendo de su sexo: 1 = masculino o 2 = femenino: "
			Leer sexo
			si sexo == 1 Entonces
				contadorHombres=contadorHombres+1
				alturaTotalHombres=alturaTotalHombres+altura
			SiNo
				contadorMujeres=contadorMujeres+1
				alturaTotalMujeres=alturaTotalMujeres+altura
				
			FinSi
			contadorPersonas=contadorPersonas+1
			edadTotal=edadTotal+edad
			
		Fin Si
		
	Fin Mientras
	Escribir ""
	Escribir "El promedio de altura de las mujeres es: ",alturaTotalMujeres/contadorMujeres
	Escribir "El promedio de altura de los varones es: ",alturaTotalHombres/contadorHombres
	Escribir "Promedio edad de los participantes: ",edadTotal/contadorPersonas
	
FinAlgoritmo
