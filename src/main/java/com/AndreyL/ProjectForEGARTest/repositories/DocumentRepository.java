package com.AndreyL.ProjectForEGARTest.repositories;

import com.AndreyL.ProjectForEGARTest.models.Document;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface DocumentRepository extends JpaRepository<Document,Long> {
    Optional<Document> findByNumberOrNameOrDateOfCreation(String number, String name, LocalDateTime dateOfCreation);
}
