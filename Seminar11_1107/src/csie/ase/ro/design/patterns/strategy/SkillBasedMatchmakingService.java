package csie.ase.ro.design.patterns.strategy;

public class SkillBasedMatchmakingService implements IMatchmakingService {

    int tolerance;

    public SkillBasedMatchmakingService(int tolerance) {
        super();
        this.tolerance = tolerance;
    }

    @Override
    public void findMatch(int playerRating) {

        System.out.println("Skill-based match for rating " + playerRating + " (±" + tolerance + ")");
    }

}
