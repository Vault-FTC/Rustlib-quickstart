package org.firstinspires.ftc.teamcode.commands;

import org.rustlib.commandsystem.Command;
import org.rustlib.drive.DriveSubsystem;

import java.util.function.DoubleSupplier;

public class DriveDefault extends Command {
    private final DoubleSupplier drive;
    private final DoubleSupplier strafe;
    private final DoubleSupplier turn;
    private final DriveSubsystem subsystem;

    public DriveDefault(DriveSubsystem subsystem, DoubleSupplier drive, DoubleSupplier strafe, DoubleSupplier turn) {
        this.subsystem = subsystem;
        this.drive = drive;
        this.strafe = strafe;
        this.turn = turn;
        addRequirements(subsystem);
    }

    @Override
    public void execute() {
        subsystem.drive(drive.getAsDouble(), strafe.getAsDouble(), turn.getAsDouble());
    }
}
