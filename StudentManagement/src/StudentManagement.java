import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;



public class StudentManagement {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>(); // explicit type argument to avoid old-compiler issues

        // Pre-added students
        students.add(new Student("Anu", 1, 100));
        students.add(new Student("Anju", 2, 78));
        students.add(new Student("Minnu", 3, 89));

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n------ Student Management System ------");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Delete Student");
            System.out.println("4. Find Student by Name");
            System.out.println("5. Edit Student");
            System.out.println("6. Find Student by Roll No");
            System.out.println("7. Exit");
            System.out.print("Enter Your Choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: // Add
                    System.out.print("Enter Name: ");
                    String name = sc.next();
                    System.out.print("Enter Roll No: ");
                    int rollNo = sc.nextInt();
                    System.out.print("Enter Marks: ");
                    int marks = sc.nextInt();
                    students.add(new Student(name, rollNo, marks));
                    System.out.println("✅ Student Added!");
                    break;

                case 2: // View
                    System.out.println("---- Student List ----");
                    for (Student s : students) {
                        System.out.println(s);
                    }
                    break;

                case 3: // Delete using Iterator (safe)
                    System.out.print("Enter Roll No to Delete: ");
                    int delRoll = sc.nextInt();

                    Iterator<Student> it = students.iterator(); // <- use your list variable
                    boolean removed = false;
                    while (it.hasNext()) {
                        Student s = it.next();
                        if (s.getRollNo() == delRoll) {
                            it.remove(); // safe removal while iterating
                            removed = true;
                            System.out.println("✅ Student Deleted.");
                            break; // remove only first match; remove break if you want all duplicates removed
                        }
                    }
                    if (!removed) {
                        System.out.println("⚠️ Student with roll no " + delRoll + " not found.");
                    }
                    break;

                case 4: // Find by Name
                    System.out.print("Enter Name to Find: ");
                    String findName = sc.next();
                    boolean foundName = false;
                    for (Student s : students) {
                        if (s.name.equalsIgnoreCase(findName)) {
                            System.out.println("Found: " + s);
                            foundName = true;
                        }
                    }
                    if (!foundName) System.out.println("⚠️ No student with that name found.");
                    break;

                case 5: // Edit
                    System.out.print("Enter Roll No to Edit: ");
                    int editRoll = sc.nextInt();
                    boolean edited = false;
                    for (Student s : students) {
                        if (s.getRollNo() == editRoll) {
                            System.out.print("Enter New Name: ");
                            s.name = sc.next();
                            System.out.print("Enter New Marks: ");
                            s.marks = sc.nextInt();
                            System.out.println("✅ Student Updated!");
                            edited = true;
                            break;
                        }
                    }
                    if (!edited) System.out.println("⚠️ Student not found.");
                    break;

                case 6: // Find by Roll No
                    System.out.print("Enter Roll No to Find: ");
                    int findRoll = sc.nextInt();
                    boolean foundRoll = false;
                    for (Student s : students) {
                        if (s.getRollNo() == findRoll) {
                            System.out.println("Found: " + s);
                            foundRoll = true;
                        }
                    }
                    if (!foundRoll) System.out.println("⚠️ Student not found.");
                    break;

                case 7:
                    System.out.println("👋 Exiting... Thank You!");
                    break;

                default:
                    System.out.println("❌ Invalid Choice! Try Again.");
            }
        } while (choice != 7);

        sc.close();
    }
}
class Student {
    String name;
    int rollNo;
    int marks;

    public Student(String name, int rollNo, int marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Roll No: " + rollNo + ", Marks: " + marks;
    }

    public int getRollNo() {
        return rollNo;
    }
}

