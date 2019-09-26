package org.team1540.chonk;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Scheduler;
import org.team1540.chonk.commands.drivetrain.TankDrive;
import org.team1540.chonk.subsystems.Arm;
import org.team1540.chonk.subsystems.DriveTrain;

public class Robot extends TimedRobot {

    public static DriveTrain drivetrain;
    public static Arm arm;

    @Override
    public void robotInit() {
        drivetrain = new DriveTrain();
        arm = new Arm();
        Hardware.initAll();
        OI.init();
    }

    @Override
    public void teleopPeriodic() {

    }

    @Override
    public void robotPeriodic() {
        Scheduler.getInstance().run();
    }
}
