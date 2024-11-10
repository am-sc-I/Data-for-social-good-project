import java.util.Scanner;

public class UserStory {

private DayVal[] UserDayVal;

  // Creates an object with every single Day value (for the output all option)
  public UserStory(String openFile, String closeFile, String lowFile, String dateFile){
    UserDayVal = createDV(openFile, closeFile, lowFile, dateFile);
  }

  /*Actual method which creates/outputs all of the day values in an array
  *creates 1d arrays which represent each .txt file being used
  */
public DayVal[] createDV(String openFile, String closeFile, String lowFile, String dateFile){
double[] open = FileReader.toDoubleArray(openFile);
double[] close = FileReader.toDoubleArray(closeFile);
double[] low = FileReader.toDoubleArray(lowFile);
String[] dates = FileReader.toStringArray(dateFile);

  DayVal[] tempDayVal = new DayVal[dates.length];

  for (int i = 0; i < tempDayVal.length; i++){
    tempDayVal[i] = new DayVal(open[i], close[i], low[i], dates[i]);
  }
  return tempDayVal;
}
  // returns the length of the DayVal array

public int getUDVlength(){
  return UserDayVal.length;
}

  //returns a single DayVal at a given index
  
  public DayVal getDV(int index){
    return UserDayVal[index];
  }

  // returns the date assigned to s specific Day Value at a given index
  public String getDVdate(int index){
    return UserDayVal[index].getDate();
  }

  //Functions for the return all. Uses advanced for-loop to add each item to the Results variable
 
public String toString(){
 String result = "";
  for (DayVal testJe : UserDayVal){
    result += "\n" + testJe;
  }
  
  return result;
}
  
}