
public class InheritanceTest
{
    public static void main(String[] args) {
            Sport sport = new Sport("LAX","score the most points for your team");
            Sport snowboarding = new Snowboarding("Alpine");
            Sport halfPipe = new HalfPipe();
            System.out.println(halfPipe.getGoal());
            sport.addRule("dont die");
            System.out.println(sport.getGoal());
            System.out.println(halfPipe.toString());
            System.out.println(snowboarding.toString());
    }
}