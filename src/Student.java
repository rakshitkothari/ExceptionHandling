import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Student extends Exception {
    private String name;
    private int age;
    private int marks;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter student's name: ");
        String name = reader.readLine();
        System.out.print("Enter student's age: ");
        int age = Integer.parseInt(reader.readLine());
        System.out.print("Enter student's marks: ");
        int marks = Integer.parseInt(reader.readLine());

        try {
            if (age < 0) {
                throw new Exception("Exception : Age cannot be negative ");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}




