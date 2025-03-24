import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Font;

/**
 * This program displays a label and several images
 * in a specific order.
 * 
*/

public class AddCoins extends Application
{
	public static void main(String[] args)
	{
		launch(args);
	}

	@Override
	public void start(Stage primaryStage)
	{
		//Set the title of the stage window
		primaryStage.setTitle("AddCoins");

		// Create the label
		Label messageLabel = new 
			Label("The coins needed to make 85 cents:");

		//Set the font size of the label
		messageLabel.setFont(new Font("Arial", 32));
		

		// Importing and preparing images

		//Ten Cents
		Image image1 = new Image("file:10cents.png");
		ImageView tenCents = new ImageView(image1);

		//25 Cents
		Image image2 = new Image("file:25cents.png");
		ImageView twentyCents = new ImageView(image2);

		//50 Cents 
		Image image3 = new Image("file:50cents.png");
		ImageView fiftyCents = new ImageView(image3);

		//85 Cents
		Image image4 = new Image("file:EightyFiveCents.png");
		ImageView eightyCents = new ImageView(image4);

		//Equals Arrow
		Image image5 = new Image("file:Equal.png");
		ImageView equal = new ImageView(image5);

		//Plus Sign, includes a duplicate plus sign
		Image image6 = new Image("file:Plus.png");
		ImageView plus1 = new ImageView(image6);
		ImageView plus2 = new ImageView(image6);


		//Create the horizontal box for the label
		HBox labels = new HBox(messageLabel);

		//Create the horizontal box for all the images
		HBox images = new HBox(fiftyCents, plus1, twentyCents, plus2,
		 tenCents, equal, eightyCents);

		//Create the vertical box to stack the hbox's
		VBox vbox1 = new VBox(labels, images);

		//Create the scene
		Scene scene = new Scene(vbox1, 900, 300);

		//Align the label to the top center
		labels.setAlignment(Pos.TOP_CENTER);

		//Align the images to the center
		images.setAlignment(Pos.CENTER);

		//Set the scene to the stage
		primaryStage.setScene(scene);

		//Show the stage
		primaryStage.show();
	}
}