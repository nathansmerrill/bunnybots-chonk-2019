package org.team1540.chonk.commands.drivetrain;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.command.Command;
import org.team1540.chonk.OI;
import org.team1540.chonk.Robot;
import org.team1540.rooster.Utilities;

public class TankDrive extends Command {

    public TankDrive() {
        requires(Robot.drivetrain);
    }

    @Override
    protected void initialize() {
        System.out.println("Starting Tank Drive");
    }

    @Override
    protected void execute() {
        double triggerThrottle = OI.getTriggerThrottle();
        double throttleLeft = triggerThrottle + OI.getJoystick(GenericHID.Hand.kLeft, OI.Axis.Y);
        double throttleRight = triggerThrottle + OI.getJoystick(GenericHID.Hand.kRight, OI.Axis.Y);
        Robot.drivetrain.setThrottle(throttleLeft, throttleRight);
    }

    @Override
    protected boolean isFinished() {
        return false;
    }
}
