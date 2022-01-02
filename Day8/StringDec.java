package Day8;

public class StringDec {

static final int MAX_CHAR = 26;
	
	public static void main(String[] args) {

		sortString("geekstergivesusbestcoaching");
		
	}

	static void sortString(String str) {
		 
        int characters[] = new int[MAX_CHAR];
 
        for (char x : str.toCharArray()) {
        	characters[x - 'a']++;
        }
 
        for (int i = 0; i < MAX_CHAR; i++) {
            for (int j = 0; j <characters[i]; j++) {
                System.out.print((char) (i + 'a'));
            }
        }
	}

}
