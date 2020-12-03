// Of course, you will also need to demo its capabilities for her, so make a ProjectTest class to do this.

import java.util.ArrayList;

public class  ProjectTest{
    public static void main(String[] args){
        //create an array list of all projects
        Portfolio projects = new Portfolio();

        //TEST CASES:


        //create an empty project
        Project emptyProj = new Project();
        //  get the name and desc
        System.out.println(emptyProj.getName());
        System.out.println(emptyProj.getDesc());
        //  get the elevator pitch
        System.out.println(emptyProj.elevatorPitch());
        System.out.println("/////////////////////////////////////////");



        //create a new project with a name only
        Project nameOnly = new Project("First Project");
        //  get the name and desc
        System.out.println(nameOnly.getName());
        System.out.println(nameOnly.getDesc());
        //  get the elevator pitch
        System.out.println(nameOnly.elevatorPitch());
        //  set the description
        nameOnly.setDesc("This is our first project!");
        //  get the name and desc
        System.out.println(nameOnly.getName());
        System.out.println(nameOnly.getDesc());
        //  get the elevator pitch
        System.out.println(nameOnly.elevatorPitch());

        //add project to portfolio array list
        projects.addProj(nameOnly.getObject());
        System.out.println("/////////////////////////////////////////");



        //create a new project with a name and a description
        Project fullProj = new Project("Starlink", "Satelite Party");
        //  get the name and desc
        System.out.println(fullProj.getName());
        System.out.println(fullProj.getDesc());
        //  get the elevator pitch
        System.out.println(fullProj.elevatorPitch());
        //  set the name and desc
        fullProj.setName("Falcon 9");
        fullProj.setDesc("Reusable Rocket");
        //  get the name and desc
        System.out.println(fullProj.getName());
        System.out.println(fullProj.getDesc());
        //  get the elevator pitch
        System.out.println(fullProj.elevatorPitch());

        //add project to portfolio array list
        projects.addProj(fullProj.getObject());
        System.out.println("/////////////////////////////////////////");



        //add a name and description to the empty project created above
        //  set the name and desc
        emptyProj.setName("Falcon Heavy");
        emptyProj.setDesc("A super-powerful, heavy triple Falcon-9 rocket!");
        //  get the name and desc
        System.out.println(emptyProj.getName());
        System.out.println(emptyProj.getDesc());
        //  get the elevator pitch
        System.out.println(emptyProj.elevatorPitch());

        
        //add project to portfolio array list
        projects.addProj(emptyProj.getObject());
        System.out.println("/////////////////////////////////////////");


        //create a new project with a name, description, and initial cost
        Project tesla = new Project("Tesla", "Electric, rechargable car", 53980.3);
        //  get the name and desc
        System.out.println(tesla.getName());
        System.out.println(tesla.getDesc());
        System.out.println(tesla.getCost());
        //  get the elevator pitch
        System.out.println(tesla.elevatorPitch());

        //add project to portfolio array list
        projects.addProj(tesla.getObject());
        System.out.println("/////////////////////////////////////////");

        //show the array list of all projects
        ArrayList<Object[]> projectList = projects.getProjects();
        System.out.println(projectList);
        //display the list of projects
        for (Object[] proj : projectList){
            System.out.println(proj[0]);
            System.out.println(proj[1]);
            System.out.println(proj[2]);
        }


        // Add the getPortfolioCost method that calculates and returns the cost to buy the entire portfolio.
        System.out.println("Total Cost to buy the entire portfolio: $" + projects.getPortfolioCost());
        System.out.println("/////////////////////////////////////////");

        // Add the showPortfolio method that will print all the project elevator pitches, followed by the total cost.
        projects.showPortfolio();

    }
}