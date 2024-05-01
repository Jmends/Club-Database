create database clubdatabase;
use clubdatabase;

CREATE TABLE User (
    schoolId INT PRIMARY KEY,
    email VARCHAR(50),
    name VARCHAR(50),
    phoneNumber VARCHAR(15),
    password VARCHAR(50)
);

-- Admin table
CREATE TABLE Admin (
    schoolId INT PRIMARY KEY,
    FOREIGN KEY (schoolId) REFERENCES User(schoolId)
);

-- Member table
CREATE TABLE Member (
    schoolId INT PRIMARY KEY,
    FOREIGN KEY (schoolId) REFERENCES User(schoolId)
);

-- Club table
CREATE TABLE Club (
    clubId INT PRIMARY KEY,
    name VARCHAR(50),
    meetingLocation VARCHAR(100),
    meetingDate DATE,
    meetingTime TIME,
    adminId INT,
    FOREIGN KEY (adminId) REFERENCES Admin(schoolId)
);

-- ClubMember table
CREATE TABLE ClubMember (
    memberId INT,
    clubId INT,
    startDate DATE,
    endDate DATE,
    PRIMARY KEY (memberId, clubId),
    FOREIGN KEY (memberId) REFERENCES Member(schoolId),
    FOREIGN KEY (clubId) REFERENCES Club(clubId)
);

-- Event table
CREATE TABLE Event (
    eventId INT PRIMARY KEY,
    eventName VARCHAR(100),
    eventDate DATE,
    eventTime TIME,
    eventDescription TEXT
);

-- EventClubs table
CREATE TABLE EventClubs (
    clubId INT,
    eventId INT,
    role VARCHAR(50),
    PRIMARY KEY (clubId, eventId),
    FOREIGN KEY (clubId) REFERENCES Club(clubId),
    FOREIGN KEY (eventId) REFERENCES Event(eventId)
);

-- Announcements table
CREATE TABLE Announcements (
    announcementId INT PRIMARY KEY,
    message TEXT,
    clubId INT,
    FOREIGN KEY (clubId) REFERENCES Club(clubId)
);