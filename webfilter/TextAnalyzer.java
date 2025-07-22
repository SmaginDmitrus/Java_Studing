package webfilter;
enum Label{
    SPAM,NEGATIVE_TEXT,TOO_LONG,OK
}

@FunctionalInterface
interface TextAnalyzer {
    Label processText(String text);

}
