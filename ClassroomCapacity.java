import java.util.Scanner;

public class ClassroomCapacity {
    public static void main(String[] args){

  // Declaring variables for classroom capacity percentage, Woodward state capacity,
  // the total number of floors in woodward, and the total number of classrooms.
  // Also user input variables for the number of floors, number of classrooms and classroom capacity.      

    double classroomCapacityPercentage;
    int woodwardStateCapacity = 0;
    int totalNumberOfFloors;
    int numberOfFloors;
    int floorCapacity = 0;
    int stateFloorCapacity = 0;
    int stateFloorTotal = 0;
    int numberOfClassrooms;
    int classroomCapacity;
    int totalClassrooms = 0;


  // Inputing a scanner object for user input

    Scanner scnr = new Scanner(System.in);


  // Prompts for the user to enter the percentage of the state classroom capacity
  // and the total number of floors in the building while prompting user for different answer if
  // they enter an invalid number

   System.out.println("Please enter state allowed classroom capacity percentage");
   classroomCapacityPercentage = scnr.nextDouble() / 100;

        while (classroomCapacityPercentage < 0){
            System.out.println("Please enter a number higher than 0");
            classroomCapacityPercentage = scnr.nextDouble() / 100;
        }

   System.out.println("");
   System.out.println("Please enter the total number of floors in the building");
   numberOfFloors = scnr.nextInt();
   totalNumberOfFloors = numberOfFloors;
   
  
   // While loop that will prompt user to enter a "correct" input for the number of floors
   
while (numberOfFloors < 1){
    System.out.println("Please enter a positve number");
    numberOfFloors = scnr.nextInt();
}

  // While loop that will run if the number of floors has a valid input
  // This loop will print out each floor number to then ask for the number
  // of classrooms on each floor

while (numberOfFloors >= 1){

    for (; numberOfFloors >= 1; numberOfFloors--){
        System.out.println("");
        System.out.println("Floor number " + numberOfFloors);
        System.out.println("Enter the number of classrooms on this floor");
        numberOfClassrooms = scnr.nextInt();

        // Calculation for the total number of classrooms in the building to increase as the code loops
        totalClassrooms = totalClassrooms + numberOfClassrooms;


        if (numberOfClassrooms < 2){
            System.out.println("Please enter a number higher than 2");
        }


        // This for loop will print out the normal class capacity of each classroom
        // and the state capacity of the classroom based on the state capacity percentage
        // entered by the user
        
        
        for (; numberOfClassrooms >= 1; numberOfClassrooms--){

            System.out.println("");
            System.out.println("Classroom " + numberOfClassrooms);
            System.out.println("Enter the student capacity of this classroom");
            classroomCapacity = scnr.nextInt();

            // Calculations for the total normal capacity of all classrooms on 1 floor and
            // calculation for the reduced floor capacity based on the state percentage

            floorCapacity = floorCapacity + classroomCapacity;
            stateFloorCapacity = stateFloorCapacity + (int)(classroomCapacity * classroomCapacityPercentage);

            
            // Print statements for each classroom to display the normal capacity and reduced
            // capacity 

            System.out.println("");
            System.out.println("The normal classroom capacity is: " + classroomCapacity);
            System.out.println("The state classroom capacity is: " + stateFloorCapacity);
            
            
            
            // Adding the total number of people allowed on the floor according to the state

            stateFloorTotal = stateFloorTotal + stateFloorCapacity;
          
          
            
            // Calculation for the total capacity of Woodward Hall based on the state percentage allowed people
            // on each floor of the building

            woodwardStateCapacity = (int)(woodwardStateCapacity + stateFloorCapacity);

            
            
            // Setting the state floor capacity to 0 so that it can calculate the next floor by itself
            
            stateFloorCapacity = 0;

          }

          

    // If statement to display capacities of each floor when capacity of each classroom has been displayed
    
    if (numberOfClassrooms == 0){
      System.out.println("");
      System.out.println("The normal capacity of this floor is: " + floorCapacity);
      System.out.println("The state capacity of this floor is: " + (int)(stateFloorTotal));
      
    
      // Setting floor capacity and statefloor total back to 0 so they will not keep adding in the loops

      floorCapacity = 0;
      stateFloorTotal = 0;
    }
}

  // Printing out the total number of floors and the total state capacity of Woodward Hall 

    System.out.println("");
    System.out.println("Woodward Hall");
    System.out.println("The total number of floors: " + totalNumberOfFloors);
    System.out.println("The total state capacity of Woodward Hall is " + woodwardStateCapacity);

    }
      
    scnr.close();
    
}
}