package codigosjava1;

public class StringA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Isto é uma String do java";
		String xyz = new String("Isto é uma String do Java");
		
		if (str == xyz) System.out.println("Igual");
		else System.out.println("Diferente");
		
		if(str.equals(xyz)) {
			//MANEIRA CORRETA DE COMPARAR O CONTEUDO DAS STRINGS
			
		}
		
		System.out.println("Tamanho da String:" +str.length());
		System.out.println("Substring:" + str.substring(0,10));
		System.out.println("Caracter na posição 5:" + str.charAt(5));
		
		
	}

}
