import java.util.ArrayList;

public class Record {
    private ArrayList<Student> studentList;
    public Record() {
        studentList = new ArrayList<Student>();
    }
    public void addStudent(Student student) {
        studentList.add(student);
    }
    public Student findStudent(String indexNum) {
        for (Student student : studentList) {
                if(student.getIndexNum().equals(indexNum)) {
                    return student;
                }
        }
        return null;
    }
    public void printAllStudents() {
        for (Student student : studentList) {
            System.out.println(student);
        }
    }
    public boolean checkIndexUnique(String indexNum){
        for (Student student : studentList){
            if(student.getIndexNum().equals(indexNum)){
                return false;
            }
        }
        return true;
    }
}