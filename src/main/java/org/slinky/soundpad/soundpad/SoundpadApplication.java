package org.slinky.soundpad.soundpad;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SoundpadApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        // Carrega o arquivo FXML da nossa interface
        FXMLLoader fxmlLoader = new FXMLLoader(SoundpadApplication.class.getResource("frontend/main-view.fxml"));

        // Cria a cena com a interface carregada e define o tamanho
        Scene scene = new Scene(fxmlLoader.load(), 480, 360);

        // Define o título da janela
        stage.setTitle("Gemini Soundpad");
        stage.setScene(scene);

        // Exibe a janela
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}