public class sum_of_digits_usingmethods{
	static int sum_of_digit(int num) {
		int m,sum=0;
		while(num>0)
		{
			m=num%10;
			sum=sum+m;
			num=num/10;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int num_1=sum_of_digit(1234);
       int num_2=sum_of_digit(1837);
       int num_3=sum_of_digit(3748774);
       int num_4=sum_of_digit(74387437);
       System.out.println(" Sum of the digits is:"+num_1);
       System.out.println(" Sum of the digits is:"+num_2);
       System.out.println(" Sum of the digits is:"+num_3);
       System.out.println(" Sum of the digits is:"+num_4);
	}

}