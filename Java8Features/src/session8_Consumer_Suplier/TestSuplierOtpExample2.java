package session8_Consumer_Suplier;

import java.util.Date;
import java.util.function.Supplier;

public class TestSuplierOtpExample2 {
	public static Supplier<String> s;
	public static void main(String[] args) {
		//Supplier<Date> s = () -> new Date();
		s = () -> {
			String otp = "";
			for(int i=0; i<6;i++)
			{
				otp += (int)(Math.random()*10);
			}
			return otp;
		};
		
		System.out.println(s.get());
	}
}
