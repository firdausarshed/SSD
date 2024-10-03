public class WordProcessor implements Counter {


    int words;
    int letters;
    int length;


    @Override
    public int countWords(String sentence) {
        sentence.split(" ");
        for (String word : sentence.split(" ")) {
            if (word.length() == 1) {
                words += 1;
            }
        }
        return words;
    }

    public int countLetters(String sentence) {
        for (int i = 0; i < sentence.length(); i++) {
            if (Character.isLetter(sentence.charAt(i)))
                letters += 1;
            }
        return letters;
    }


    @Override
    public int getLength(String sentence) {
        length = sentence.length();
        return length;
    }
}
