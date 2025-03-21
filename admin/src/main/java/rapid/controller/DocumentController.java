package rapid.controller;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import rapid.dto.DocumentInput;
import rapid.model.Document;
import rapid.repository.BookRepository;

import java.util.List;
import java.util.Optional;

@RestController
public class DocumentController {
    private final BookRepository bookRepository;

    public DocumentController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @GetMapping(path = "/documents")
    public List<Document> getAlldocuments() {
        return bookRepository.findAll();
    }

    @GetMapping(path = "/documents/{id}")
    public Document bookById(@PathVariable("id") Long id) {
        Optional<Document> bookOptional = bookRepository.findById(id);
        if (bookOptional.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, id + " not available");
        }

        return bookOptional.get();
    }

    @PostMapping(path = "/documents")
    @ResponseStatus(HttpStatus.CREATED)
    @SecurityRequirement(name = "BasicAuth")
    public Document createBook(@RequestBody DocumentInput newDocumentInput) {
        Document newDocument = new Document();
        newDocument.setTitle(newDocumentInput.getTitle());
        System.out.println("This is " + newDocumentInput.getTitle());
        return bookRepository.save(newDocument);
    }
}
