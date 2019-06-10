package com.helani.nlp;

import edu.stanford.nlp.ling.CoreAnnotations;
import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.CoreSentence;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

import java.util.List;

public class SentimentAnalysis {

    public static void main(String[] args) {

        StanfordCoreNLP stanfordCoreNLP = Pipeline.getPipeline();

        // read some text in the text variable
        String text = "Hello this is Helani. I don't like this place.";
        String text1 = "Hello this is Helani. I really don't like this place.";

        CoreDocument coreDocument = new CoreDocument(text1);

        // run all Annotators on this text
        stanfordCoreNLP.annotate(coreDocument);

        List<CoreSentence> sentences = coreDocument.sentences();

        for (CoreSentence sentence : sentences){
            String sentiment = sentence.sentiment();
            System.out.println(sentiment + "\t" + sentence);
        }
    }
}
