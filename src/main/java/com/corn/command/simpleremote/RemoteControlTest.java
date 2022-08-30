package com.corn.command.simpleremote;

public class RemoteControlTest {
	// 커맨드 패턴에서 클라이언트(Client)에 해당하는 부분
	public static void main(String[] args) {
		// 인보커(Invoker) 역할 - 필요한 작업을 요청할 때 사용할 커맨드 객체를 인자로 전달 받음
		SimpleRemoteControl remote = new SimpleRemoteControl();

		// 요청을 받아서 처리할 리시버(Receiver) 들 - 실제 요청 처리는 리시버가 맡아한다.
		Light light = new Light();
		GarageDoor garageDoor = new GarageDoor();

		// 커맨드 객체를 생성하면서 리시버(Receiver)를 전달해 준다.
		LightOnCommand lightOn = new LightOnCommand(light);
		GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);

		// 클라이언트는 커맨드 객체를 인보커(Invoker)에 전달 후 인보커는 실행
		remote.setCommand(lightOn);
		remote.buttonWasPressed();

		remote.setCommand(garageOpen);
		remote.buttonWasPressed();
    }
	
}
