package Home;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {

    private static double xOffset = 0;
    private static double yOffset = 0;
    @Override
    public void start(Stage window) throws Exception{

        Parent root = FXMLLoader.load(getClass().getResource("fxml/MainScreen.fxml"));


        root.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                xOffset = window.getX() - event.getScreenX();
                yOffset = window.getY() - event.getScreenY();
            }
        });

        root.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                window.setX(event.getScreenX() + xOffset);
                window.setY(event.getScreenY() + yOffset);
            }
        });

        Scene principalScene = new Scene(root,720,520);
        principalScene.getStylesheets().add("Home/css/Principal.css");
        window.setTitle("DomiDay");
        window.setScene(principalScene);

        window.sizeToScene();
        window.show();

    }




    public static void main(String[] args) {
        launch(args);
    }
}
