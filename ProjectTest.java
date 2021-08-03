public class ProjectTest{
  public static void main(String[] args){
    Project first = new Project();
    Project second = new Project("Second");
    Project third = new Project("Thirdy", "This is the third project");
    String secondProject = second.getProjectName();
    String thirdProject = third.elevatorPitch();
    System.out.println(secondProject);
    System.out.println(thirdProject);
    System.out.println(third);
  }
}