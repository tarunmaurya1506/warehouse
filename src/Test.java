

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		int[] L1 = { 1, 2, 3, 4, 5 };
		int[] L2 = { 6, 7, 9, 8, 3 };

		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < L1.length; i++) {
			list.add(L1[i]);
		}
		for (int i = 0; i < L2.length; i++) {
			list.add(L2[i]);
		}

		Collections.sort(list);//
		
		L2 = new int[L1.length + L2.length];
		for (int i = 0; i < list.size(); i++) {
			L2[i] = list.get(i);
		}

		
		for (int i = 0; i < L2.length; i++) {
			System.out.println("L2[" + i + "]: " + L2[i]);
		}
	}
}
