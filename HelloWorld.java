
public class HelloWorld {
    public static void main(String[] args) {
        List<String> teamMembers = new ArrayList<>();
        teamMembers.add("Atul");
        teamMembers.add("Sam");
        teamMembers.add("Zobeir");
        teamMembers.add("Eliza");

        for(int i=0; i<teamMembers.size();i++) {
            String name = teamMembers.get(i);
            System.out.println("Hello " + name);
        }

    }
}
