package webfilter;
public class SpamAnalyzer extends KeywordAnalyzer{
    private final String[] keywords;
    public SpamAnalyzer(String[] words){
        keywords= words.clone();
    }
    public Label processText(String text){
        for (String spam:this.getKeywords()){
            if (text.contains(spam)){
                return this.getLabel();
            }
        }
        return Label.OK; 
    }
    public String[] getKeywords() {
        return keywords;
    }
    public Label getLabel(){
        return Label.SPAM;
    }


}