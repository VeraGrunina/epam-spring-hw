package quoters;

public class TerminatorQuoter implements Quoter {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public void sayQoute() {
        System.out.println("message = " + message);
    }
}
