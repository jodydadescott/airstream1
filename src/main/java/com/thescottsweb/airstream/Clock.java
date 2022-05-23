package com.thescottsweb.airstream;

import eu.hansolo.medusa.ClockBuilder;
import eu.hansolo.medusa.Clock.ClockSkinType;
import javafx.scene.layout.Pane;

public class Clock extends Pane {

	private eu.hansolo.medusa.Clock clock;

	public Clock() {
		super();

		var builder = ClockBuilder.create().skinType(ClockSkinType.SLIM).running(true);

		// var builder =
		// ClockBuilder.create().skinType(ClockSkinType.ROUND_LCD).running(true);
		// builder.hourColor(Color.rgb(38, 166, 154));
		// builder.minuteColor(Color.rgb(77, 182, 172));
		// builder.secondColor(Color.rgb(128, 203, 196));
		// builder.textColor(Color.rgb(128, 203, 196));
		// builder.dateColor(Color.rgb(128, 203, 196));
		// builder.nightMode(false);

		this.clock = builder.build();

		this.getChildren().add(this.clock);

	}

}
