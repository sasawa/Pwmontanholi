package Pwrenato;

public class Pessoa {
	public String nome;
	public int idade;
	
	public String showVelhice() {
		
		if(idade < 10)
			return "Criança";
		if(idade < 18)
			return "Adolescente";
		if(idade < 45)
			return "Adulto";
		
		return "Velho";
	}
	public String[] getNameComponents() {
		String[] components = nome.split(" ");
		return components;
	}
}
