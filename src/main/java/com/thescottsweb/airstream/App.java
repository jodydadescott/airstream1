package com.thescottsweb.airstream;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class App extends Application {

	private static final double PREF_WIDTH_SIZE = 1024;
	private static final double PREF_HEIGHT_SIZE = 600;

	private Clock clock;
	private WWanLink verizon;

	@Override
	public void init() {

		this.clock = new Clock();
		this.verizon = new WWanLink("Verizon");

	}

	@Override
	public void start(@SuppressWarnings("exports") Stage stage) {

		var flowBox = new FlowPane();
		flowBox.setPrefSize(PREF_WIDTH_SIZE, PREF_HEIGHT_SIZE);
		flowBox.setPrefHeight(PREF_HEIGHT_SIZE);
		flowBox.setHgap(10);
		flowBox.setVgap(10);
		flowBox.setPadding(new Insets(10));

		flowBox.setBackground(new Background(new BackgroundFill(Color.BLACK, CornerRadii.EMPTY, Insets.EMPTY)));

		flowBox.getChildren().add(clock);
		flowBox.getChildren().add(verizon);

		Scene scene = new Scene(flowBox);
		scene.setCursor(Cursor.NONE);

		stage.initStyle(StageStyle.UNDECORATED);

		stage.setTitle("Airstream");
		stage.setScene(scene);
		stage.show();

	}

	@Override
	public void stop() {
		System.exit(0);
	}

	public static void main(String[] args) {
		launch(args);
	}
}