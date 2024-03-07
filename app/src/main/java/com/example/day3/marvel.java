package com.example.day3;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

public class marvel implements Parcelable {
    private String name;
    private String type;
    private int age;

    public marvel() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    protected marvel(Parcel in) {
        name = in.readString();
        type = in.readString();
        age = in.readInt();
    }

    public static final Creator<marvel> CREATOR = new Creator<marvel>() {
        @Override
        public marvel createFromParcel(Parcel in) {
            return new marvel(in);
        }

        @Override
        public marvel[] newArray(int size) {
            return new marvel[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(type);
        dest.writeInt(age);
    }
}
