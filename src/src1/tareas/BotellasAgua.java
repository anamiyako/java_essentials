package src1.tareas;

import libs.Input;

public class BotellasAgua {
	public static void main(String args[])
	{
		
		int minutos=0;
		try{						
			do{				
				System.out.print("Digite el tiempo (En minutos) en la ducha: ");
				minutos = Input.get_int();				
			}while(minutos<=0);			
			System.out.println("Cantidad de botellas es: " + (minutos * 12) + "\n");			
		}catch (NumberFormatException ex){
			System.out.println("Número no válido");
		}	          
	}
}
