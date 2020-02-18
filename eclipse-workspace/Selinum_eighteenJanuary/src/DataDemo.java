import java.util.Date;

public class DataDemo {
	public static void main(String[] args) {
//		String a="20";
//		String b="10";
//		System.out.println(Integer.parseInt(a)+Integer.parseInt(b));
		
		
		Date d= new Date();
		System.out.println(d);
		
		String d1 ="15/03/2011";
				System.out.println(d1.split("/").length);
				for (int i=0;i<d1.split("/").length;i++) {
					System.out.println(d1.split("/")[i]);
				}
				String year=d1.split("/")[2];System.out.println(year);
				String month=d1.split("/")[1];System.out.println(month);
				String day=d1.split("/")[0];System.out.println(day);
		
		
		
	}

}
