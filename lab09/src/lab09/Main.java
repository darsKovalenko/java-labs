package lab09;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception{

        Student[] students = new Student[7];

        try(BufferedReader fin = new BufferedReader(new FileReader("lab09.txt")))
        {
            String currentLine;
            int i = 0;
            try {
                while ((currentLine = fin.readLine()) != null) {
                    students[i] = create(currentLine);
                    i++;
                }
                for (Student student : students) {
                    student.printStudent();
                }
            }
            catch (MyException e){
                System.out.println(e.getMessage());
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }


        try(FileWriter fout = new FileWriter("lab09.txt")){
            try {
                for(int j = 0; j < students.length; j++) {
                    if (students[j].getRating() >= 7){
                        fout.write(students[j].getSurname().toUpperCase() + " ");
                        for(int k = 0; k < students[j].getMarks().length; k++){
                            fout.write(students[j].getMarks()[k] + " ");
                        }
                        fout.write('\n');
                    }
                    else{
                        fout.write(students[j].getSurname() + " ");
                        for(int k = 0; k < students[j].getMarks().length; k++){
                            fout.write(students[j].getMarks()[k] + " ");
                        }
                        fout.write('\n');
                    }
                }
            }
            catch (OutOfMemoryError oom){
                System.out.println("OutOfMemory Error appeared");
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }

    public static Student create(String line) throws MyException {
        if (line == null || line.isEmpty() || line.trim().isEmpty()) {
            throw new MyException("Строка пустая, студент не может быть создан");
        }
        else {
            return new Student(line);
        }
    }
}


