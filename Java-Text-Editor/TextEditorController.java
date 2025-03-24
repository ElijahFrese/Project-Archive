import javafx.fxml.FXML;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.application.Platform;
import java.io.*;
import java.util.Scanner;
import javafx.stage.FileChooser;

public class TextEditorController {

    @FXML
    private MenuItem newButton;

    @FXML
    private MenuItem openButton;

    @FXML
    private MenuItem saveButton;

    @FXML
    private MenuItem saveAsButton;

    @FXML
    private MenuItem quitButton;

    @FXML
    private RadioMenuItem monoRadio;

    @FXML
    private ToggleGroup FontGroup;

    @FXML
    private RadioMenuItem serifRadio;

    @FXML
    private RadioMenuItem sansRadio;

    @FXML
    private CheckMenuItem italicBox;

    @FXML
    private CheckMenuItem boldBox;

    @FXML
    private TextArea textArea;

    //make the font monospace by default
    public void initialize()
    {
      textArea.setStyle("-fx-font-family: monospace");
    }

    // initialize the variable for the font code
    private int fontNum;

    // initialize the variable for the filename
    private File filename;


    // responds to the event of any of the font buttons being clicked
    public void fontListener()
    {
        // resets the font code to 0
        fontNum = 0;

        // checks which radio button is selected
        if (monoRadio.isSelected())
        {
            fontNum += 1;
        }
        if (serifRadio.isSelected())
        {
            fontNum += 2;
        }
        if (sansRadio.isSelected())
        {
            fontNum += 3;
        }

        //checks if the italicbox is selected
        if (italicBox.isSelected())
        {
            fontNum+=10;
        }

        // checks whether the bold box is selected
        if (boldBox.isSelected())
        {
            fontNum+=100;
        }

        // based on the code in fontNum, sets the style to match
        // 1 = monospace
        // 2 = serif
        // 3 = sans-serif
        // 10 = italic
        // 100 = bold
        switch(fontNum)
        {
        case 1:
            textArea.setStyle("-fx-font-family: monospace;"+
                            " -fx-font-weight: normal");
            break;

        case 2:
            textArea.setStyle("-fx-font-family: serif;"+
                            " -fx-font-style: normal;"+
                            " -fx-font-weight: normal");
            break;

        case 3:
            textArea.setStyle("-fx-font-family: sans-serif;"+
                            " -fx-font-style: normal;"+
                            " -fx-font-weight: normal");
            break;

        case 11:
            textArea.setStyle("-fx-font-family: monospace;"+
                            " -fx-font-style: italic;"+
                            " -fx-font-weight: normal");
            break;

        case 12:
            textArea.setStyle("-fx-font-family: serif;"+
                            " -fx-font-style: italic;"+
                            " -fx-font-weight: normal");
            break;

        case 13:
            textArea.setStyle("-fx-font-family: sans-serif;"+
                            " -fx-font-style: italic;"+
                            " -fx-font-weight: normal");
            break;

        case 101:
            textArea.setStyle("-fx-font-family: monospace;"+
                            " -fx-font-style: normal;"+
                            " -fx-font-weight: bold");
            break;

        case 102:
            textArea.setStyle("-fx-font-family: serif;"+
                            " -fx-font-style: normal;"+
                            " -fx-font-weight: bold");
            break;

        case 103:
            textArea.setStyle("-fx-font-family: sans-serif;"+
                            " -fx-font-style: normal;"+
                            " -fx-font-weight: bold");
            break;

        case 111:
            textArea.setStyle("-fx-font-family: monospace;"+
                            " -fx-font-style: italic;"+
                            " -fx-font-weight: bold");
            break;

        case 112:
            textArea.setStyle("-fx-font-family: serif;"+
                            " -fx-font-style: italic;"+
                            " -fx-font-weight: bold");
            break;

        case 113:
            textArea.setStyle("-fx-font-family: sans-serif;"+
                            " -fx-font-style: italic;"+
                            " -fx-font-weight: bold");
            break;
        }
    }

    // responds to the New Button. 
    // wipes the textarea and the filename, and resets the font buttons.
    public void newListener()
    {
        //wipe the textarea
        textArea.setText("");
        
        // wipe the filename
        filename = null;

        //reset fonts
        textArea.setStyle("-fx-font-family: monospace");
        monoRadio.setSelected(false);
        serifRadio.setSelected(false);
        sansRadio.setSelected(false);
        italicBox.setSelected(false);
        boldBox.setSelected(false);
        fontNum = 0;


    }

    // responds to the open button
    public void openListener() throws IOException
    {
        // get the filename from the file chooser
        FileChooser filechooser = new FileChooser();
        File file = filechooser.showOpenDialog(null);
        filename = file; // set filename to the active file
        
        // create the inputfile object
        Scanner inputFile = new Scanner(file);

        // wipe the text area
        textArea.setText("");

        // read the text from the file and write it to the textarea
        while (inputFile.hasNext())
        {
            String newText;
            newText = textArea.getText() + inputFile.nextLine()+"\n";
            textArea.setText(newText);
        }
    }


    // responds to the save button
    public void saveListener() throws IOException
    {
        // make sure there is a file active
        if (filename != null)
        {
            // open the file
            PrintWriter outputFile = new PrintWriter(filename);
            // write the textarea to the file
            outputFile.print(textArea.getText());
            // close the file
            outputFile.close();
        }
        else // perform a saveas if there is no active file
        {
        // open the save filechooser
        FileChooser filechooser = new FileChooser();
        File file = filechooser.showSaveDialog(null);
        filename = file;
        // open the file
        PrintWriter outputFile = new PrintWriter(file);
        // write the textarea to the file
        outputFile.print(textArea.getText());
        // close the file
        outputFile.close(); 
        }
    }

    public void saveAsListener() throws IOException
    {
        // get the filename from the file chooser
        FileChooser filechooser = new FileChooser();
        File file = filechooser.showSaveDialog(null);
        filename = file;

        //open the file
        PrintWriter outputFile = new PrintWriter(file);

        // write the textarea to the file
        outputFile.println(textArea.getText());

        //close the file
        outputFile.close();
    }

    public void closeListener()
    {
        // close the program
        Platform.exit();
    }

}
