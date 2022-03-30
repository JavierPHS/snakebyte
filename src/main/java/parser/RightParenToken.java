package parser;

public class ElseToken implements Token {
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