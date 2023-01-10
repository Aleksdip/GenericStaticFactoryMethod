public class Main {
    public static void main(String[] args) {
      MyClass <String> strClass = MyClass.factoryMethod("A");
        System.out.println(strClass);
        MyClass <Integer> intClass = MyClass.factoryMethod(1);
        System.out.println(intClass);
    }

}