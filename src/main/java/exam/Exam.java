package exam;

public class Exam {
    private String discipline;
    private String date;
    private int timeInMinutes;

    private Teacher teacher;


    public Exam(String discipline, String date) {
        this.discipline = discipline;
        this.date = date;
        this.timeInMinutes = 90;
        this.teacher = new Teacher(
                "Ivan",
                "Ivanov",
                "user",
                "0000");
    }

    public String getDiscipline() {
        return discipline;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getTimeInMinutes() {
        return timeInMinutes;
    }

    public void setTimeInMinutes(int timeInMinutes) {
        this.timeInMinutes = timeInMinutes;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
