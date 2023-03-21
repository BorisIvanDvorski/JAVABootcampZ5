import java.time.Year;

public class Student{
    private String name;
    private String surname;
    private int yearOfStudy;
    private String indexNum;
    public Student(String name, String surname, int yearOfStudy, String indexNum) {
        setName(name);
        setSurname(surname);
        setYearOfStudy(yearOfStudy);
        setIndexNum(indexNum);
    }
    public int getYearOfStudy() {
        return yearOfStudy;
    }
    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getSurname(){
        return surname;
    }
    public void setSurname(String surname){
        this.surname=surname;
    }
    public String getIndexNum(){
        return indexNum;
    }
    public void setIndexNum(String indexNum){
        this.indexNum=indexNum;
    }
    @Override
    public String toString() {
        return name+" "+surname;
    }
}