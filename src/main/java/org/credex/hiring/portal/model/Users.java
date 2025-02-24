package org.credex.hiring.portal.model;

import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;


@Entity
@Table(name = "user")
public class Users {
    public Users() {
        super();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private int userid;

    @Column(name = "sel_status")
    private boolean status;
    @Column(name = "email",unique = true)
    private String emailId;
    @Column(name = "password")
    private String password;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;

    @Column(name = "role_id")
    private int  roleId;
    @Column(name = "exp")
    private String experience;

    @Column(name = "lang_pref")
    private String language;

    @Column(name = "Skills")
    private String skills;

    @Column(name = "resume_link")
    private String resumeLink;

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public Users(int userid, boolean status, String emailId, String password, String firstName, String lastName, int roleId, String experience, String language, String skills, String resumeLink) {
        this.userid = userid;
        this.status = status;
        this.emailId = emailId;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.roleId = roleId;
        this.experience = experience;
        this.language = language;
        this.skills = skills;
        this.resumeLink = resumeLink;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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



    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getResumeLink() {
        return resumeLink;
    }

    public void setResumeLink(String resumeLink) {
        this.resumeLink = resumeLink;
    }


    }

