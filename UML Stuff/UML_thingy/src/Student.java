// Passage: College Office collects semester fee and college bus fee for each student. A clerk at the college office collects the fees from each student. The bus fee is calculated depending on the distance of the corresponding bus stop from the college. The semester fee varies depending upon the semester as well as branch of each student. Students are supposed to pay the fees in full. Economically backward students are eligible for 50% discount in semester fee. The consolidated fees receipt is issued to each student by the clerk, which contains the student name, admission number, semester and branch of student along with details of fees collected. Students can log in and view the details of fees remitted and dues if any. The system allows students and clerk level login to the system. Clerk is able to view reports of each class showing status of fees payment of each student.


public class Student{
    String name;
    int admno;
    String branch;
    String semester;
    int distance;
    int busfee;
    Boolean ecoBack;

    void calcBusFee(){
        this.busfee = this.distance * 10;
    }

    void getFeeReceipt() {
        
    }

}