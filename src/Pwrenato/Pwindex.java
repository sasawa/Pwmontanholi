package Pwrenato;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Pwindex {
	
	static void ativ1() {
		Pessoa obj = new Pessoa();
		
		obj.idade = Integer.parseInt(JOptionPane.showInputDialog("Insira a idade"));
		
		JOptionPane.showMessageDialog(null, "A idade da pessoa "+obj.showVelhice(), "Titulo", 1);
		
	}
	static void ativ2() {
		Pessoa obj = new Pessoa();
		
		obj.nome = JOptionPane.showInputDialog("Insira o nome completo");
		String[] components = obj.getNameComponents();
		
		
		JOptionPane.showMessageDialog(null, components[0], "Primeiro nome", 1);
		JOptionPane.showMessageDialog(null, obj.nome.length()+" caracteres", "Numero de caracteres", 1);
		for (int i = 0; i < components.length; i++) {
			JOptionPane.showMessageDialog(null, components[i], "Componente do nome nr. " + (i + 1), 1);
		}
		
		
	}
	static void ativ3() {
		Produto obj = new Produto();
		
		obj.valor = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor"));

		obj.parcelas = Integer.parseInt(JOptionPane.showInputDialog("Insira o numero de parcelas"));
		
		
		JOptionPane.showMessageDialog(null, obj.showVrTotal(), "Valor total de pagamento", 1);
		
		
		
	}
	static void ativ4() {
		String frase;
		frase = JOptionPane.showInputDialog("Insira os numeros");
		
		JOptionPane.showMessageDialog(null, inverter(frase), "Numeros", 1);
	}
	static void ativ5() {
		String frase;
		frase = JOptionPane.showInputDialog("Insira os numeros");
		
		JOptionPane.showMessageDialog(null, ordenar(frase), "Numeros", 1);
	}
	static void ativ6() {
		Pessoa obj = new Pessoa();
		
		obj.sexo = JOptionPane.showInputDialog("Insira o sexo(F/M)");
		obj.altura = Double.parseDouble(JOptionPane.showInputDialog("Insira a altura(em metros)"));
		obj.peso = Double.parseDouble(JOptionPane.showInputDialog("Insira o peso(em kg)"));
		
		JOptionPane.showMessageDialog(null, "O IMC da pessoa é " 
				+ obj.calcImc() 
				+ " ("
				+ obj.nivelObesidade
				+ ")", "Primeiro nome", 1);
		
		
	}
	static String inverter(String entrada) {
		String[] numeros = entrada.split(",");
		String frase = "";
		
		for (int i = numeros.length-1; i >=0 ; i--) {
			frase = frase +(i==numeros.length-1? "": ",")+ numeros[i];
		}
		return frase;
	}
	static String ordenar(String entrada) {
		String[] numeros = entrada.split(",");
		int[] intNumbers = new int[numeros.length];
		String frase = "";
		
		for (int i = 0; i < numeros.length; i++) {
			intNumbers[i] = Integer.parseInt(numeros[i]);
		}
		Arrays.sort(intNumbers);
		for (int i = 0; i < intNumbers.length; i++) {
			frase = frase +(i==0? "": ",")+ intNumbers[i];
		}
	
		return frase;
	}

	public static void main(String[] args) {
		while (true){
			switch (Integer.parseInt(JOptionPane.showInputDialog("Escolha Atividade(0 para sair)"))) {
			case 1:
				ativ1();
				break;
			case 2:
				ativ2();
				break;
			case 3:
				ativ3();
				break;
			case 4:
				ativ4();
				break;
			case 5:
				ativ5();
				break;
			case 6:
				ativ6();
				break;

			default:
				JOptionPane.showMessageDialog(null, "Obrigado por avaliar nóis, DEUS É TOP", 
						"Valeu meu bom", 1);
				return;
			}
			
		}
		
		
		
		

	}

}
