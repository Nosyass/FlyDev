package Controllers;

import java.awt.Desktop;
import java.net.URL;
import java.util.ResourceBundle;


import util.ControlledScreen;
import util.ScreensController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;


public class userloginController implements Initializable, ControlledScreen {

    @FXML
    private ResourceBundle resources;
  public static String username ;


    @FXML
    private URL location;

    @FXML
    private PasswordField txtPass;

    @FXML
    private Button log;

    @FXML
    private TextField txtUser;

    @FXML
    private ComboBox<?> cmbAdmin;
    ScreensController screencontroller;
   
    @FXML
	private void processLogin() {
	System.out.println(txtUser.getText());
    	System.out.println( txtPass.getText());
    	try{
    // User user = ManagementDelagate.login(txtUser.getText(),txtPass.getText());

  //   if ( user.getIsAdmin()){
 // userloginController.username=user.getUsername();

    	    MainPrinc.mainCantainer.loadscreen(MainPrinc.g_Home, MainPrinc.g_homeFile);
    	    	screencontroller.setScreen(MainPrinc.g_Home);
    	    	
    	
    	     }
   //  System.out.println(user.getUsername());}
    	catch (Exception e) {
    		System.out.println(e.getMessage());
    	}

   
    
    					
	}
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
	@Override
	public void SetScreenParent(ScreensController screenpage) {
		  screencontroller = screenpage;
	
	}
	

    
  
}
