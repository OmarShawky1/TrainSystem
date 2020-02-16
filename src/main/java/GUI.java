import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class GUI extends Application {

    Stage mainWindow;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        mainWindow = primaryStage;

        showAvailableSeatsScene();

        createMainWindowDefaultSettings();
    }

    private void showAvailableSeatsScene() {

        
    }

    private void addPassengerScene() {

        //creating entries
        VBox firstName = createField("First Name", "T");

        VBox lastName = createField("Last Name", "T");

        VBox classType = createField("Train Class Type", "C");
        ComboBox classTypeComboBox = (ComboBox) classType.getChildren().get(1);
        classTypeComboBox.getItems().addAll("VIP", "First Class", "Second  Class", "Third Class");
        classTypeComboBox.setValue("Second Class");

        VBox trainDay = createField("Train Day", "C");
        ComboBox trainDayComboBox = (ComboBox) trainDay.getChildren().get(1);
        LocalDate localDate = LocalDate.of(2020, Month.JANUARY, 1);
        trainDayComboBox.setValue(localDate);
        for (int i = 0; i < 30; i++) {
            trainDayComboBox.getItems().addAll(localDate);
            localDate = localDate.plusDays(1);
        }

        VBox trainTime = createField("Train Time", "C");
        ComboBox trainTimeComboBox = (ComboBox) trainTime.getChildren().get(1);
        LocalTime localTime = LocalTime.of(0, 0);
        trainTimeComboBox.setValue(localTime);
        for (int i = 0; i < 95; i++) {
            localTime = localTime.plusMinutes(15);
            trainTimeComboBox.getItems().addAll(localTime.toString());
        }

//        Button addPassenger = new Button("Buy Ticket")

        VBox allComponents = new VBox();
        allComponents.setSpacing(20);
        allComponents.getChildren().addAll(firstName, lastName, classType, trainDayComboBox, trainTime);

        //adding them to the middle using grid pane and adding this grid pane to center
        GridPane gridPane = defaultGridPane(allComponents);

        BorderPane borderPane = defaultBorderPane("Add Passenger", gridPane);
        mainWindow.setScene(new Scene(borderPane));
    }

    private GridPane defaultGridPane(Node allComponents) {
        GridPane gridPane = new GridPane();
        int DEFAULTSPACING = 5;
        gridPane.setVgap(DEFAULTSPACING);
        gridPane.setHgap(DEFAULTSPACING);
        gridPane.setAlignment(Pos.CENTER);
        gridPane.getChildren().addAll(allComponents);
        return gridPane;
    }

    private BorderPane defaultBorderPane(String sceneTitle, GridPane gridPane) {
        BorderPane borderPane = new BorderPane();
        borderPane.setPadding(new Insets(40));

        Label sceneLabel = new Label(sceneTitle);
        sceneLabel.setFont(Font.font("Tahoma", FontWeight.NORMAL, 30));
        borderPane.setTop(sceneLabel);
        BorderPane.setAlignment(sceneLabel, Pos.CENTER);

        borderPane.setCenter(gridPane);
        return borderPane;
    }

    private VBox createField(String string, String t) {
        //general function to create any horizontal label with it's entry

        //creating entity label
        Label label = new Label(string);

        //creating entity entry
        t = t.toUpperCase();
        Node field;
        switch (t) {
            case "T": //for text field
                field = new TextField();
                break;
            case "C": //for checkBox
                field = new ComboBox<String>();
                break;
            case "P": // for password field; will never be used, just trying to use switch
                field = new PasswordField();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + t);
        }

        //adding label and entry to VBox
        VBox vBox = new VBox();
        vBox.getChildren().addAll(label, field);
        vBox.setSpacing(5);
        return vBox;
    }

    private void createMainWindowDefaultSettings() {
        int SQUARE = 500;
        mainWindow.setTitle("Train System");
        mainWindow.setHeight(SQUARE);
        mainWindow.setWidth(SQUARE);
        mainWindow.show();
    }
}
