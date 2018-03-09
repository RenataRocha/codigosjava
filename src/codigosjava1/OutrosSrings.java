package codigosjava1;

public class OutrosSrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Isto é uma String do java";
		
		//método split quebra strings 
		//pelo separador desejado
		
		String[] palavras = str.split("");
		
		
		int i =str.indexOf("ima"); //retorna o indice da palavra na string
		
		if(str.startsWith("Ola") || str.endsWith("Mundo!")){
			
			//testa o começo e o fim da string e retorna boolean
		}
		
		str = str.trim(); //elimina os espaços em branco no inicio e fim
		str = str.replace('a','@'); //substitui os caracteres
		
		
		//substitui uma palavra(usa expressoes regulares)
		str = str.replaceAll("String", "Cadeia de caracteres");
	}

}
