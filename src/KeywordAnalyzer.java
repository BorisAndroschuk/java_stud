abstract class KeywordAnalyzer implements TextAnalyzer {

    protected abstract String[] getKeywords();

    protected abstract Label getLabel();

    public Label processText(String text) {
        String[] keywords = getKeywords();
        for (String keyStr : keywords) {
            if (text.matches(keyStr)) {
                return getLabel();
            }
        }
        return Label.OK;
    }

}
