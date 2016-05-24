package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
			Button btn = new Button("Click me");
			Button exit = new Button("Exit");
			exit.setOnAction(e -> System.exit(0));
			btn.setOnAction(new EventHandler<ActionEvent>() {
				
				@Override
				public void handle(ActionEvent event) {
					System.out.println("Hello World!");
				}
			});
			VBox root = new VBox();
			root.getChildren().addAll(btn, exit);
			Scene scene = new Scene(root,300,200);
			primaryStage.setTitle("Hello World");
			primaryStage.setScene(scene);
			primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
