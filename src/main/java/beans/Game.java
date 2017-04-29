package beans;

import beans.enums.Type;

import java.util.List;

/**
 * @author cskowron@moxiegroup.com (Cory Skowronek)
 * @since  1.0.0
 */
public class Game {
    private String uuid;
    private Type type;
    private Week week;
    private String gameTime;
    private Team homeTeam;
    private Team visitorTeam;
    private Venue venue;
    private GameStatus gameStatus;
    private TeamScore homeTeamScore;
    private TeamScore visitorTeamScore;
    private TeamGameStats homeTeamStats;
    private TeamGameStats visitorTeamStats;
    private List homeTeamPlayerStats;
    private List visitorTeamPlayerStats;
    private List drives;
    private Related related;
    private ForecastWeather forecastWeather;
    private List audio; // TODO: Audio
    private List networkChannelsl;
    private String ticketmasterUrl;
    private List homeTeamFacts;
    private List visitorTeamFacts;
    private Video pregameHighlight;
    private Video postgameHighlight;
    private String gsisId;
    private String esbId;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Week getWeek() {
        return week;
    }

    public void setWeek(Week week) {
        this.week = week;
    }

    public String getGameTime() {
        return gameTime;
    }

    public void setGameTime(String gameTime) {
        this.gameTime = gameTime;
    }

    public Team getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(Team homeTeam) {
        this.homeTeam = homeTeam;
    }

    public Team getVisitorTeam() {
        return visitorTeam;
    }

    public void setVisitorTeam(Team visitorTeam) {
        this.visitorTeam = visitorTeam;
    }

    public Venue getVenue() {
        return venue;
    }

    public void setVenue(Venue venue) {
        this.venue = venue;
    }

    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public void setGameStatus(GameStatus gameStatus) {
        this.gameStatus = gameStatus;
    }

    public TeamScore getHomeTeamScore() {
        return homeTeamScore;
    }

    public void setHomeTeamScore(TeamScore homeTeamScore) {
        this.homeTeamScore = homeTeamScore;
    }

    public TeamScore getVisitorTeamScore() {
        return visitorTeamScore;
    }

    public void setVisitorTeamScore(TeamScore visitorTeamScore) {
        this.visitorTeamScore = visitorTeamScore;
    }

    public teamGameStats getHomeTeamStats() {
        return homeTeamStats;
    }

    public void setHomeTeamStats(teamGameStats homeTeamStats) {
        this.homeTeamStats = homeTeamStats;
    }

    public TeamGameStats getVisitorTeamStats() {
        return visitorTeamStats;
    }

    public void setVisitorTeamStats(TeamGameStats visitorTeamStats) {
        this.visitorTeamStats = visitorTeamStats;
    }

    public List getHomeTeamPlayerStats() {
        return homeTeamPlayerStats;
    }

    public void setHomeTeamPlayerStats(List homeTeamPlayerStats) {
        this.homeTeamPlayerStats = homeTeamPlayerStats;
    }

    public List getVisitorTeamPlayerStats() {
        return visitorTeamPlayerStats;
    }

    public void setVisitorTeamPlayerStats(List visitorTeamPlayerStats) {
        this.visitorTeamPlayerStats = visitorTeamPlayerStats;
    }

    public List getDrives() {
        return drives;
    }

    public void setDrives(List drives) {
        this.drives = drives;
    }

    public Related getRelated() {
        return related;
    }

    public void setRelated(Related related) {
        this.related = related;
    }

    public ForecastWeather getForecastWeather() {
        return forecastWeather;
    }

    public void setForecastWeather(ForecastWeather forecastWeather) {
        this.forecastWeather = forecastWeather;
    }

    public List getAudio() {
        return audio;
    }

    public void setAudio(List audio) {
        this.audio = audio;
    }

    public List getNetworkChannelsl() {
        return networkChannelsl;
    }

    public void setNetworkChannelsl(List networkChannelsl) {
        this.networkChannelsl = networkChannelsl;
    }

    public String getTicketmasterUrl() {
        return ticketmasterUrl;
    }

    public void setTicketmasterUrl(String ticketmasterUrl) {
        this.ticketmasterUrl = ticketmasterUrl;
    }

    public List getHomeTeamFacts() {
        return homeTeamFacts;
    }

    public void setHomeTeamFacts(List homeTeamFacts) {
        this.homeTeamFacts = homeTeamFacts;
    }

    public List getVisitorTeamFacts() {
        return visitorTeamFacts;
    }

    public void setVisitorTeamFacts(List visitorTeamFacts) {
        this.visitorTeamFacts = visitorTeamFacts;
    }

    public Video getPregameHighlight() {
        return pregameHighlight;
    }

    public void setPregameHighlight(Video pregameHighlight) {
        this.pregameHighlight = pregameHighlight;
    }

    public Video getPostgameHighlight() {
        return postgameHighlight;
    }

    public void setPostgameHighlight(Video postgameHighlight) {
        this.postgameHighlight = postgameHighlight;
    }

    public String getGsisId() {
        return gsisId;
    }

    public void setGsisId(String gsisId) {
        this.gsisId = gsisId;
    }

    public String getEsbId() {
        return esbId;
    }

    public void setEsbId(String esbId) {
        this.esbId = esbId;
    }
}
