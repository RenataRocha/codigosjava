package codigosjava1;

public class operadoresunarios {

	public static void main(String[] args) {
	
		//incremento e decremento
		
		int a=0;
		int b=a++; //incr depois de atribuir
		int c =++a; //antes de atribuir
	    b = a--;  // decr depois de atribuir
	    c= --a;   //decr antes de atrinuir
	    
	    
	    
	    //mais ou menos
	    
	    int x= +3; //x recebe positivo 3
	    x= -x; //x recebe -3
	    
	    //inversao de bits
	    
	    int i= ~l; // i= -2 (os bits foram invertidos)
	    
	    //complementar booleano
	    
	    boolean falsidade = ! (true); //inverte o valor booleano
	    
	    //conversao de tipos
	    
	    double d= 1.00;
	    int i=(int) d; //converte double para int
	    
	    
	    //multiplicação e divisão
	    
	    int um =3/2;
	    float umemeio = (float) 3/2;
	    double xyz = umEmeio  * um;
	    
	    
	    //modulo
	    
	    int resto= 7 %2;
	    
	    //ad e sub
	    
	    long l= 1000+4000;
	    double d = 1.0 - 0.01;
	    
	    //Concatenação
	    long var = 12345;
	    String str = "O valor de var é" +var;
	    
	    //na concatenação de strings variaveis ou literais são promovidos a string antes
	    
	   String srt = "O valor de var é"+Long.toString(var); 

	}

}
