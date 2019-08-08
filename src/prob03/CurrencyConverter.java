package prob03;

public class CurrencyConverter {
	private static double rate;

	public static void setRate(double rate) {
		CurrencyConverter.rate = rate; //static이라 this가 아니라 클래스이름 붙여줘야함
	}

   public static double  toDollar(double won) {
      return won/rate;
   }
   public static double  toKRW(double dollar) {
      return dollar*rate;
   }


	
}
