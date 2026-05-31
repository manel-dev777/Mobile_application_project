package com.example.umbb_mobguide;

public class Department {
    private String name;
    private String description;
    private String email;
    private String phone;
    private String location;
    private String specialties;
    private String icon;
    private String color;

    public Department(String name, String description, String email, String phone,
                      String location, String specialties, String icon, String color) {
        this.name = name;
        this.description = description;
        this.email = email;
        this.phone = phone;
        this.location = location;
        this.specialties = specialties;
        this.icon = icon;
        this.color = color;
    }

    public String getName() { return name; }
    public String getDescription() { return description; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }
    public String getLocation() { return location; }
    public String getSpecialties() { return specialties; }
    public String getIcon() { return icon; }
    public String getColor() { return color; }
}