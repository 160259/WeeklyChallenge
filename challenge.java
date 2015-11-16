public class challenge {

	public static void pattern1(int n) {
		int k=1;
		while (k <= n) {
			for (int i=0; i<k; i++) {
				System.out.print("*");
			}
			System.out.println("");
			k++;
		}
		System.out.println();
		System.out.println();
	}

	public static void pattern2(int n){
		for (int i=0; i<2; i++) {
			String asterisk = "*";
			int nn = n-1;
			while (nn >= 0) {
				String str1 = "";
				for (int x=0; x<nn; x++) {
					str1 += " ";
				}
				str1 += asterisk;
				System.out.println(str1);
				asterisk += "**";
				nn--;
			}
			System.out.println();
			System.out.println();
		}

	}
	
	public static void pattern3(int n) {
		String asterisk = "*";
		int nn = n-1;
		while (nn >= 0) {
			String str1 = "";
			for (int x=0; x<nn; x++) {
				str1 += " ";
			}
			str1 += asterisk;
			System.out.println(str1);
			asterisk += "A*";
			nn--;
		}
	}

	public static void main(String[] args) {
		pattern1(5);
		pattern2(5);
		pattern3(4);
	}

}

/*
-----
x = 1
while x <= 5
print (    x    )



   *
  ***
 *****
*******

5 lines

4 spaces + 1 asterisk
3 spaces + 3 asterisks
2 spaces + 5 asterisks
1 spaces + 7 asterisks
0 spaces + 9 asterisks
 */         