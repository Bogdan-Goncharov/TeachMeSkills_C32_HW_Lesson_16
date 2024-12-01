import model.Student;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ApplicationRunner {
        public static void main(String[] args) {
                Set<String> passportNumber = getStrings();
                Set<Student> students = new HashSet<>();
                students.add(new Student("Ilya"));
                students.add(new Student("Marina"));
                students.add(new Student("Sultan"));
                students.add(new Student("Dmitry V"));
                students.add(new Student("Dmitry H"));
                students.add(new Student("Igor"));
                students.add(new Student("Daniil"));
                students.add(new Student("Oleg"));
                students.add(new Student("Kirill R"));
                students.add(new Student("Rita"));
                students.add(new Student("Vlad"));
                students.add(new Student("Sergey"));
                students.add(new Student("Bogdan"));
                students.add(new Student("Kirill M"));
                Map<String, Student> passportToStudentMap = new HashMap<>();
                int index = 0;
                for (String passport : passportNumber) {
                        if (index < students.size()) {
                                passportToStudentMap.put(passport,
                                        (Student) students.toArray()[index]);
                                index++;
                        }
                }
                for (Map.Entry<String, Student> entry : passportToStudentMap.entrySet()) {
                        System.out.println("Passport number: " + entry.getKey() + ", Student: " + entry.getValue());
                }
        }

        private static Set<String> getStrings() {
                Set<String> passportNumber = new HashSet<>();
                passportNumber.add("AB1234567");
                passportNumber.add("CD2345678");
                passportNumber.add("EF3456789");
                passportNumber.add("GH4567890");
                passportNumber.add("IJ5678901");
                passportNumber.add("KL6789012");
                passportNumber.add("MN7890123");
                passportNumber.add("OP8901234");
                passportNumber.add("QR9012345");
                passportNumber.add("ST0123456");
                passportNumber.add("UV1234567");
                passportNumber.add("WX2345678");
                passportNumber.add("YZ3456789");
                passportNumber.add("AA4567890");
                passportNumber.add("BB5678901");
                passportNumber.add("CC6789012");
                return passportNumber;
        }
}








