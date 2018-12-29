public class SpamAnalyzer extends KeywordAnalyzer implements TextAnalyzer {
    private String[] keywords;
    public SpamAnalyzer(String[] keywords) {
        this.keywords = keywords;
    }
    protected String[] getKeywords() {
        return keywords;
    }
    protected Label getLabel() {
        return Label.SPAM;
    }

}

