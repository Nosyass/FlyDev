package util;

import java.io.IOException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.beans.property.DoubleProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.layout.StackPane;
import javafx.util.Duration;

/**
 *
 * @author Yasinos
 */
public class ScreensController extends StackPane {

	HashMap<String, Node> screens = new HashMap<>();

	public ScreensController() {
		super();
	}

	public void addscreen(String name, Node screen) {
		screens.put(name, screen);
		System.out.println(name);
		
	}

	public Node getScreen(String name) {
		return screens.get(name);

	}

	public boolean loadscreen(String name, String resource) {
		try {
			FXMLLoader myloader = new FXMLLoader(getClass().getResource(
					resource));

			if (	myloader!= null) {
				System.out.println("ofyyyyyyyyyyyfffff");}
			Parent loadscreen = (Parent) myloader.load();
			
			
		

			ControlledScreen myScreenControler = (ControlledScreen) myloader
					.getController();

			if (myScreenControler != null) {
				System.out.println("offffff");
			}
			myScreenControler.SetScreenParent(this);

			addscreen(name, loadscreen);

		} catch (IOException ex) {
			Logger.getLogger(ScreensController.class.getName()).log(
					Level.SEVERE, null, ex);
		}
		return false;
	}

	public boolean setScreen(final String name) {
		if (screens.get(name) != null) {
			final DoubleProperty opacity = opacityProperty();
			if (!getChildren().isEmpty()) {
				Timeline fade = new Timeline(new KeyFrame(Duration.ZERO,
						new KeyValue(opacity, 1.0)), new KeyFrame(new Duration(
						1000), new EventHandler<ActionEvent>() {

					@Override
					public void handle(ActionEvent t) {
						getChildren().remove(0);
						getChildren().add(0, screens.get(name));
						Timeline fadeIn = new Timeline(new KeyFrame(
								Duration.ZERO, new KeyValue(opacity, 0.0)),
								new KeyFrame(new Duration(800), new KeyValue(
										opacity, 1.0)));
						fadeIn.play();
					}
				}, new KeyValue(opacity, 0.0)));
				fade.play();

			} else {
				setOpacity(0.0);
				getChildren().add(screens.get(name));
				Timeline fadeIn = new Timeline(new KeyFrame(Duration.ZERO,
						new KeyValue(opacity, 0.0)), new KeyFrame(new Duration(
						2500), new KeyValue(opacity, 1.0)));
				fadeIn.play();
			}
			return true;

		} else {
			System.out.println("Screen hasn't been loaded !!! \n");
			return false;
		}
	}

	public boolean unloadScreen(String name) {
		if (screens.remove(name) == null) {
			System.out.println("Screen didn't exist");
			return false;

		} else {
			return true;
		}
	}

}
