package bridge;

public interface Profile {
    String getEmail();
    String getFirstname();
    String getSurname();

    void SetEmail(String email);
    void SetFirstname(String firstname);
    void SetSurname(String surname);
}
