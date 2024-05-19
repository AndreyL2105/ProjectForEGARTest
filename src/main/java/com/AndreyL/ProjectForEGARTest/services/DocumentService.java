package com.AndreyL.ProjectForEGARTest.services;

import com.AndreyL.ProjectForEGARTest.models.Document;
import com.AndreyL.ProjectForEGARTest.repositories.DocumentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DocumentService {
    private final DocumentRepository documentRepository;
    public List<Document> listDocuments(){
        return documentRepository.findAll();
    }
    public void saveDocument(Document document){
        documentRepository.save(document);
    }

    public void deleteDocument(Long id){
        documentRepository.deleteById(id);
    }

    public Document getDocumentById(Long id){
        return documentRepository.findById(id).orElse(null);
    }


}
