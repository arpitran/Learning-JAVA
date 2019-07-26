import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        // Create a Linked List
        LinkedList<String> students = new LinkedList<>();

        // Add students to Linked List
        students.add("Charlie");
        students.add("Sally");
        students.add("Morgan");
        students.add("Taylor");
        students.add("Jamie");

        students.addFirst("Sarah");
        students.addLast("Hailey");
        students.add(2, "Tara");

        String firstStudent = students.getFirst();
        System.out.println("First " + firstStudent);
        String lastStudent = students.getLast();
        System.out.println("Last " + lastStudent);
        System.out.println(students.size());
        System.out.println(students);

        String secondStudent = students.get(1);
        System.out.println("Second " + secondStudent);

        int i = students.indexOf("Morgan");
        System.out.println("Index of Morgan " + i);

        students.removeFirst();
        students.removeLast();
        students.remove("Jamie");
        students.remove(1);
        System.out.println(students);

        boolean hasTaylor = students.contains("Taylor");
        System.out.println(hasTaylor);

        students.clear();
        System.out.println(students);
    }
}
