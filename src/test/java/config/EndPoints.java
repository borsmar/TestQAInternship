package config;

public interface EndPoints {
    String USERS = "/users";
    String USERS_SEARCH ="/users/search?name=";
    Integer INVALID_USER_ID = 1998;
    String USER_NOT_FOUND_TEXT = String.format("User with this: %d not found", INVALID_USER_ID);
    Integer INVALID_CONTACT_ID = 5;
    Integer VALID_USER_ID = 1;
    String CONTACT_NOT_FOUND_TEXT = String.format("Contact with id:%d not found", INVALID_CONTACT_ID);
}
