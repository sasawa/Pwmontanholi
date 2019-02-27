package Pwrenato;

import Generico.FuncoesGenericas;

public class Pessoa {
	public String nome;
	public int idade;
	public String sexo;
	public double altura;
	public double peso;
	public String nivelObesidade;
	
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
	
	public double calcImc() {
		double imc = 0;
		
		imc = FuncoesGenericas.formatDecimal(peso/(altura*altura));
		
		if(sexo.equals("M")) {
			if (imc <20.7) 
				nivelObesidade = "Abaixo do peso";
			else if(imc>=20.7 && imc <26.4) 
				nivelObesidade = "Peso normal";
			else if(imc>=26.4 && imc <27.8)
				nivelObesidade = "Marginalmente acima do peso";
			else if(imc>=27.8 && imc <31.1)
				nivelObesidade = "Acima do peso ideal";
			else
				nivelObesidade = "Obeso";
		} else {
			if (imc <19.1) 
				nivelObesidade = "Abaixo do peso";
			else if(imc>=19.1 && imc <25.8) 
				nivelObesidade = "Peso normal";
			else if(imc>=25.8 && imc <27.3)
				nivelObesidade = "Marginalmente acima do peso";
			else if(imc>=27.3 && imc <32.3)
				nivelObesidade = "Acima do peso ideal";
			else
				nivelObesidade = "Obeso";
		}
		
		return imc;
		
	}
	
}
