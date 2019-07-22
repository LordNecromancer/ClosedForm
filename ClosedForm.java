import java.util.Scanner;

public class ClosedForm {
	
	public static void main(String[]args) {
		Scanner scanner=new Scanner(System.in);
		String str=scanner.nextLine();
		int a0=scanner.nextInt();
		int a1=scanner.nextInt();

		closedForm(a0,a1,str);
	}
	public static String closedForm(int a0,int a1,String str) {
		String result="";
		
		int equalSign=str.indexOf('=');
		str=str.substring(equalSign+1,str.length());
		double firstCoef=-1*Double.valueOf(str.substring(0,str.indexOf("x")));
		str=str.substring(str.indexOf(")")+1,str.length());
		double secondCoef=-1*Double.valueOf(str.substring(0,str.indexOf("x")));
		
		double c1=((firstCoef*-1)+Math.sqrt((firstCoef*firstCoef)-4*(secondCoef)))/2;
		double c2=((firstCoef*-1)-Math.sqrt((firstCoef*firstCoef)-4*(secondCoef)))/2;
		
		double s=(a0*c2-a1)/(c2-c1);
		double t=(a1-a0*c1)/(c2-c1);
		System.out.println(s+"*"+c1+"^(n)"+" + "+t+"*"+c2+"^(n)");



		return result;
	}

}
