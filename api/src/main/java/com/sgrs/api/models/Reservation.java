package com.sgrs.api.models;

import java.time.LocalDateTime;

public class Reservation {
    private Long id;
    private LocalDateTime dateTimeStart;
    private LocalDateTime dateTimeEnd;
    private User user;
    private Room room;

    public Long getId() {
        return this.id;
    }
    public LocalDateTime getDateTimeStart() {
        return this.dateTimeStart;
    }
    public LocalDateTime getDatetimeEnd() {
        return this.dateTimeEnd;
    }
    public User getUser() {
        return this.user;
    }
    public Room getRoom() {
        return this.room;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public void setDateTimeStart(LocalDateTime dateTimeStart) {
        this.dateTimeStart = dateTimeStart;
    }
    public void setDatetimeEnd(LocalDateTime dateTimeEnd) {
        this.dateTimeEnd = dateTimeEnd;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public void setRoom(Room room) {
        this.room = room;
    }
}
