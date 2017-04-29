package beans;

import beans.enums.Type;

import java.util.Calendar;

/**
 * Created by Cory on 4/22/2017.
 */
public class College {

    private String id;
    private Type type;
    private Calendar lastModifiedDate;
    private String Name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Type getCollegeType() {
        return type;
    }

    public void setType(Type collegeType) {
        this.type = collegeType;
    }

    public Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
