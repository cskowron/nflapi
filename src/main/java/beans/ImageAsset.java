package beans;

import java.util.List;

/**
 * @author cskowron@moxiegroup.com (Cory Skowronek)
 * @since  1.0.0
 */
public class ImageAsset {

    private String source;
    private String copyright;
    private String createDate;
    private List relatedGames;
    private List relatedTeams;
    private List relatedEvents;
    private List relatedPersons;
    private Week weekOfSeason;
    private String fileName;
    private String fileSize;
    private String format;
    private int height;
    private int width;
    private String cameraMake;
    private String cameraModel;
    private double shutterSpeed;
    private double subjectDistance;
    private String software;

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public List getRelatedGames() {
        return relatedGames;
    }

    public void setRelatedGames(List relatedGames) {
        this.relatedGames = relatedGames;
    }

    public List getRelatedTeams() {
        return relatedTeams;
    }

    public void setRelatedTeams(List relatedTeams) {
        this.relatedTeams = relatedTeams;
    }

    public List getRelatedEvents() {
        return relatedEvents;
    }

    public void setRelatedEvents(List relatedEvents) {
        this.relatedEvents = relatedEvents;
    }

    public List getRelatedPersons() {
        return relatedPersons;
    }

    public void setRelatedPersons(List relatedPersons) {
        this.relatedPersons = relatedPersons;
    }

    public Week getWeekOfSeason() {
        return weekOfSeason;
    }

    public void setWeekOfSeason(Week weekOfSeason) {
        this.weekOfSeason = weekOfSeason;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileSize() {
        return fileSize;
    }

    public void setFileSize(String fileSize) {
        this.fileSize = fileSize;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getCameraMake() {
        return cameraMake;
    }

    public void setCameraMake(String cameraMake) {
        this.cameraMake = cameraMake;
    }

    public String getCameraModel() {
        return cameraModel;
    }

    public void setCameraModel(String cameraModel) {
        this.cameraModel = cameraModel;
    }

    public double getShutterSpeed() {
        return shutterSpeed;
    }

    public void setShutterSpeed(double shutterSpeed) {
        this.shutterSpeed = shutterSpeed;
    }

    public double getSubjectDistance() {
        return subjectDistance;
    }

    public void setSubjectDistance(double subjectDistance) {
        this.subjectDistance = subjectDistance;
    }

    public String getSoftware() {
        return software;
    }

    public void setSoftware(String software) {
        this.software = software;
    }
}
