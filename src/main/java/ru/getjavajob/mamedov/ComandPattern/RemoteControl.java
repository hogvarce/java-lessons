package ru.getjavajob.mamedov.ComandPattern;

/**
 * Created by Ganzhenko on 01.11.2016.
 */
public class RemoteControl {
    Command[] onCommand;
    Command[] offCommand;

    public RemoteControl() {
        onCommand = new Command[7];
        offCommand = new Command[7];

        Command noCommand = new Command();
        for (int i = 0; i < 7; i++) {
            onCommand[i] = noCommand;
            offCommand[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommand[slot] = onCommand;
        offCommand[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommand[slot].execute();
    }

    public void offButtonWasPushed(int slot) {
        offCommand[slot].execute();
    }

    public String toString() {
        StringBuffer str = new StringBuffer();
        str.append("\n-----Remote Control-----\n");
        for (int i = 0; i < onCommand.length; i++) {
            str.append("[slot " + i + "] " + onCommand[i].getClass().getName() + "  " + offCommand[i].getClass().getName() + "\n");
        }
        return str.toString();
    }
}
