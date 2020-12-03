// Project Class
// You have been asked by a serial entrepreneur to create a class that she can use to create projects easily. She asks that each project has a name and a description. She needs to be able to create empty projects that she can add a name and description to later; projects with just a name; and projects with both. Every single project should be able to get and set both properties.

// She also needs each project to be able to give an elevator pitch that will return the name and description separated by a colon.


public class Project{
    // Create a Project class that has the fields of name and description.
    private String name;
    private String desc;
    // Add an additional initialCost member variable that is of type double and has both getters and setters
    private double initialCost;
    private String pitch;

    // Create an instance method called elevatorPitch that will return the name and description separated by a colon.
    // Add this to the elevator pitch in parentheses after the name, e.g.: name (cost): description
    public String elevatorPitch(){
        return this.name + " ($" + this.initialCost + "): " + this.desc;
    }

/////////////////////////////////////////////////////////////////
    // CONSTRUCTOR
    // Overload the constructor method in three different ways.

    public Project(){
        setName("");
        setDesc("");
        setCost(0);
        this.pitch = elevatorPitch();

        //create object
        setObject(this.name, this.desc, this.initialCost, this.pitch);

    }

    public Project(String name) {
        setName(name);
        setDesc("");
        this.pitch = elevatorPitch();

        //create object
        setObject(this.name, this.desc, this.initialCost, this.pitch);
    }

    public Project(String name, String desc) {
        setName(name);
        setDesc(desc);
        this.pitch = elevatorPitch();

        //create object
        setObject(this.name, this.desc, this.initialCost, this.pitch);
    }

    public Project(String name, String desc, double cost) {
        setName(name);
        setDesc(desc);
        setCost(cost);
        this.pitch = elevatorPitch();

        //create object
        setObject(this.name, this.desc, this.initialCost, this.pitch);
    }

    ////////////////////////////////////////////////////////////
    // Create getter and setters for each field

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void setDesc(String desc){
        this.desc = desc;
    }
    public String getDesc(){
        return this.desc;
    }

    public void setCost(double cost){
        this.initialCost = cost;
    }
    public double getCost(){
        return this.initialCost;
    }
    ////////////////////////////////////////////////////////////

    // Create a Portfolio class that will keep an ArrayList of Projects in the field projects. Use generics to ensure these are Project objects.    

    private Object[] project = new Object[4];

    //setter
    public void setObject(String name, String desc, double cost, String pitch){
        project[0] = name;
        project[1] = desc;
        project[2] = cost; 
        project[3] = pitch;
    }

    //getter
    public Object[] getObject(){
        return this.project;
    }
    
}


