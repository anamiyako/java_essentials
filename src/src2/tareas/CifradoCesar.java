package src2.tareas;

import libs.Input;

public class CifradoCesar {
	public static void main(String args[])
	{
		char[] arrayAbecedario = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		char[] palabraEncriptada;
		String palabraInicial;
		System.out.println("Ingrese la palabra inicial: ");
		palabraInicial=Input.get_string();
		int k=0;
		for (int i=0; i<palabraInicial.length();i++){
			//System.out.print(palabraInicial.charAt(i));
			for (int j=0; j<arrayAbecedario.length; j++){
				if (palabraInicial.charAt(i)==arrayAbecedario[j]){
					k=j+13;
					if (k>25){
						k=k-26;
					}
					System.out.print(arrayAbecedario[k]);
				}
			}			
		}
		
	}
}
