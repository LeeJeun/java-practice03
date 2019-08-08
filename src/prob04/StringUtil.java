package prob04;

public class StringUtil {
	
	public static String concatenate(String[] str) {
		String resultStr="";
		
		for(int i=0; i<=str.length-1; i++) {
			resultStr += str[i];
		}
		return resultStr;
	}

}
