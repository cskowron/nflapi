package beans;

import beans.enums.Type;

import java.util.Calendar;

/**
 * @author cskowron@moxiegroup.com (Cory Skowronek)
 * @since 1.0.0
 */
public class TeamGameStats {

    private String id;
    private Type type;
    private Calendar lastsModifiedDate;
    private Team team;
    private Game game;
    private PassingStats passing;
    private RushingStats rushing;
    private ReceivingStats receiving;
    private KickingStats kicking;
    private DefensiveStats defensive;
    private PuntingStats punting;
    private KickReturnStats kickReturns;
    private PuntReturnStats puntReturns;
    private FumbleStats fumble;
    private PenaltyStats penalty;
    private TeamStat teamStat;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Calendar getLastsModifiedDate() {
        return lastsModifiedDate;
    }

    public void setLastsModifiedDate(Calendar lastsModifiedDate) {
        this.lastsModifiedDate = lastsModifiedDate;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public PassingStats getPassing() {
        return passing;
    }

    public void setPassing(PassingStats passing) {
        this.passing = passing;
    }

    public RushingStats getRushing() {
        return rushing;
    }

    public void setRushing(RushingStats rushing) {
        this.rushing = rushing;
    }

    public ReceivingStats getReceiving() {
        return receiving;
    }

    public void setReceiving(ReceivingStats receiving) {
        this.receiving = receiving;
    }

    public KickingStats getKicking() {
        return kicking;
    }

    public void setKicking(KickingStats kicking) {
        this.kicking = kicking;
    }

    public DefensiveStats getDefensive() {
        return defensive;
    }

    public void setDefensive(DefensiveStats defensive) {
        this.defensive = defensive;
    }

    public PuntingStats getPunting() {
        return punting;
    }

    public void setPunting(PuntingStats punting) {
        this.punting = punting;
    }

    public KickReturnStats getKickReturns() {
        return kickReturns;
    }

    public void setKickReturns(KickReturnStats kickReturns) {
        this.kickReturns = kickReturns;
    }

    public PuntReturnStats getPuntReturns() {
        return puntReturns;
    }

    public void setPuntReturns(PuntReturnStats puntReturns) {
        this.puntReturns = puntReturns;
    }

    public FumbleStats getFumble() {
        return fumble;
    }

    public void setFumble(FumbleStats fumble) {
        this.fumble = fumble;
    }

    public PenaltyStats getPenalty() {
        return penalty;
    }

    public void setPenalty(PenaltyStats penalty) {
        this.penalty = penalty;
    }

    public TeamStat getTeamStat() {
        return teamStat;
    }

    public void setTeamStat(TeamStat teamStat) {
        this.teamStat = teamStat;
    }
}
