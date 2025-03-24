import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.collections.ObservableList;


public class ConferenceRegistration extends Application
{
	private double total=0;
	private RadioButton genRadio, stuRadio;
	private Label totalLabel;
	private ListView<String> workshops;
	private CheckBox check;

	public static void main(String[] args)
	{
		launch(args);
	}

	@Override
	public void start(Stage primaryStage)
	{
		// create radio buttons
		genRadio = new RadioButton("General Registration");
		stuRadio = new RadioButton("Student Registration");
		
		//create toggle group
		ToggleGroup radioGroup = new ToggleGroup();
		genRadio.setToggleGroup(radioGroup);
		stuRadio.setToggleGroup(radioGroup);

		//create checkbox
		check = new CheckBox("Opening night dinner");

		//create labels
		Label listLabel = new Label("Select an optional workshop:");
		totalLabel = new Label("Cost: $"+total);

		//create listview
		workshops = new ListView<>();

		workshops.getItems().addAll("Introduction to E-Commerce",
			"The Future of the Web", "Advanced Java Programming",
			"Network Security");

		workshops.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);


		//create calculate button
		Button calcButton = new Button("Calculate Cost");

		//register calculate button
		calcButton.setOnAction(new calcHandler());

		//create vbox
		VBox vbox = new VBox(10,genRadio, stuRadio, check, listLabel,
			workshops, totalLabel, calcButton);

		vbox.setPadding(new Insets(10));
		vbox.setAlignment(Pos.CENTER);
		workshops.setPrefSize(100,200);


		//create scene
		Scene scene = new Scene(vbox, 300, 450);
		
		//create stage
		primaryStage.setScene(scene);

		//display stage
		primaryStage.show();

	}

	private class calcHandler implements EventHandler<ActionEvent>
	{
		@Override
		public void handle(ActionEvent event)
		{
			//add the radio to the total
			if (genRadio.isSelected())
			{
				total+=895;
			}
			if (stuRadio.isSelected())
			{
				total +=495;
			}
			//add the checkbox to the total
			if (check.isSelected())
			{
				total+=30;
			}
			//add the listview to the total
			
			ObservableList<Integer> indexList = workshops.getSelectionModel().getSelectedIndices();

			for (int i = 0; i<indexList.size(); i++)
			{
				int currentIndex = indexList.get(i);

				switch (currentIndex)
				{
					case 0:
						total+=295;
						break;
					case 1:
						total+=295;
						break;
					case 2:
						total+=395;
						break;
					case 3:
						total+=395;
						break;
				}
			}

			//update the displayed cost
			totalLabel.setText("Cost: $"+total);

			total = 0;

		}
	}
}