package lab09;

public class Student {
    private String surname;
    private Integer[] marks = new Integer[5];
    private double rating;

    public Student(String line) {
        String[] student = line.split(" ");

        surname = student[0];
        for (int i = 0; i <student.length -1; i++){
            marks[i] = Integer.valueOf(student[i+1]);
        }
        for (int i = 0; i <marks.length; i++){
            rating += marks[i];
        }
        rating /= marks.length;
    }

    public String getSurname() {
        return surname;
    }

    public Integer[] getMarks() {
        return marks;
    }

    public double getRating() {
        return rating;
    }

    public void printStudent(){
        System.out.print(surname+": "+ rating+"\n");
    }
}
