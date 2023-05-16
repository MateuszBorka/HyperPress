package com.example.hyperpress.huffman1;

import javafx.event.ActionEvent;
import javafx.stage.FileChooser;
import java.io.File;

public class OpenController {



    public void onOpenFileToRead(ActionEvent actionEvent) {

        // Create a file chooser dialog
        FileChooser fileChooser = new FileChooser();
        // Set the title of the dialog
        fileChooser.setTitle("Open File");
        // Set the initial directory for the dialog (optional)
        fileChooser.setInitialDirectory(new File(System.getProperty("user.home")));
        // Add file filters to the dialog (optional)
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("Text Files", "*.txt"));
        // Show the dialog and wait for user to choose a file
        File selectedFile = fileChooser.showOpenDialog(null);
        if (selectedFile != null) {
            // Do something with the selected file
            System.out.println("Selected file: " + selectedFile.getAbsolutePath());
        }

        String ranPath = System.getProperty("user.dir");

    }
}