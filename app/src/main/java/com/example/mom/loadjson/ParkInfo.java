package com.example.mom.loadjson;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;

import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class ParkInfo {
    @SerializedName("_id")
    private String _id;

    @SerializedName("ParkName")
    private String parkName;

    @SerializedName("Name")
    private String viewSpot;

    @SerializedName("YearBuilt")
    private String yearBuilt;

    @SerializedName("OpenTime")
    private String openTime;

    @SerializedName("Image")
    private String imageUrl;

    @SerializedName("Introduction")
    private String introduction;

    public static ArrayList<ParkInfo> fromJsonString(String json) {
        ArrayList<ParkInfo> detailData = null;
        if (json == null) return null;

        try {
            JSONObject rootJObj = new JSONObject(json);
            JSONObject usefulJObj = rootJObj.getJSONObject("result");
            String jsonArr = usefulJObj.getJSONArray("results").toString();

            Type listType = new TypeToken< ArrayList< ParkInfo>>() { }.getType();
            Gson gson = new Gson();
            detailData = gson.fromJson( jsonArr , listType);

        } catch (JSONException e) {
            e.printStackTrace();
        }
        return detailData;
    }

    public String get_id() {
        return _id;
    }

    public String getParkName() {
        return parkName;
    }

    public String getName() {
        return viewSpot;
    }

    public String getYearBuilt() {
        return yearBuilt;
    }

    public String getOpenTime() {
        return openTime;
    }
    public String getImageUrl() {
        return imageUrl;
    }

    public String getIntroduciton() {
        return introduction;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public void setParkName(String parkName) {
        this.parkName = parkName;
    }

    public void setName(String name) {
        this.viewSpot = name;
    }

    public void setYearBuilt(String yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    public void setOpenTime(String openTime) {
        this.openTime = openTime;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setIntroduciton(String introduciton) {
        this.introduction = introduciton;
    }
}
