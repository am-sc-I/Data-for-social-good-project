public class DayVal {
  private double opVal;
  private double clVal;
  private double lowVal;
  private String date;

  // Argument constrructor
  // No no-argument constructor due to never displaying a default value DayVal in program
  public DayVal (double opVal, double clVal, double lowVal, String date){
    this.opVal = opVal;
    this.clVal = clVal;
    this.lowVal = lowVal;
    this.date = date;
  }

//retrieve date from specific DayVall
public String getDate(){
  return date;
}
  
  /*Fully formatted toString method so that when a DayVal object is created
  *it can be displayed with little redundacy
  */
  
  public String toString(){
    return "Date: " + date + "\n" + "Opening Value: " + opVal + "\n" + "Closing Value: " + clVal + "\n" + "Lowest Value: " + lowVal; 
  }
}