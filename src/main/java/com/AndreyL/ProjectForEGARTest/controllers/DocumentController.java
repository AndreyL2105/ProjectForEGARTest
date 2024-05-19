package com.AndreyL.ProjectForEGARTest.controllers;

import com.AndreyL.ProjectForEGARTest.models.Document;
import com.AndreyL.ProjectForEGARTest.services.DocumentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@Controller
@RequiredArgsConstructor
public class DocumentController {
    private final DocumentService documentService;

//Или вернет весь список если number нет или вернет отсортированный
    @GetMapping("/")
    public String documents(Model model){
        model.addAttribute("documents", documentService.listDocuments());
        return "documents";
    }

    @GetMapping("/page-create")
    public String documentsInfo(){
        documentService.testSearch();
        return "page-create";
    }

    @GetMapping("/page-update/{id}")
    public String documentsInfoUpdate(@PathVariable("id") Long id, Model model){
        Document byId = documentService.findById(id);
        model.addAttribute("updateDoc", byId);
        return "page-update";
    }

    @PostMapping("/document/create")
    public String createDocument(Document document){
        document.setDateOfCreation(LocalDateTime.now());
        documentService.saveDocument(document);
        return "redirect:/";
    }

    @PostMapping("/document/update/{id}")
    public String updateDocument(@PathVariable("id") Long id, Document document){
        document.setDateOfCreation(LocalDateTime.now());
        documentService.updateDocumentByID(document, id);
        return "redirect:/";
    }

    @PostMapping("/document/delete/{id}")
    public String deleteDocument(@PathVariable Long id){
        documentService.deleteDocument(id);
        return "redirect:/";
    }

}
