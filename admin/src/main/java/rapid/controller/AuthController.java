package rapid.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;
import rapid.component.JwtUtil;
import rapid.dto.AuthResponse;
import rapid.dto.LoginRequest;
import rapid.dto.RegisterRequest;
import rapid.model.Authority;
import rapid.model.User;
import rapid.repositories.AuthorityRepository;
import rapid.repositories.UserRepository;

import java.util.Collections;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final AuthenticationManager authenticationManager;
    private final UserRepository userRepository;
    private final AuthorityRepository authorityRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtUtil jwtUtil; // Inject JwtUtil

    public AuthController(AuthenticationManager authenticationManager,
                          UserRepository userRepository,
                          AuthorityRepository authorityRepository,
                          PasswordEncoder passwordEncoder,
                          JwtUtil jwtUtil) { // Add JwtUtil to constructor
        this.authenticationManager = authenticationManager;
        this.userRepository = userRepository;
        this.authorityRepository = authorityRepository;
        this.passwordEncoder = passwordEncoder;
        this.jwtUtil = jwtUtil;
    }

    @PostMapping("/login")
    public ResponseEntity<AuthResponse> login(@RequestBody LoginRequest request) {
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword()));

        if (authentication.isAuthenticated()) {
            // Generate JWT token
            String token = jwtUtil.generateToken(request.getUsername());
            return ResponseEntity.ok(new AuthResponse(token));
        } else {
            return ResponseEntity.status(401).body(new AuthResponse("Invalid username or password"));
        }
    }

    @PostMapping("/register")
    public ResponseEntity<AuthResponse> register(@RequestBody RegisterRequest request) {
        if (userRepository.findByUsername(request.getUsername()).isPresent()) {
            return ResponseEntity.badRequest().body(new AuthResponse("Username already exists"));
        }

        Authority authority = authorityRepository.findById(1L)
                .orElseGet(() -> authorityRepository.save(new Authority(request.getRole())));

        User newUser = new User(request.getUsername(),
                passwordEncoder.encode(request.getPassword()),
                Collections.singleton(authority));

        userRepository.save(newUser);
        return ResponseEntity.ok(new AuthResponse("User registered successfully"));
    }
}


