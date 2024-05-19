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

    @GetMapping("/document/")
    public String documentsInfo(){
        return "document-creation";
    }

    @PostMapping("/document/create")
    public String createDocument(Document document){
        document.setDateOfCreation(LocalDateTime.now());
        documentService.saveDocument(document);
        return "redirect:/";
    }

    @PostMapping("/document/delete/{id}")
    public String deleteDocument(@PathVariable Long id){
        documentService.deleteDocument(id);
        return "redirect:/";
    }

}
