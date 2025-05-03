package com.example.eventmingle.models;

public class Event {
    public String id;
    public String hostId;
    public String name;
    public String type;
    public String date;
    public String time;
    public String venue;
    public String theme;

    public Event() {}

    public Event(String id, String hostId, String name, String type, String date,
                 String time, String venue, String theme) {
        this.id = id;
        this.hostId = hostId;
        this.name = name;
        this.type = type;
        this.date = date;
        this.time = time;
        this.venue = venue;
        this.theme = theme;
    }
}
