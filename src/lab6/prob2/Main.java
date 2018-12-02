package lab6.prob2;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		launch(args);
	}
	
	TextField txtInput=new TextField();
	TextField txtOutput=new TextField();
	
	Label lblInput=new Label("Input");
	Label lblOutput=new Label("Output");
	
	Button btnCount=new Button("Count Letters");
	Button btnReverse=new Button("Reverse Letters");
	Button btnRemoveDuplicate=new Button("Remove Duplicates");	

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		primaryStage.setTitle("String Utility");
		
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(25, 25, 25, 25));
		
		VBox hbBtn1 = new VBox(0); 
		hbBtn1.setAlignment(Pos.TOP_LEFT);		 
		hbBtn1.getChildren().add(lblInput);
		hbBtn1.getChildren().add(txtInput);
		
		VBox hbBtn2 = new VBox(0);
		hbBtn2.setAlignment(Pos.TOP_LEFT);		 
		hbBtn2.getChildren().add(lblOutput);
		hbBtn2.getChildren().add(txtOutput);
		
		btnCount.setMinWidth(150);
		btnReverse.setMinWidth(150);
		btnRemoveDuplicate.setMinWidth(150);
		
		btnCount.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				txtOutput.setText(Integer.toString(count(getInput())));
			}
		});
		
		btnReverse.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				txtOutput.setText(reverse(getInput()));
			}
		});
		
		btnRemoveDuplicate.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				txtOutput.setText(removeDuplicate(getInput()));
			}
		});
		
		grid.add(btnCount, 0, 0);
		grid.add(hbBtn1, 1, 0);
		
		grid.add(btnReverse, 0, 1);
		grid.add(hbBtn2, 1, 1);
		
		grid.add(btnRemoveDuplicate, 0, 2); 
		
		Scene scene = new Scene(grid, 600, 150);
		primaryStage.setScene(scene);

		//scene.getStylesheets().add(getClass().getResource("Login.css").toExternalForm());
		primaryStage.show();
	}
	
	private String getInput() {
		return txtInput.getText();
	}
	
	private int count(String s) {
		return s.length();
	}
	
	private String reverse(String s)
	{
		String result="";
		
		if(s.length()<=1)
			return s;		
		 
		for(int i=s.length()-1;i>=0;i--)
			result+=s.charAt(i);
		
		return result;
	}
	
	private String removeDuplicate(String s) {
		String result="";
		
		if(s.length()<=1)
			return s;
		 		
		 ArrayList<Character> al=new ArrayList<Character>();
		 
		 for(int i=0;i<s.length();i++) {
			
			 if(!al.contains(s.charAt(i))) {
				 al.add(s.charAt(i));
				 result+=s.charAt(i);
			 }
		 }
		
		return result;
	}

}
