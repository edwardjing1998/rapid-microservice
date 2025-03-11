package rapid.dto;

import rapid.model.UserRole;

public class PersonInput {
    private String username;
    private String password;
    private UserRole role;  // Ensure this field exists

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public UserRole getRole() {
        return role;
    }
}

