public class StudentCollection {
    Student[] students;
    int size = 0;
    int MAX_SIZE = 100;

    public StudentCollection(Student[] students) {
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
}
