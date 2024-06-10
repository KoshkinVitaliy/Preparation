package exam;

public class Teacher {
    private final String NAME;

    private final String SURNAME;

    private String login;

    private String password;

    public Teacher(String NAME,
                   String SURNAME,
                   String login,
                   String password) {
        this.NAME = NAME;
        this.SURNAME = SURNAME;
        this.login = login;
        this.password = password;
    }

    public String getNAME() {
        return NAME;
    }

    public String getSURNAME() {
        return SURNAME;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
