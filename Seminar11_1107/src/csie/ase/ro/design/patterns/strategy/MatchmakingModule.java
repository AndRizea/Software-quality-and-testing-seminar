package csie.ase.ro.design.patterns.strategy;

public class MatchmakingModule {

    String moduleName;
    IMatchmakingService matchmakingService;

    public void setMatchmakingService(IMatchmakingService service){
        this.matchmakingService = service;
    }

    public void findMatch(int playerRating){
        if(matchmakingService != null){
            // callback
            this.matchmakingService.findMatch(playerRating);
        }
    }
}
