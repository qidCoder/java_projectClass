// Create a Portfolio class that will keep an ArrayList of Projects in the field projects. Use generics to ensure these are Project objects.
    
import java.util.ArrayList;
    
public class Portfolio{
    private ArrayList<Object[]> projects = new ArrayList<Object[]>();



    // Add the appropriate getters/setters/constructors for this class to work
    public void addProj(Object[] proj){
        projects.add(proj);
    }

    // getter
    public ArrayList<Object[]> getProjects(){
        return projects;
    }

    // Add the getPortfolioCost method that calculates and returns the cost to buy the entire portfolio.
    public double getPortfolioCost(){
        double totalCost = 0;

        for (Object[] project : projects) {                
            System.out.println(project[2]); 
            totalCost += (double) project[2];         
        }

        return totalCost;
    }

    // Add the showPortfolio method that will print all the project elevator pitches, followed by the total cost.
    public void showPortfolio(){
        System.out.println("Elevator Pitches: ");

        for (Object[] project : projects) {                
            System.out.println(project[3]); 
            System.out.println("Total cost: $" + project[2]);      
        }
    }



}