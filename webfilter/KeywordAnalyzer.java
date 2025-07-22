package webfilter;



public abstract class KeywordAnalyzer implements TextAnalyzer{
    protected String[] keywords;
   protected abstract String[] getKeywords();
   protected abstract Label getLabel();
   public Label processText(String text){
    for (String negative_word:this.getKeywords()){
        if (text.contains(negative_word)){
            return this.getLabel();
        }
    }
    return Label.OK; 
}
}