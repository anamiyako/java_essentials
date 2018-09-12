package src2.tareas;

import libs.Input;

public class InicialesFacil {
	public static void main(String args[])
	{
		String NombreCompleto;
		String [] Iniciales;
		System.out.println("Ingrese el nombre completo: ");
		NombreCompleto=Input.get_string();
		if (NombreCompleto != null) {
			Iniciales=NombreCompleto.split(" ");
			System.out.print("Las iniciales son: ");
			for (int i=0; i<Iniciales.length;i++){
				System.out.print(Iniciales[i].charAt(0));
			}
		}		
	}
}
