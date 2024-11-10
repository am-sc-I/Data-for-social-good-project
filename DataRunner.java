import java.util.Scanner;

public class DataRunner {
  public static void main(String[] args) {

     UserStory testJ = new UserStory("openVal.txt", "closeVal.txt", "lowVal.txt", "dates.txt");

    Scanner input = new Scanner(System.in);

    System.out.println("Which date would you like to display? (Year-Month-Day, 0000-00-00)" + "\n" + "Dates between 1980-12-12 & 2020-04-01" );
    System.out.println ("Reply 'all' if you wish to to display all Appl stock day value");
    
    String userDate = input.nextLine();
    
    int found = 0;
    
    if (userDate.equals("all")){
    System.out.println(testJ);
    } else {
      for(int i = 0; i<testJ.getUDVlength(); i++){
        if (userDate.equals(testJ.getDVdate(i))){
          System.out.println("\n"+testJ.getDV(i));
          // will return if the specific date searched for has been found,
          // 0 = no, 1 = yes.
          found++;
        } 
      }
      if (found == 0){
      // error message if the date is not in the dataset
        System.out.println("\n"+"Sorry, can't find that date. It may not be in our database or it is the wrong date format");
      }
    }
   
    

    


    
    
    
  }
}