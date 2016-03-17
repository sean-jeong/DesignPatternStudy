package com.tare.designpattern.command;

public class RemoteLoader {

	public static void main(String[] args) {
		RemoteControl remoteControl = new RemoteControl();

		// Receiver Object
		Light livingRoomLight = new Light("Living Room");
		Stereo stereo = new Stereo("Living Room");
		CeilingFan ceilingFan = new CeilingFan("Living Room");

		// Command Object
		LightOffCommand lightOffCommand = new LightOffCommand(livingRoomLight);
		LightOnCommand lightOnCommand = new LightOnCommand(livingRoomLight);

		StereoOffWithCDCommand streoOffCommand = new StereoOffWithCDCommand(stereo);
		StereoOnWithCDCommand streoOnCommand = new StereoOnWithCDCommand(stereo);

		CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);

		// Invoker
		remoteControl.setCommand(0, lightOnCommand, lightOffCommand);
		remoteControl.setCommand(1, streoOnCommand, streoOffCommand);
		remoteControl.setCommand(2, ceilingFanHighCommand, ceilingFanOffCommand);

		System.out.println(remoteControl);

		// Execute
		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		remoteControl.undoButtonWasPushed();

		remoteControl.onButtonWasPushed(1);
		remoteControl.offButtonWasPushed(1);

		remoteControl.onButtonWasPushed(2);
		remoteControl.offButtonWasPushed(2);
		System.out.println(remoteControl);
		remoteControl.undoButtonWasPushed();

	}

}
