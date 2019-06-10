package com.helani.nlp;

import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.CoreSentence;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

import java.util.List;

public class SentenceRecognizer {

    public static void main(String[] args) {

        StanfordCoreNLP stanfordCoreNLP = Pipeline.getPipeline();

        // read some text in the text variable
        String text = "Hey! I am Helani Waidyarathne. I am Software Engineer.";

        CoreDocument coreDocument = new CoreDocument(text);

        // run all Annotators on this text
        stanfordCoreNLP.annotate(coreDocument);

        List<CoreSentence> sentences = coreDocument.sentences();

        for (CoreSentence sentence : sentences){
            System.out.println(sentence.toString());
        }
    }
}
