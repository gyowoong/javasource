package api;

// extends Object 기본
public class Value {
    int value;

    public Value(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {

        Value other = (Value) obj;
        if (value != other.value)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "" + value + "";
    }

}
