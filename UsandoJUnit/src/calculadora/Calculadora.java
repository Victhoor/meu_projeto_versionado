package calculadora;

import java.lang.Math;

public class Calculadora {

	public Double soma(double d, double e) {
		return d + e;
	}

	public Double sub(double d, double e) {
		return d - e;
	}

	public Double mult(double d, double e) {
		return d * e;
	}

	public Double div(double d, double e) {
		return d / e;
	}

	public Double pot(double d, double e) {
		return Math.pow(d,e);
	}

}
