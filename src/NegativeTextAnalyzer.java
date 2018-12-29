public class NegativeTextAnalyzer extends KeywordAnalyzer implements TextAnalyzer {
    private String[] keywords;

    public NegativeTextAnalyzer() {
        this.keywords = new String[] {":(","=(",":|"};
    }
    protected String[] getKeywords() {
        return keywords;
    }
    protected Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }
}
