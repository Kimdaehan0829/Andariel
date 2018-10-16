package langStudy;

import java.util.ArrayList;
import java.util.List;

public class ArrayListIndex {

	public static void main(String[] args) {
		List<Character> list = new ArrayList<>();
		list.add('1');
		list.add('2');
		list.add('3');
		
		list.remove(new Character('2'));

		System.out.println(list);
	}
}
