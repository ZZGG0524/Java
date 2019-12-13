package shiyan6_1;

import java.util.Comparator;

public class InverseComparator implements Comparator<Rational>{
	private int numerator;
	private int denominator;
	public InverseComparator(int numerator,int denominator) throws IllegalRationalException {
		if(numerator==0&&denominator==0) {
			throw new IllegalRationalException();
		}
		this.numerator=numerator;
		this.denominator=denominator;
	}
	public int GetNumerator() {
		return numerator;
	}
	public int GetDenominator() {
		return denominator;
	}
	@Override
	public int compare(Rational o1, Rational o2) {
		// TODO Auto-generated method stub
		if(o1.compareTo(o2)==1) {
			return -1;
		}
		else if(o1.compareTo(o2)==0){
			return 0;
		}
		else {
			return 1;
		}
	}
}
