// This Java code defines a class `Stud_Course` that extends the `Student` class. Within the
// `Stud_Course` class, there is a method `course()` that initializes an array of subjects and a 2D
// array of marks for each student in those subjects.
public class Stud_Course extends Student {
    void course()
    {// The code snippet you provided is initializing an array of subjects and a 2D array of marks for
    // each student in those subjects.
    
        String[] subjects = {"DevOps", "Machine Learning", "C#"};
        int[][] marks = {
            {50, 30, 60}, 
            {70, 45, 55}, 
            {35, 40, 50}  
        };

        // Assuming each row represents a student and each column represents a subject
       // The code snippet provided is a nested loop structure that iterates over a 2D array of marks
       // for each student in different subjects. Here's a breakdown of what it does:
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                if (marks[i][j] < 40) {
                    System.out.println("Student " + (i + 1) + " scored less than 40 in " + subjects[j]);
                }
            }     
        }
        }
   /**
    * The main function creates an instance of the Stud_Course class, calls the stud_det method, and
    * then calls the course method.
    * 
    * @param args The `args` parameter in the `main` method is an array of strings that can be used to
    * pass command line arguments when running the Java program. These arguments can be accessed within
    * the `main` method to provide input or configuration to the program.
    */
    public static void main(String args[])
    {
        Stud_Course sc = new Stud_Course();
        sc.stud_det();
        sc.course();
        
    }
}
        