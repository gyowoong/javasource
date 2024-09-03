package generics;

// 지네릭 클래스로 변경

public class Box2<T> {

    T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

}
