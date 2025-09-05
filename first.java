//import jreStuff.Application;
//import jreStuff.Insets;
//import jreStuff.Scene;
//import jreStuff.Stage;
//import jreStuff.TextField;
//import jreStuff.VBox;
//import jreStuff.exception;
//import jreStuff.primaryStage;

public class first extends Application{

	public static void main(String[] args) {
		Launch();
	}
	
	public void start (Stage primaryStage) throws exception{
		TextField tf1 = new TextField();
		tf1.setStyle("-fx-border-color:red; -fx-border-width:4; -fx-text-fill:red; -fx-font-weight:bold; -fx-background-color:lightblue");
		TextField tf2 = new TextField();
		tf2.textProperty().bind(tf1.textProperty());
		tf2.setEditable(false);
		VBox vbox = new VBox(30, tf1, tf2);
		VBox.setPadding(new Insets(40));
		Scene scene = new Scene(vbox, 300, 200);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Q1");
		primaryStage.setResizable(false);
		primaryStage.centerOnScreen();
		primaryStage.setAlwaysOnTop
		primaryStage.show();
	}
}
