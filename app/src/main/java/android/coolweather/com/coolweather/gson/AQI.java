package android.coolweather.com.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by zhuhao on 18-6-1.
 */

public class AQI {

    public AQICity city;

    public class AQICity{

        public String aqi;

        public String pm25;

    }

}
