package shiyan6_1;

public class Rational implements Comparable<Rational>{
	private int numerator;//分子
	private int denominator;//分母
	public Rational(int numerator,int denominator) throws IllegalRationalException {
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
	public int compareTo(Rational o) {//对象大于指定对象使返回1，等于返回0，小于返回-1
		// TODO Auto-generated method stub
		if(numerator==o.numerator) {
			if(denominator<o.denominator) {
				return 1;
			}
			else if(denominator==o.denominator){
				return 0;
			}
			else {
				return -1;
			}
		}
		else if(denominator==o.denominator) {
			if(numerator>o.numerator) {
				return 1;
			}
			else if(numerator==o.numerator){
				return 0;
			}
			else {
				return -1;
			}
		}
		else {
			if(numerator*o.denominator>o.numerator*denominator) {
				return 1;
			}
			else if(numerator*o.denominator==o.numerator*denominator){
				return 0;
			}
			else {
				return -1;
			}
		}
	}
}