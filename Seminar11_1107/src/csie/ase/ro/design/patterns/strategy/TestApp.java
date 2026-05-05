package csie.ase.ro.design.patterns.strategy;

public class TestApp {
    public static void main(String[] args){
        MatchmakingModule matchmakingModule = new MatchmakingModule();

        matchmakingModule.setMatchmakingService(new SkillBasedMatchmakingService(30));
        matchmakingModule.findMatch(230);

        matchmakingModule.setMatchmakingService(new RegionBasedMatchmakingService("EU"));
        matchmakingModule.findMatch(230);
    }
}
