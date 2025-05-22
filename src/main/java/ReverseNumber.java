
public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int rev=0;
		int num=5764;
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println(rev);
		
		
		int m=9896;
		StringBuffer sb=new StringBuffer(String.valueOf(m));
		StringBuffer s=sb.reverse();
		System.out.println(s);
		
		StringBuilder sb1=new StringBuilder(String.valueOf(m));
		StringBuilder v=sb1.reverse();
		System.out.println(v);
		
		
	}

}
