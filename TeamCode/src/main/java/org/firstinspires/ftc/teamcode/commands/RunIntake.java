package org.firstinspires.ftc.teamcode.commands;

import org.firstinspires.ftc.teamcode.subsystems.Intake;
import org.rustlib.commandsystem.Command;

public class RunIntake extends Command {
    private final Intake subsystem;
    private final double speed;

    public RunIntake(org.firstinspires.ftc.teamcode.subsystems.Intake subsystem, double speed) {
        this.subsystem = subsystem;
        this.speed = speed;
        addRequirements(subsystem);
    }

    @Override
    public void execute() {
        subsystem.run(speed);
    }
}
