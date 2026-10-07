import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PrimeCheck extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Set the window title
        primaryStage.setTitle("Prime Number Checker");

        // Create UI controls
        Label instructionLabel = new Label("Enter a numeric value:");
        TextField inputField = new TextField();
        Button processButton = new Button("Process");
        Label outputField = new Label();
        outputField.setStyle("-fx-font-weight: bold; -fx-text-fill: blue;");

        // Set action for the button
        processButton.setOnAction(event -> {
            try {
                int number = Integer.parseInt(inputField.getText());
                if (isPrime(number)) {
                    outputField.setText(number + " is a Prime Number.");
                } else {
                    outputField.setText(number + " is Not a Prime Number.");
                }
            } catch (NumberFormatException e) {
                outputField.setText("Error: Please enter a valid number!");
                outputField.setStyle("-fx-font-weight: bold; -fx-text-fill: red;");
            }
        });

        // Arrange controls vertically
        VBox layout = new VBox(15);
        layout.setPadding(new Insets(20));
        layout.setAlignment(Pos.CENTER);
        layout.getChildren().addAll(instructionLabel, inputField, processButton, outputField);

        // Create and set the scene
        Scene scene = new Scene(layout, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // Helper method to check if a number is prime
    private boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
