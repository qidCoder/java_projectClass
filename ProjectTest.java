// Of course, you will also need to demo its capabilities for her, so make a ProjectTest class to do this.

public class  ProjectTest{
    public static void main(String[] args){
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
        System.out.println("/////////////////////////////////////////");
    }
}