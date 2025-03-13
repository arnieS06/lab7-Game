public class Rule {
    private String text = "empty rule.";
    private boolean optional = false;

    public Rule() {

    }

    public Rule(String t) {
        this.text = t;
    }

    public Rule(String t, boolean o) {
        this.text = t;
        this.optional = o;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean getOptional() {
        return this.optional;
    }

    public void setOptional(boolean option) {
        this.optional = option;
    }

    public String toString() {
        return this.text;
    }


}
