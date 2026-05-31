package com.example.umbb_mobguide;

import java.util.ArrayList;

public class Faculty {
    private String name;
    private String description;
    private String email;
    private String phone;
    private String location;
    private double latitude;
    private double longitude;
    private ArrayList<Department> departments;

    public Faculty(String name, String description, String email, String phone, String location, double latitude, double longitude) {
        this.name = name;
        this.description = description;
        this.email = email;
        this.phone = phone;
        this.location = location;
        this.latitude = latitude;
        this.longitude = longitude;
        this.departments = new ArrayList<>();
    }

    public String getName() { return name; }
    public String getDescription() { return description; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }
    public String getLocation() { return location; }
    public double getLatitude() { return latitude; }
    public double getLongitude() { return longitude; }
    public ArrayList<Department> getDepartments() { return departments; }
    public void addDepartment(Department d) { departments.add(d); }
}