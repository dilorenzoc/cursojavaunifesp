package aula6;

public class IntervaloNumeros {
	public double num;
	
	public String CalculoIntervalo() 
	{
		if(num>0) {
			if (num <= 25)
				return ("O numero está contido no intervalo entre 0 e 25: ");
			else if (num <= 50)
				return ("O numero está contido no intervalo entre 25 e 50: ");
			else if (num <= 75)
				return ("O numero está contido no intervalo entre 50 e 75: ");
			else
				return ("O numero está contido no intervalo entre 75 e 100: ");
		}else
			return ("Fora de intervalo: ");
	
	}
}
