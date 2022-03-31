package src.main.java.parser;

public class RightParenToken implements Token {
    public boolean equals(final Object other) {
        return other instanceof RightParenToken;
    }

    public int hashCode() {
        return 17;
    }

    public String toString() {
        return "RightParenToken";
    }
}