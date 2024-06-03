package Iterator;
 
import java.util.Iterator;
  
public class DinerMenuIterator implements Iterator<MenuItem> {
	MenuItem[] list;
	int position = 0;
 
	public DinerMenuIterator(MenuItem[] list) {
		this.list = list;
	}
 
	public MenuItem next() {
		MenuItem menuItem = list[position];
		position = position + 1;
		return menuItem;
	}
 
	public boolean hasNext() {
		if (position >= list.length || list[position] == null) {
			return false;
		} else {
			return true;
		}
	}

	public void remove() {
		if (position <= 0) {
			throw new IllegalStateException
				("next()를 하나 이상 수행하기 전 항목을 제거할 수 없습니다.");
		}
		if (list[position-1] != null) {
			for (int i = position-1; i < (list.length-1); i++) {
				list[i] = list[i+1];
			}
			list[list.length-1] = null;
		}
	}

}
