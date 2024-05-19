package com.AndreyL.ProjectForEGARTest.services;

import com.AndreyL.ProjectForEGARTest.models.Document;
import com.AndreyL.ProjectForEGARTest.repositories.DocumentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public void updateDocumentByID(Document document, Long id){
        Document doc = documentRepository.findById(id).orElseThrow();
        doc.setNumber(document.getNumber());
        doc.setName(document.getName());
        documentRepository.save(doc);
    }

    public Document findById(Long id){
        return documentRepository.findById(id).orElseThrow();
    }

    public void testSearch(){
        Document doc1 = documentRepository.findByNumberOrNameOrDateOfCreation("d1", null, null).orElseThrow();
        System.out.println(doc1);
    }
}
