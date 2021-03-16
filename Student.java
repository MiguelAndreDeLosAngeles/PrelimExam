class Student {
   private String ID;
   private int numberOfCredits;
   private int points;
   private double gradePoint;

   public Student() {
   }

   // constructor to initialize the values
   public Student(String aID, int aNumberOfCredits, int aPoints) {
       super();
       ID = aID;
       numberOfCredits = aNumberOfCredits;
       points = aPoints;
       calculateGradePoint();
   }

   // getters and setters
   public String getID() {
       return ID;
   }

   public void setID(String aID) {
       ID = aID;
   }

   public int getNumberOfCredits() {
       return numberOfCredits;
   }

   public void setNumberOfCredits(int aNumberOfCredits) {
       numberOfCredits = aNumberOfCredits;
   }

   public int getPoints() {
       return points;
   }

   public void setPoints(int aPoints) {
       points = aPoints;
   }

   // to return object in String representation form
   @Override
   public String toString() {
       return "ID : " + ID + " NumberOfCredits : " + numberOfCredits + " Points : " + points + " Grade Point : "
               + gradePoint;
   }

   // method to find gradePoint
   public void calculateGradePoint() {
       gradePoint = points / (double) numberOfCredits;
   }
}