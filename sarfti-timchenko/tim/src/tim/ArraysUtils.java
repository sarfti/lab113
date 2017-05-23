package tim;

import java.util.Arrays;

public class ArraysUtils {

	public static void simpleSort() {
		int[] intArr = { 1, 4, 2, 6, 3 };
		String[] strArr = { "E", "B", "U", "O", "I" };

		// сортируем массив чисел
		Arrays.sort(intArr);
		// сортируем массив строк
		Arrays.sort(strArr);

		System.out.println(Arrays.toString(intArr));
		System.out.println(Arrays.toString(strArr));
	}

}
