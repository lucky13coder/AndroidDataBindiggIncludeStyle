package com.lucky13coder.databindiggincludestyle.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.lucky13coder.databindiggincludestyle.BR;

/**
 * Created by lucky13coder on 6/20/2016.
 */
public class Person extends BaseObservable
{
    private String name;
    private String age;

    public Person() {
        this.setName("Lucky13 Coder");
        this.setAge("28");
    }

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }

    @Bindable
    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
        notifyPropertyChanged(BR.age);
    }
}
