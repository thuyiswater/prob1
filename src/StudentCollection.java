public class StudentCollection {
    Student[] students;
    int size = 0;
    int MAX_SIZE = 100;

    public StudentCollection() {
        students = new Student[MAX_SIZE];
    }


    public void addStudent(Student std) {
        for(int i = 0; i < size; i++) {
            if(students[i].id.equals(std.id)) return;
        }

        students[size] = std;
        size++;
    }

    public Student searchByName(String name) {
        for(int i =0; i< size; i++) {
            if(students[i].name.contains(name)) return students[i];
        }

        return null;
    }

    public int rankStudent(String sID) {
        Student std = null;
        for(int i = 0; i < size; i++) {
            if(students[i].id.equals(sID)) {
                std = students[i];
            }
        }
        if(std == null) return -1;

        int count = 0;
        double thisGPA = std.gpa;
        for(int i = 0; i < size; i++) {
            if(thisGPA - students[i].gpa < 0) count++;
        }
        return count + 1;
    }

    public void print() {
        for(int i = 0; i < size; i++) {
            System.out.println("id: " + students[i].id + ", name: " + students[i].name +
                    ", gpa: " + students[i].gpa);
        }
    }
}
