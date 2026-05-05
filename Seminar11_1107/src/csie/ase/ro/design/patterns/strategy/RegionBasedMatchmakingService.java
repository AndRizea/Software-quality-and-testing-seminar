package csie.ase.ro.design.patterns.strategy;

public class RegionBasedMatchmakingService implements IMatchmakingService {

    String region;

    public RegionBasedMatchmakingService(String region) {
        super();
        this.region = region;
    }

    @Override
    public void findMatch(int playerRating) {
        System.out.println("Region match in " + region + " for rating " + playerRating);
    }

}
