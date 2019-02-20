package Pwrenato;

import java.text.DecimalFormat;

public class FuncoesGenericas {
	
	public static String maskDinheiro(Double vr) {
		
		DecimalFormat decimalFormat = new DecimalFormat("0.##");
		
		return "R$"+decimalFormat.format(vr);
	}
	
	
	
}
