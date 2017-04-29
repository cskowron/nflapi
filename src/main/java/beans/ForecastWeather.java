package beans;

import beans.base.BaseWeather;

import java.util.Calendar;

/**
 * @author cskowron@moxiegroup.com (Cory Skowronek)
 * @since  1.0.0
 */
public class ForecastWeather {

    private Calendar observeDate;
    private BaseWeather dayTime;
    private BaseWeather nightTime;

    public Calendar getObserveDate() {
        return observeDate;
    }

    public void setObserveDate(Calendar observeDate) {
        this.observeDate = observeDate;
    }

    public BaseWeather getDayTime() {
        return dayTime;
    }

    public void setDayTime(BaseWeather dayTime) {
        this.dayTime = dayTime;
    }

    public BaseWeather getNightTime() {
        return nightTime;
    }

    public void setNightTime(BaseWeather nightTime) {
        this.nightTime = nightTime;
    }
}
