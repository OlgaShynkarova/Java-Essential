package Homework3.Task4;

public class ProDocumentWorker extends DocumentWorker {
    @Override
    public void editDocument() {
        System.out.println("Document edited.");
    }
    @Override
    public void saveDocument() {
        System.out.println("The document is saved in the old format; " +
                "saving in other formats is availablein the Expert version.");
    }
}