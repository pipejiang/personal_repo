package com.megvii.demo.domain;

public class Student {
    private Long id;

    private String studentId;

    private String studentName;

    private Byte recentGrade;

    private Byte recentClass;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId == null ? null : studentId.trim();
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName == null ? null : studentName.trim();
    }

    public Byte getRecentGrade() {
        return recentGrade;
    }

    public void setRecentGrade(Byte recentGrade) {
        this.recentGrade = recentGrade;
    }

    public Byte getRecentClass() {
        return recentClass;
    }

    public void setRecentClass(Byte recentClass) {
        this.recentClass = recentClass;
    }
}