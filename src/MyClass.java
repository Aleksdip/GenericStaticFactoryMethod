public class MyClass <T> {
    T value;

    public MyClass(T value) {
        this.value = value;
    }
    public static <T> MyClass<T> factoryMethod(T value) {
        return new MyClass<T>(value);
    }
    @Override
    public String toString () {
       return "MyClass " + value;
    }

}
