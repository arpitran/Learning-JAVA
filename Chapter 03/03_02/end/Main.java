public class Main {

    public static void main(String[] args) {
        String firstName = "Shelly";
        String lastName = "Parker";

        String name = firstName + " " + lastName;

        System.out.println(name);
        System.out.println(firstName);
        System.out.println(lastName);

        String concatName = (firstName.concat(" ")).concat(lastName);
        System.out.println(concatName);

        StringBuilder stringBuilder = new StringBuilder("abc");
        stringBuilder.append("def");
        stringBuilder.append("ghi");
        stringBuilder.append("jkl");
        stringBuilder.append("mno");
        stringBuilder.insert(9, "ALPHA");
        stringBuilder.delete(1, 3);
        String a = stringBuilder.toString();
        System.out.println(a);
    }
}
