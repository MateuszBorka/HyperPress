package com.example.hyperpress.huffman1;

import javafx.event.ActionEvent;
import javafx.stage.FileChooser;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class FileController {



    public File openFile(ActionEvent actionEvent) {

        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open File");
        fileChooser.setInitialDirectory(new File(System.getProperty("user.home")));
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("Text Files", "*.txt"));
        File selectedFile = fileChooser.showOpenDialog(null);
        if (selectedFile != null) {
            System.out.println("Selected file: " + selectedFile.getAbsolutePath());
        }

        return selectedFile;

    }

    public void copyFileToRead(ActionEvent actionEvent){

        File inputFile = openFile(actionEvent);
        if (inputFile != null) {
            Path sourceFile = inputFile.toPath();
            Path targetFile = new File("").toPath().resolve(inputFile.getName());
            try {
                Files.copy(sourceFile, targetFile, StandardCopyOption.REPLACE_EXISTING);
                System.out.println("File copied successfully.");
            } catch (IOException e) {
                System.err.println("Error copying file: " + e.getMessage());
            }
        }
    }

    public void copyFileToWrite(ActionEvent actionEvent){

        File inputFile = openFile(actionEvent);
        if (inputFile != null) {
            Path sourceFile = inputFile.toPath();
            Path targetFile = new File("").toPath().resolve(inputFile.getName());
            try {
                Files.copy(sourceFile, targetFile, StandardCopyOption.REPLACE_EXISTING);
                System.out.println("File copied successfully.");
            } catch (IOException e) {
                System.err.println("Error copying file: " + e.getMessage());
            }
        }
    }


    public void startProcess(ActionEvent actionEvent) {
    }
}