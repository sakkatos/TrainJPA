/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package th.co.geniustree.training.trainjpa;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import static th.co.geniustree.training.trainjpa.Student_.id;

/**
 *
 * @author Nook
 */
@Entity
public class Student implements Serializable{
    @Id
    private Integer id;
    private String name;
    @Temporal(TemporalType.DATE)
    private Date birthDate;
    @ManyToOne
    @JoinColumn(name = "FACULTY_ID")
    private Faculty faculty;

    public Student(Integer id, String name, Date birthDate, Faculty faculty) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.faculty = faculty;
    }

    public Student() {
    }

    
    
    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    
    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
