package bridge;

public class Trainer implements User{
    private String email;
    private String firstname;
    private String surname;

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getFirstname() {
        return firstname;
    }

    @Override
    public String getSurname() {
        return surname;
    }

    @Override
    public void SetEmail(String email) {
        this.email = email;
    }

    @Override
    public void SetFirstname(String firstname) {
        this.firstname = firstname;
    }

    @Override
    public void SetSurname(String surname) {
        this.surname = surname;
    }
}
