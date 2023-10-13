public class Student <T> {
    T ID;
    T SureName;

    public Student() {
    }

    public Student(T ID, T sureName) {
        this.ID = ID;
        SureName = sureName;
    }

    public T getID() {
        return ID;
    }

    public void setID(T ID) {
        this.ID = ID;
    }

    public T getSureName() {
        return SureName;
    }

    public void setSureName(T sureName) {
        SureName = sureName;
    }

    @Override
    public String toString() {
        return "Student:" +
                "ID:" + ID +
                " SureName:" + SureName ;
    }
}
