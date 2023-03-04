package org.credex.hiring.portal.model;
import javax.persistence.*;

@Entity
@Table(name = "Chart")
public class Chart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

    public String getCampusType() {
        return campusType;
    }

    public void setCampusType(String campusType) {
        this.campusType = campusType;
    }

    @Column(name = "campus_type")
    private String campusType;



    public int getSelectedStudents() {
        return selectedStudents;
    }

    public void setSelectedStudents(int selectedStudents) {
        this.selectedStudents = selectedStudents;
    }

    @Column(name = "selected_Id")
    private int selectedStudents;



    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
