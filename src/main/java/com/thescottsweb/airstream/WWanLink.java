package com.thescottsweb.airstream;

import eu.hansolo.medusa.GaugeBuilder;
import eu.hansolo.medusa.Gauge.SkinType;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class WWanLink extends VBox {

	private Text text = new Text();

	public WWanLink() {
		super();
		init("");
	}

	public WWanLink(String text) {
		super();
		init(text);
	}

	private void init(String textString) {

		text.setText(textString);

		text.setFont(Font.font("Verdana", 20));

		getChildren().add(text);

		text.setFill(Color.WHITE);

		prefHeightProperty().bindBidirectional(text.wrappingWidthProperty());

		var builder = GaugeBuilder.create().skinType(SkinType.CHARGE).titleColor(Color.WHITE);
		builder.scaleX(.5).scaleY(.5);

		getChildren().add(builder.build());

	}

}
