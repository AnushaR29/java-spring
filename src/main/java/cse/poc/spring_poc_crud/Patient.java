package cse.poc.spring_poc_crud;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
// table creation
@Entity
public class Patient {
    // primary key
    @Id
    // auto increment
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int patientId;
    private String patientName;
    private int age;
    private String bloodGroup;
    private String address;
    private long contact;
    private String issue;
}