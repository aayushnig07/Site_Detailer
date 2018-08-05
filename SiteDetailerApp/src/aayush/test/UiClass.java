/**
 * 
 */
package aayush.test;

import java.io.IOException;
import java.util.LinkedHashMap;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * @author aayush.n
 *
 */
public class UiClass extends Application {

	static ExcelManager excelManager=new ExcelManager();
	static Beans bean=new Beans();
	static Detailer detailer=new Detailer();
	static TextField websiteName=null;
	static Button btn=null;
	
	
	static LinkedHashMap<String,String>list=new LinkedHashMap<>();
	
	/* (non-Javadoc)
	 * @see javafx.application.Application#start(javafx.stage.Stage)
	 */
	@Override
	public void start(Stage primaryStage) throws Exception {
		Scene scene = new Scene(new Group(), 500, 250);
		primaryStage.setTitle("Website Detailer");

		//instantiate TextFields
		websiteName = new TextField ();

		//instantiate buttons
		btn=new Button("Generate");
		
		btn.setOnAction((event)->{
			bean.setName(websiteName.getText());
			try {
				list.put("ipAddress",detailer.details(bean.getName(),"ipAddress"));
				list.put("protocol",detailer.details(bean.getName(),"protocol"));
				list.put("host",detailer.details(bean.getName(),"host"));
				list.put("port",detailer.details(bean.getName(),"port"));
				list.put("query",detailer.details(bean.getName(),"query"));
				list.put("reference",detailer.details(bean.getName(),"reference"));
				bean.setList(list);
				System.out.println(list);
				excelManager.generateExcel(list);
			} catch ( IOException e) {e.printStackTrace();}
			
		});
		//instantiate gridpane, setVgap,Hgap,padding and add children
		GridPane grid = new GridPane();
		grid.setVgap(5);
		grid.setHgap(10);
		grid.add(websiteName, 1, 0);
		grid.add(btn, 2, 0);
		

		//add gridpane to group
		Group root = (Group) scene.getRoot();
		root.getChildren().add(grid);
		//set scene and show stage
		primaryStage.setScene(scene);
		primaryStage.show();

	}
	
	public static void main(String[]args) {
		Application.launch(args);
		
	}

}
