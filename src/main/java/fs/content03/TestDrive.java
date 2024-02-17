package fs.content03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestDrive {

	public static void main(String[] args) {

		List<Book> bookList = new ArrayList<>();

		bookList.add(new Book("Shibumi", 500));
		bookList.add(new Book("Otomatik Portakal", 200));
		bookList.add(new Book("Berlin", 285));
		bookList.add(new Book("Anna Kar", 150));

		Collections.sort(bookList);

		System.out.println("Sıralama1");
		for (Book kitap : bookList) {
			System.out.println(kitap.toString());
		}

		// Sıralama 2
		System.out.println("Sıralama2");
		BookNameComparator nameComparator = new BookNameComparator();

		Collections.sort(bookList, nameComparator);
		for (Book kitap : bookList) {
			System.out.println(kitap.toString());
		}

	}
}
