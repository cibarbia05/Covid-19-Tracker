package Main;

import View.MainView;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        MainView m = new MainView();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
