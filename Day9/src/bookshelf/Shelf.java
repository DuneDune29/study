package bookshelf;

import java.util.ArrayList;

public class Shelf {

	protected ArrayList<String> shelf; 
	//�ڷḦ ������� ������ ArrayList ����
	public Shelf() { // ����Ʈ �����ڷ� ShelfŬ������ �����ϸ� ArrayList�� ������
		shelf = new ArrayList<String>();
	}

	public ArrayList<String> getShelf() {
		return shelf;
	}

	public int getCount() {
		return shelf.size();
	}
}