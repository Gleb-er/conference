package com.conference.site.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Section {
    private int id;
    private String number;
    private String name;
    private LocalDate date;
    private LocalTime time;
    private String room;
    private String supervisor;
    private String email;

    public Section() {}

    public Section(int id, String number, String name, LocalDate date,
                   LocalTime time, String room, String supervisor, String email) {
        this.id = id;
        this.number = number;
        this.name = name;
        this.date = date;
        this.time = time;
        this.room = room;
        this.supervisor = supervisor;
        this.email = email;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNumber() { return number; }
    public void setNumber(String number) { this.number = number; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }

    public LocalTime getTime() { return time; }
    public void setTime(LocalTime time) { this.time = time; }

    public String getRoom() { return room; }
    public void setRoom(String room) { this.room = room; }

    public String getSupervisor() { return supervisor; }
    public void setSupervisor(String supervisor) { this.supervisor = supervisor; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}