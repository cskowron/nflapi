package beans;

import beans.enums.Type;

import java.time.temporal.WeekFields;
import java.util.Calendar;

/**
 * @author cskowron@moxiegroup.com (Cory Skowronek)
 * @since  1.0.0
 */
public class Content {

    private String id;
    private Type type;
    private String title;
    private String caption;
    private Week weekOfSeason;
    private Image originalImage;
    private Image thumbnailImage;
    private Calendar createdDate;
    private Calendar lastModifiedDate;
    private User author;
    private RightsHolder rightsHolder;
    private Related related;
    private String url;
    private String category;
    private String advertisingChannel;
    private ContentVisibility contentVisibility;

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public Calendar getWeekOfSeason() {
        return weekOfSeason;
    }

    public void setWeekOfSeason(Calendar weekOfSeason) {
        this.weekOfSeason = weekOfSeason;
    }

    public Image getOriginalImage() {
        return originalImage;
    }

    public void setOriginalImage(Image originalImage) {
        this.originalImage = originalImage;
    }

    public Image getThumbnailImage() {
        return thumbnailImage;
    }

    public void setThumbnailImage(Image thumbnailImage) {
        this.thumbnailImage = thumbnailImage;
    }

    public Calendar getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Calendar createdDate) {
        this.createdDate = createdDate;
    }

    public Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public RightsHolder getRightsHolder() {
        return rightsHolder;
    }

    public void setRightsHolder(RightsHolder rightsHolder) {
        this.rightsHolder = rightsHolder;
    }

    public Related getRelated() {
        return related;
    }

    public void setRelated(Related related) {
        this.related = related;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getAdvertisingChannel() {
        return advertisingChannel;
    }

    public void setAdvertisingChannel(String advertisingChannel) {
        this.advertisingChannel = advertisingChannel;
    }

    public ContentVisibility getContentVisibility() {
        return contentVisibility;
    }

    public void setContentVisibility(ContentVisibility contentVisibility) {
        this.contentVisibility = contentVisibility;
    }
}
