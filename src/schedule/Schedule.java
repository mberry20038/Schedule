/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schedule;

/**
 *
 * @author 20038
 */
public class Schedule {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    String firstName = "Michael";
    String lastName = "Berry";
    int year = 2020;
    
    System.out.println("My name is " + firstName + " " + lastName +" and I will graduate in "+ year);
    
    String periodOne = "Honors Global Studies";
    String periodTwo = "AP Research";
    String periodThree = "AP Computer Science";
    String periodFour = "AP English Language";
    String periodFive = "AP Physics 1";
    String periodSix = "Honors Pre-Calculus";
    String periodSeven = "AP US History";
    
    String teacherOne = "Mr. Dugard";
    String teacherTwo = "Mr. Kumer";
    String teacherThree = "Mr. Larrubia";
    String teacherFour = "Mr. Crossman";
    String teacherFive = "Mr. Sanchez";
    String teacherSix = "Mr. Ortega";
    String teacherSeven = "Mr. Hermida";
    
    System.out.println("+-------------------------------------------------+");
    System.out.println("| 1 |      " + periodOne + " |  " + teacherOne + "  |"); 
    System.out.println("| 2 |      " + periodTwo + "           |  " + teacherTwo + "   |");
    System.out.println("| 3 |      " + periodThree + "   |  " + teacherThree + "|");
    System.out.println("| 4 |      " + periodFour + "   |  " + teacherFour + "|");
    System.out.println("| 5 |      " + periodFive + "          |  " + teacherFive + " |");
    System.out.println("| 6 |      " + periodSix + "   |  " + teacherSix + "  |");
    System.out.println("| 7 |      " + periodSeven + "         |  " + teacherSeven + " |");
    System.out.println("+-------------------------------------------------+");
    }
    
}
