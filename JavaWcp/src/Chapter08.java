
public class Chapter08 {
	public static void main(String[] args) {
//		1.while文
		int num = 1;
		while (num < 5) {
			System.out.println(num * num);
			num++;
		}

//		2.for文
		int array[] = { 1, 4, 14, 25 };
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

//		3.拡張for文
		for (int val : array) {
			if (val % 2 == 0) {
				continue;
			}
			System.out.println(val);
		}
	}
}
