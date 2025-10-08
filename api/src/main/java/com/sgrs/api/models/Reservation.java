package com.sgrs.api.models;

import java.io.Serializable;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Reservation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;

    @Column(nullable = false)
    private LocalDateTime dateTimeStart;
    
    @Column(nullable = false)
    private LocalDateTime dateTimeEnd;

    @ManyToOne
    @Column(nullable = false)
    private User user;
    
    @ManyToOne
    @Column(nullable = false)
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
