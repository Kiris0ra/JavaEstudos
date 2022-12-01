package Fundamentos;

public class DotNotation {

	public static void main(String[] args) {
		String s = "Bom dia Mundo";
		s = s.concat("!!");//Concatena com a String.
		System.out.println(s);
		s = s.replace("Mundo","Amigo");//Troca uma String por outra.
		System.out.println(s);
		s = s.toLowerCase();//Converte em letra minuscula.
		System.out.println(s);
		s = s.toUpperCase();//Converte em letra maiuscula.
		System.out.println(s);
		s = s.repeat(5);//Repete um determinado numero de vezes.
		System.out.println(s);
		// Entra varios outros ...
	

	}

}
