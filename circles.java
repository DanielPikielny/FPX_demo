package application;

import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class circles {

	public static void main(String[] args) {
		Launch();
	}
	public void start (Stage primaryStage) throws exception{
		StackPane pane = new StackPane();
		for(int i = 1; i < 10; i++) {
			Circle c = new Circle(i * 10, Color.TRANSPARENT);
			c.setStroke(Color.color(Math.random(), Math.random(), Math.random()));
			c.setStrokeWidth(4);
			pane.getChildren.Add(c);
		}
		Scene scene = new Scene(pane, 300, 300);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Circles");
		primaryStage.setResizable(false);
		primaryStage.centerOnScreen();
		primaryStage.setAlwaysOnTop
		primaryStage.show();
	}

}
