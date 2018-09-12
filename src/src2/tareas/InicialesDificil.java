package src2.tareas;

import libs.Input;

public class InicialesDificil {
	public static void main(String args[])
	{
		String nombreCompleto;
		String [] iniciales;
		System.out.print("Ingrese el nombre completo: ");
		nombreCompleto=Input.get_string();
		if (nombreCompleto != null) {
			iniciales=nombreCompleto.split(" ");
			System.out.print("Las iniciales son: ");
			for (int i=0; i<iniciales.length;i++){	
				//if(Character.isAlphabetic(iniciales[i]))
				if (iniciales[i].length()>0)
					System.out.print(iniciales[i].charAt(0));
			}
		}		
	}
}
