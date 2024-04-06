public class Email {
    private String From;
    private String To;
    private String Subject;
    private String ComposeEmail;

    public Email(String from, String to, String subject, String composeEmail) {
        From = from;
        To = to;
        Subject = subject;
        ComposeEmail = composeEmail;
    }

    public Email(String from, String to, String composeEmail) {
        From = from;
        To = to;
        Subject = "(no subject)";
        ComposeEmail = composeEmail;
    }

    public void setFrom(String from) {
        From = from;
    }

    public void setTo(String to) {
        To = to;
    }

    public void setSubject(String subject) {
        Subject = subject;
    }

    public void setComposeEmail(String composeEmail) {
        ComposeEmail = composeEmail;
    }

    public String getFrom() {
        return From;
    }

    public String getTo() {
        return To;
    }

    public String getSubject() {
        return Subject;
    }

    public String getComposeEmail() {
        return ComposeEmail;
    }

    public String toString() {
        return String.format(
                "From: %s\nTo: %s\nSubject: %s\n===============================\n%s\n===============================",
                From, To, Subject,
                ComposeEmail);
    }
}