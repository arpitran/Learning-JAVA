public class Main {

    public static void main(String[] args) {
        String literal = "hello";
        String obj = new String("hello");
        String otherLiteral = "hello";
        String otherObj = new String("hello");

        // literal --> "hello"
        // otherLiteral --^

        // obj --> "hello"
        // otherObj --> "hello"

        System.out.println(literal == obj);
        System.out.println(literal == otherLiteral);
        System.out.println(literal.equals(obj));
        System.out.println(literal.equals(otherLiteral));

        System.out.println();

        System.out.println(obj == otherObj);
        System.out.println(obj.equals(otherObj));
    }
}
