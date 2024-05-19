package com.AndreyL.ProjectForEGARTest.repositories;

import com.AndreyL.ProjectForEGARTest.models.Document;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DocumentRepository extends JpaRepository<Document,Long> {
    List<Document> findByNumber(String number);

}
