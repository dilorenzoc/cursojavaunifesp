package aula5;

public class bsk {
 public double a,b,c;
 
 private double CalcularDelta ()
 {
	 double delta=Math.pow(b, 2)-4*a*c;
	 return delta;
 }
  public double CalcularPositivo() 
  {
	  double x=(-b+Math.sqrt(CalcularDelta()))/2;
	  return x;
  }
  
  public double CalcularNegativo() 
  {
	  double x=(-b-Math.sqrt(CalcularDelta()))/2;
	  return x;
  }
}
