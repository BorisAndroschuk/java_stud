public class SpamAnalyzer extends KeywordAnalyzer implements TextAnalyzer {
    private String[] keywords;
    public SpamAnalyzer(String[] keywords) {
        this.keywords = new String[keywords.length];
        for (int i=0;i<keywords.length;i++) {
            this.keywords[i] = ".*"+keywords[i]+".*";
        }


    }
    protected String[] getKeywords() {
        return keywords;
    }
    protected Label getLabel() {
        return Label.SPAM;
    }

}

