package Controllers;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import org.hibernate.Session;

import tn.esprit.domain.Eleve;
import tn.esprit.util.HibernateUtil;
import util.ScreensController;

public class MainPrinc extends Application {
	public static ScreensController mainCantainer;
	public static String g_LoginID = "Login";
	public static String g_LoginFile = "/GUI/userLogin.fxml";
	public static String g_Home = "home";
	public static String g_homeFile = "/GUI/home.fxml";
//fkfskfskd
	@Override
	public void start(Stage primaryStage) {
		try {
			mainCantainer = new ScreensController();

			mainCantainer.loadscreen(g_LoginID, g_LoginFile);

			mainCantainer.setScreen(MainPrinc.g_LoginID);
			AnchorPane root = new AnchorPane();
			root.getChildren().addAll(mainCantainer);

			Scene scene = new Scene(root, 963, 637);
			scene.getStylesheets().add(
					getClass().getResource("/GUI/styles.css").toExternalForm());
			primaryStage.setScene(scene);

			primaryStage.show();
			// Group root = (Group)
			// FXMLLoader.load(getClass().getResource("/GUI/userLogin.fxml"));
			// AnchorPane root = (AnchorPane) FXMLLoader.load(getClass()
			// .getResource("/GUI/Home.fxml"));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();

	
		launch(args);
	
	}
}
