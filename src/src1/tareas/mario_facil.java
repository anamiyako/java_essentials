package src1.tareas;

import libs.Input;

public class mario_facil {
	public static void main(String args[])
	{
		System.out.print("Digite la altura: ");
	    int altura = Input.get_int();
	    int altura1=altura+1;
	    
	    int i=1, j=1, k=1,t=0,e=1;
	    for (i=0; i<altura; i++){
	    	j=2+i;	    	
	    	t=altura1-j;
	    	for (e=0; e<t; e++)
	    		System.out.print(" ");
	    	for (k=0; k<j; k++){	    		
	    			System.out.print("#");	    			    			
	    	}
	    	System.out.print("\n");
	    }
	    //System.out.println("Cantidad de botellas es: " + (altura * 12) + "\n");      
	}
}
