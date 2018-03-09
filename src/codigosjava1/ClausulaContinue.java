package codigosjava1;

public class ClausulaContinue {

	public static void main(String[] args) {
		char letras[] = {'B','X','R','S','I','L'};
		int i;
		for(i=0; i<letras.length; i++){
			if(letras[i]=='X'){
				continue;
				
			}
			System.out.println(letras[i]);
		}

	}

}
