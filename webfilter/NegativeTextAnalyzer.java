package webfilter;
public class NegativeTextAnalyzer extends KeywordAnalyzer {
    private String[] keywords = {":(","=(",":|"};
    public String[] getKeywords(){
        return keywords;
    }
    public Label getLabel(){
        return Label.NEGATIVE_TEXT;
    }



}