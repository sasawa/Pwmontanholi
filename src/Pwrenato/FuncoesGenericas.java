package Pwrenato;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class FuncoesGenericas {
	
	public static String maskDinheiro(Double vr) {
		
		DecimalFormat decimalFormat = new DecimalFormat("0.##");
		
		return "R$"+decimalFormat.format(vr);
	}
	public static Double formatDecimal(Double vr) {
		
		BigDecimal numberBigDecimal = new BigDecimal(vr);
		numberBigDecimal  = numberBigDecimal .setScale(2, BigDecimal.ROUND_HALF_UP);
		
		return Double.parseDouble(numberBigDecimal+"");
	}
	
	
	
}
