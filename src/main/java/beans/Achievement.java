package beans;

import beans.base.BaseModel;
import beans.enums.Type;

/**
 * @author cskowron@moxiegroup.com (Cory Skowronek)
 * @since  1.0.0
 */
public class Achievement {

    private BaseModel person;
    private int season;
    private Type type;

    public BaseModel getPerson() {
        return person;
    }

    public void setPerson(BaseModel person) {
        this.person = person;
    }

    public int getSeason() {
        return season;
    }

    public void setSeason(int season) {
        this.season = season;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
