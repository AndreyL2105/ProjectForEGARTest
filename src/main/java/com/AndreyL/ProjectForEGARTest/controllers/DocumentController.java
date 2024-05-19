package com.AndreyL.ProjectForEGARTest.controllers;

import com.AndreyL.ProjectForEGARTest.models.Document;
import com.AndreyL.ProjectForEGARTest.services.DocumentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
public class DocumentController {
    private final DocumentService documentService;

//Или вернет весь список если number нет или вернет отсортированный
    @GetMapping("/")
    public String documents(@RequestParam(name = "number", required = false) String number, Model model){
        model.addAttribute("documents", documentService.listDocuments(number));
        return "documents";
    }

    @GetMapping("/document/{id}")
    public String documentsInfo(@PathVariable Long id, Model model){
        model.addAttribute("documents", documentService.getDocumentById(id));
        return "documents";
    }

    @PostMapping("/document/create")
    public String createDocument(Document document){
        documentService.saveDocument(document);
        return "redirect:/";
    }

    @PostMapping("/document/delete/{id}")
    public String deleteDocument(@PathVariable Long id){
        documentService.deleteDocument(id);
        return "redirect:/";
    }

}
