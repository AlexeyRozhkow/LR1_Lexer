public class Token {
    private Lexeme lexeme;
    private String value;

    public Token(Lexeme lexeme, String value) {
        this.lexeme = lexeme;
        this.value = value;
    }

    public Lexeme getLexeme() {
        return lexeme;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Token { " +
                "Lexeme " + lexeme +
                ", Value: '" + value + "' } ";
    }
}
