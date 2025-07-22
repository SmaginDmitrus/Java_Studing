package webfilter;

public class TooLongTextAnalyzer implements TextAnalyzer {
    private final int maxLength;

    public TooLongTextAnalyzer(int LIMIT) {
        maxLength = LIMIT;
    }

    public Label getLabel() {
        return Label.TOO_LONG;
    }

    public Label processText(String text) {
        if (text.length() > this.maxLength) {
            return this.getLabel();
        } else {
            return Label.OK;
        }
    }

}
