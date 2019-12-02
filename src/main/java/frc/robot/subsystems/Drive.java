/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.commands.DriveCommand;
import edu.wpi.first.wpilibj.VictorSP;
import frc.robot.RobotMap;
import frc.robot.Robot;
/**
 * Add your docs here.
 */

 
public class Drive extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  public int flIntSlot = RobotMap.FL_MOTOR_SLOT; // channel slot for the left front motor
  public int frIntSlot = RobotMap.FR_MOTOR_SLOT; // channel slot for the front right motor
  public int blIntSlot = RobotMap.BL_MOTOR_SLOT;; // you get it 
  public int brIntSlot = RobotMap.BR_MOTOR_SLOT;; // you get it


  public VictorSP fl = new VictorSP(flIntSlot); //Front Left
  public VictorSP fr = new VictorSP(frIntSlot); //Front Right
  public VictorSP bl = new VictorSP(blIntSlot); //Back Left
  public VictorSP br = new VictorSP(brIntSlot); //Back Right

  

	public static Drive driveTrain;

  public static Drive getDriveTrain() {
		if (driveTrain == null) {
			driveTrain = new Drive();
		}
		return driveTrain;
	}

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
       setDefaultCommand(new DriveCommand());
  }

  public void setSpeed(double leftSpeed, double rightSpeed){

    /* This is setting the speeds for all of the 
    motors this will be connected to a command that
    will connect the joysticks positions to the 
    motor speeds  */

    fl.setSpeed(leftSpeed); 
    fr.setSpeed(leftSpeed);
    bl.setSpeed(leftSpeed);
    br.setSpeed(leftSpeed);


  }
}
