/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;
import java.sql.Date;
import java.sql.Time;

/**
 *
 * @author J Mends
 */
public class ClubManagement {
    private int clubId;
    private String name;
    private String meetingLocation;
    private Date meetingDate;
    private Time meetingTime;
    private int adminId;

    public ClubManagement(int clubId, String name, String meetingLocation, Date meetingDate, Time meetingTime, int adminId) {
        this.clubId = clubId;
        this.name = name;
        this.meetingLocation = meetingLocation;
        this.meetingDate = meetingDate;
        this.meetingTime = meetingTime;
        this.adminId = adminId;
    }

    public int getClubId() {
        return clubId;
    }

    public void setClubId(int clubId) {
        this.clubId = clubId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMeetingLocation() {
        return meetingLocation;
    }

    public void setMeetingLocation(String meetingLocation) {
        this.meetingLocation = meetingLocation;
    }

    public Date getMeetingDate() {
        return meetingDate;
    }

    public void setMeetingDate(Date meetingDate) {
        this.meetingDate = meetingDate;
    }

    public Time getMeetingTime() {
        return meetingTime;
    }

    public void setMeetingTime(Time meetingTime) {
        this.meetingTime = meetingTime;
    }

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }
    
    
    
}
