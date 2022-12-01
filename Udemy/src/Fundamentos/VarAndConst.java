package Fundamentos;

public class VarAndConst {

	public static void main(String[] args) {
		
		//Variavel Generica: (var).
		var a = 12;
		System.out.println(a);
		
		//Variaveis Numericas do tipo Inteiro: 
		// (byte, short, int, long).
		byte b = 120;
		System.out.println(b);
		short c = 1200;
		System.out.println(c);
		int d = 12000;
		System.out.println(d);
		long e = 120000L;
		System.out.println(e);
		
		//Variaveis Numericas do tipo Real:
		//(double, float)
		
		double f = 1234.4321;
		System.out.println(f);
		float g = 12345.543210F;
		System.out.println(g);
		
		//Variavel condicional: (boolean)
		boolean h = true;//false
		System.out.println(h);
		
		//Variavel caracter: (char)
		char i = 'i';
		System.out.println(i);
		
		//Variavel tipo texto: (String)
		String j = "oi";
		System.out.println(j);
		
		//Constante: (final + tipo de variavel)
		final double pi = 3.14159;
		System.out.println(pi);

	}

}
