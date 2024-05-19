package com.AndreyL.ProjectForEGARTest.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "document")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Document {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "number", unique = true)
    private String number;
    @Column(name = "name")
    private String name;
    @Column(name = "date_of_creation")
    private LocalDateTime dateOfCreation;
}
