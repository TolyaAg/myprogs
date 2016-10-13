package helpinstudy.com.numbers;

import java.util.ArrayList;
import java.util.List;

public class MainCLass {

	public static void main(String[] args) {
		int[] b = getNumbers(2000000);
		for (int n : b)
			System.out.println(n);
	}
	
	public static int[] getNumbers(int N) {
		int[] result = null;
        List<Integer> list = new ArrayList<>();
        for (int n = 1; n< N; n++){
            int sum = 0, temp, r;
            temp = n;
            int length = (int)(Math.log10(n)+1);
            while( temp != 0 )
            {
                for (int i = 0; i< length; i++) {
                    int prod = 1;
                    r = temp%10;
                    for(int j = 0; j< length; j++){
                        prod = prod *r;
                    }
                    sum = sum + prod;
                    temp = temp/10;
                }
            }
            if ( n == sum ){list.add(n);}
        }
        result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
