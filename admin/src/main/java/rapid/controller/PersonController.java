package rapid.controller;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;
import rapid.dto.PersonInput;
import rapid.model.Person;
import rapid.model.UserRole;
import rapid.repositories.PersonRepository;

@RestController
@RequestMapping("/api")
@SecurityRequirement(name = "BearerAuth") // 🔥 Use JWT Authentication
public class PersonController {
    private final PersonRepository personRepository;
    private final PasswordEncoder passwordEncoder;

    public PersonController(PersonRepository personRepository, PasswordEncoder passwordEncoder) {
        this.personRepository = personRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @PostMapping(path = "/persons")
    @ResponseStatus(HttpStatus.CREATED)
    public Person createNewPerson(@RequestBody PersonInput personInput,
                                  @AuthenticationPrincipal UserDetails userDetails) {
        String hashedPassword = passwordEncoder.encode(personInput.getPassword());
        Person newPerson = new Person(personInput.getUsername(), hashedPassword, UserRole.USER);

        System.out.println("Created by: " + userDetails.getUsername());

        return personRepository.save(newPerson);
    }
}

