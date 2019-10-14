package com.exercise5Switch.app;

import java.util.Scanner;


public class Switchstatemain 
{
	public static void main (String[] args)
	{
		//Declaracion de constantes
		
		//Declaracion de variables}
		int nMes=0;
		
		
		//Contruccion de objetos (Object construction)
		
		Scanner input = new Scanner(System.in);
		//Validacion de los datos de entrada (Imput data validation
		while (nMes<=0);
		
		{
			System.out.println("Dame un número de mes: ");
			nMes = input.nextInt();
		
			if(nMes<=0)
		{
				System.out.println("Dato NO válido!!");
		
		
		}
	    }
		switch(nMes)
		{
		case 1: System.out.println("Enero");
		break;
		case 2: System.out.println("Febrero");
		break;
		case 3: System.out.println("Marzo");
		break;
		case 4 : System.out.println("Abril");
		break;
		case 5: System.out.println("Mayo");
		break;
		case 6: System.out.println("Junio");
		break;
		case 7: System.out.println("Julio");
		break;
		case 8: System.out.println("Agosto");
		break;
		case 9: System.out.println("Septiembre");
		break;
		case 10: System.out.println("Octubre");
		break;
		case 11: System.out.println("Noviembre");
		break;
		case 12: System.out.println("Diciembre");
		break;
		default: System.out.println("Numero no valido");
		break;
		
		
		}
	}

}
