package com.helani.nlp;

import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

import java.util.List;

public class Lemmatization {

    public static void main(String[] args) {

        StanfordCoreNLP stanfordCoreNLP = Pipeline.getPipeline();

        // read some text in the text variable
        String text = "I am trying to learn new technologies.";

        CoreDocument coreDocument = new CoreDocument(text);

        // run all Annotators on this text
        stanfordCoreNLP.annotate(coreDocument);

        List<CoreLabel> coreLabelList = coreDocument.tokens();

        for (CoreLabel coreLabel : coreLabelList){
            String lemma =coreLabel.lemma();
            System.out.println(coreLabel.originalText() + " = " + lemma);
        }
    }
}
