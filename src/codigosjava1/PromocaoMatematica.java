package codigosjava1;

public class PromocaoMatematica {
	public static void main(String[] args){
		double d= 100.99;
		int i=100;
		//aqui ocorre a promo��o matem�tica
		//i � convertido para double e ent�o multiplicado
		d=d*i;
		//ao contrario � necessario informar o casting
		long x=12345;
		float pi=3.14f;
		x=x*(long)pi;
		//ou ent�o, conerte apenas o resultado
		x=(long)(x*pi);
		
	}

}
