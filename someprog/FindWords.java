package helpinstudy.com.someprog;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class FindWords {
	
	public static List<Pair> result = new LinkedList<>();
	
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader = new BufferedReader(new FileReader(fileName));
        
        StringBuilder strBld = new StringBuilder();
        while(reader.ready()) {
        	strBld.append(" " + reader.readLine());
        }
        reader.close();
        
        String[] str = strBld.toString().split(" ");
        
        for(int i = 0; i < str.length; i++) {
        	StringBuilder s = new StringBuilder(str[i]);
        	StringBuilder find = new StringBuilder(s).reverse();
        	for(int y = i + 1; y < str.length; y++) {
        		if(str[y].equals(find.toString()) && !str[y].equals("") && !find.toString().equals("")) {
        			result.add(new Pair(s.toString(), str[y]));
        			str[i] = "";
        			str[y] = "";
        			break;
        		}
        	}
        }
        
        
        for(Pair p: result) {
        	System.out.println(p);
        }
        
    }

	public static class Pair {
        String first;
        String second;

        public Pair(String f, String s) {
        	first = f;
        	second = s;
        }
        
        @Override
        public String toString() {
            return  first == null && second == null ? "" :
                    first == null && second != null ? second :
                    second == null && first != null ? first :
                    first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }
    }
}
