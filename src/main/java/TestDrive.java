public class TestDrive {
    public static void main(String[] args) {
        MyHWInfo.printInfo();

        Lamp lamp = new Lamp();
        Command lampOnCommand = new LampOnCommand(lamp);

        Button btn1 = new Button(lampOnCommand);
        btn1.pressed(); // Lamp on

        Alarm alarm = new Alarm();
        Command alarmOnCommand = new AlarmOnCommand(alarm);

        Button btn2 = new Button(alarmOnCommand);
        btn2.pressed(); // Alarming...

        btn2.setCommand(lampOnCommand);
        btn2.pressed(); // Lamp on
    }
}