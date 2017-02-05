package cn.com.DIH;

/*×Ö·û´®·Ö¸î
 * */
public class Split {
	public static void main(String[] args) {
		String str = "www-bai-du-com";
		String[] temp ;
		String dem = "-";
		temp = str.split(dem);
		
		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i]);
		}
		
		System.out.println("\n------------");
		
		for (String x : temp) {
			System.out.print(x.toUpperCase());
		}
	}
}
