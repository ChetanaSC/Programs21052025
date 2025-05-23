
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String z="chetana";
		String rev="";
		for(int i=z.length()-1;i>=0;i--)
		{
			rev=rev+z.charAt(i);
		}
		System.out.println(rev);
		
		String n="Jashrita";
		StringBuilder sb=new StringBuilder(String.valueOf(n));
		StringBuilder sb2=sb.reverse();
		System.out.println(sb2);
		
		StringBuffer sb3=new StringBuffer(String.valueOf(n));
		StringBuffer sb4=sb3.reverse();
		System.out.println(sb4);
	}

}
