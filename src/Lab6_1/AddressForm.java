package Lab6_1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class AddressForm extends Application {
	public static void main(String[] args) {
		launch(args);
	}
	
	

	@Override
	public void start(Stage form) throws Exception {
		form.setTitle("Addres Form");
		GridPane grid=new GridPane();
		grid.setMinWidth(1900);
		grid.setAlignment(Pos.TOP_CENTER);
		grid.setHgap(15);
		grid.setMinWidth(9000);
		grid.setMinSize(900, 900);
		grid.setVgap(5);
		grid.setPadding(new Insets(15,15,35,35));
		 
		Label label1=new Label("Name");
		Label label2=new Label("Street");
		Label label3=new Label("City");
		Label label4=new Label("State");
		Label label5=new Label("Zip");
		
		grid.add(label1, 0,0,1,1);
		grid.add(label2, 3,0,1,1);
		grid.add(label3, 6,0,1,1);
		grid.add(label4, 1,2,1,1);
		grid.add(label5, 5,2,1,1);
		
		
		TextField nameTF = new TextField();
		TextField streetTF = new TextField();
		TextField cityTF = new TextField();
		TextField stateTF = new TextField();
		TextField zipTF = new TextField();
		
		grid.add(nameTF, 	0,1,3,1);
		grid.add(streetTF, 	3,1,3,1);
		grid.add(cityTF, 	6,1,3,1);
		grid.add(stateTF, 	1,3,3,1);//
		grid.add(zipTF, 	5,3,3,1);
		//grid.setGridLinesVisible(true);
		
		Button btn = new Button("Submit");
		HBox hbBtn = new HBox(15);
		hbBtn.setAlignment(Pos.BOTTOM_CENTER);
		hbBtn.getChildren().add(btn);
		grid.add(hbBtn, 0, 8,10,1);
		
		btn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				System.out.println(nameTF.getText().toString());
				System.out.println(streetTF.getText().toString());
				System.out.println(cityTF.getText().toString()+"," + stateTF.getText().toString()+" "+zipTF.getText().toString());
			}
		});

		
		Scene scene = new Scene(grid, 600, 205);
		form.setScene(scene);
		form.show();
	}
}
