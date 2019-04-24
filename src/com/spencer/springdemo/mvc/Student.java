package com.spencer.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {

    private String firstName, lastName, country, favLanguage;

    private LinkedHashMap<String, String> countryOptions;
    private LinkedHashMap<String, String> favouriteLanguageOptions;

    public Student() {

        // populate county options: used ISO country code
        countryOptions = new LinkedHashMap<>();
        countryOptions.put("UK", "United Kingdom");
        countryOptions.put("BR", "Brazil");
        countryOptions.put("FR", "France");
        countryOptions.put("DE", "Germany");
        countryOptions.put("IN", "India");

        // populate favouriteLanguageOptions
        favouriteLanguageOptions = new LinkedHashMap<>();
        favouriteLanguageOptions.put("Java", "Java");
        favouriteLanguageOptions.put("C#", "C#");
        favouriteLanguageOptions.put("Python", "Python");
        favouriteLanguageOptions.put("PHP", "PHP");

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public LinkedHashMap<String, String> getCountryOptions() {
        return countryOptions;
    }


    public String getFavLanguage() {
        return favLanguage;
    }

    public void setFavLanguage(String favLanguage) {
        this.favLanguage = favLanguage;
    }

    public LinkedHashMap<String, String> getFavouriteLanguageOptions() {
        return favouriteLanguageOptions;
    }
}

