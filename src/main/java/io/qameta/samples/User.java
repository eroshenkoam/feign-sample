package io.qameta.samples;

import com.google.gson.annotations.SerializedName;

public class User {

    private int id;

    @SerializedName("login")
    private String name;

    private int contributions;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getContributions() {
        return contributions;
    }

    public void setContributions(int contributions) {
        this.contributions = contributions;
    }
}
