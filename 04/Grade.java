/** 
* write a program to calculate average grade.
* @author: Moe Salaam
* @version: 9/23/19
*
*/




public class Grade {

/**
* creates instances to use in program.
*
*/


//private instances
   private double exam1 = 0;
   private double exam2 = 0;
   private double finalExam = 0;
   private double activityAvg = 0;
   private double quizAvg = 0;
   private double projectAvg = 0;
   private String studentName;
/**
* create public instances that the program will use.
*
*/

//public instances
   public static final int EXAM_1 = 1, EXAM_2 = 2, FINAL = 3;
   private static final double EXAM_WEIGHT = 0.15,
               FINAL_WEIGHT = 0.30, ACT_WEIGHT = 0.05,
               QUIZ_WEIGHT = 0.10, PROJ_WEIGHT = 0.25;
               
/**
 * create constructor class to use for program.
 * @param studentNameIn use to input student name in.
 *
 */
               
// constructor class
   public Grade(String studentNameIn) {
   
      studentName = studentNameIn;
    
   }
   
   /**
   * create a method to set lab averages to use later.
   * @param activityAvgIn to use later for grade
   * @param quizAvgIn to use for grade
   *
   */
   

   public void setLabAverages(double activityAvgIn, double quizAvgIn) {
     
      activityAvg = activityAvgIn;
      quizAvg = quizAvgIn;
   
   }  
   
   /**
   * create a method to set project avg to use later. 
   * @param projectAvgIn to use later for grade
   *
   */
   
   public void setProjectAvg(double projectAvgIn) {
      
      projectAvg = projectAvgIn;
   
   }

/** 
* create a method to set exam scores to be able to calculat later.
* @param examType to use later for grade
* @param examScoreIn to use later for grade
*/

   public void setExamScore(int examType, double examScoreIn) {
   
      if (examType == EXAM_1) {
         exam1 = examScoreIn;
      }
      else if (examType == EXAM_2) {
         exam2 = examScoreIn;
      }
      else if (examType == FINAL) {
         finalExam = examScoreIn;
      }
         
   }
/** 
* create a method to calculate grade after input.
* @return returns grade that was calculated
*
*/

   public double calculateGrade() {
   
      double  grade = exam1 * EXAM_WEIGHT + exam2 * EXAM_WEIGHT 
              + finalExam * FINAL_WEIGHT 
              + activityAvg * ACT_WEIGHT
              + quizAvg * QUIZ_WEIGHT
              + projectAvg * PROJ_WEIGHT;
           
      return grade;
   
   }

/**
* create a method to return a string output.
* @return output of information
* 
*/

   public String toString() {
   
      return "Name: " + studentName + "\n" 
         + "Course Grade: " + calculateGrade();
            
   }




}
