package core.endpoints;

/**
 * @author cskowron@moxiegroup.com (Cory Skowronek)
 * @since  1.0.0
 */
public enum Root {

    GAMES("/v1/games"),
    TEAMS("/v1/teams"),
    PERSONS("/v1/persons"),
    ACHIEVEMENTS("/v1/achievements"),
    CURRENT_WEEK("/v1/currentWeek"),
    PLAYER_GAME_STATS("/v1/playerGameStats"),
    PLAYER_TEAM_STATS("/v1/playerTeamStats"),
    SEASON_PLAYER_TEAM_STATS("/v1/seasonPlayerTeamStats"),
    PROSPECT_COMBINE_STATS("/v1/prospectCombineStats"),
    DRAFTS("/v1/drafts"),
    LISTS("/v1/lists"),
    VIDEOS("/v1/videos"),
    ARTICLES("/v1/articles"),
    GEO("/v1/geo");

    private String optionValue;

    private Root(String optionValue) {
        this.optionValue = optionValue;
    }

    public String getOptionValue() {
        return this.optionValue;
    }
}
