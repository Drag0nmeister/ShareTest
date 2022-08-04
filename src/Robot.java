import java.util.Objects;
  public  class Robot {

      public Label checkLabels(TextAnalyzer[] analyzers, String text) {
          for (TextAnalyzer textAnalyzer : analyzers) {
              if (textAnalyzer.processText(text) != Label.OK) return textAnalyzer.processText(text);
          }
          return Label.OK;
      }
  }

      enum Label {
          SPAM, NEGATIVE_TEXT, TOO_LONG, OK
      }

      interface TextAnalyzer {
          Label processText(String text);
      }

      class SpamAnalyzer extends KeywordAnalyzer implements TextAnalyzer {
          private String[] keywords;

          public SpamAnalyzer(String[] keywords) {
              this.keywords = keywords;
          }

          @Override
          String[] getKeywords() {
              return keywords;
          }

          @Override
          Label getLabel() {
              return Label.SPAM;
          }
      }

      class NegativeTextAnalyzer extends KeywordAnalyzer implements TextAnalyzer {
          private final String[] negativeSmile = {":(", "=(", " :|"};

          public NegativeTextAnalyzer() {

          }

          @Override
          String[] getKeywords() {
              return negativeSmile;
          }

          @Override
          Label getLabel() {
              return Label.NEGATIVE_TEXT;
          }
      }

      class TooLongTextAnalyzer implements TextAnalyzer {
          private int maxLength;

          public TooLongTextAnalyzer(int maxLength) {
              this.maxLength = maxLength;
          }

          @Override
          public Label processText(String text) {
              if (text.length() > maxLength) return Label.TOO_LONG;
              else return Label.OK;
          }
      }

      abstract class KeywordAnalyzer implements TextAnalyzer {
          abstract String[] getKeywords();

          abstract Label getLabel();

          @Override
          public Label processText(String text) {
              String[] keywords = getKeywords();
              for (String keyword : keywords) {
                  if (text.contains(keyword)) {
                      return getLabel();
                  }
              }
              return Label.OK;
          }
      }
