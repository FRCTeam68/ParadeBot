/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;
import edu.wpi.first.wpilibj.GenericHID.Hand;
//import edu.wpi.first.wpilibj.GenericHID.RumbleType;
import edu.wpi.first.wpilibj.XboxController;
//import edu.wpi.first.wpilibj.buttons.Button;
//import edu.wpi.first.wpilibj.buttons.JoystickButton;
//import edu.wpi.first.wpilibj.buttons.POVButton;

public class OI {
	// Driver's Xbox Controller
	private XboxController xboxDrive;
	/*private POVButton xboxDrivePOVUp;
	private POVButton xboxDrivePOVDown;
	private POVButton xboxDrivePOVLeft;
	private POVButton xboxDrivePOVRight;
	private Button xboxDriveRB;
	private Button xboxDriveLB;
	private Button xboxDriveRTButton;
	private Button xboxDriveLTButton;
	private Button xboxDriveTriangle;
	private Button xboxDriveCircle;
	private Button xboxDriveSquare;
	private Button xboxDriveX;
	private Button xboxDriveStart;
	private Button xboxDriveSL;
	private Button xboxDriveSR;
	//private Button xboxDriveSelect;

	private XboxController xboxManipulate;
	private Button xboxManipulateLB;
	private Button xboxManipulateSquare;
	private Button xboxManipulateTriangle;
	private Button xboxManipulateRB;
	private Button xboxManipulateX;
	private Button xboxManipulateCircle;
	private Button xboxManipulateSL;
	private Button xboxManipulateSR;
	private Button xboxManipulateLT;
	private Button xboxManipulateRT;
	private Button xboxManipulateShare;
	private Button xboxManipulateStart;
	private POVButton xboxManipulatorPOVUp;
	private POVButton xboxManipulatorPOVLeft;
	private POVButton xboxManipulatorPOVRight;
	private POVButton xboxManipulatorPOVDown;
	//private Button xboxManipulateSR;
	*/
  private static OI m_oi;
  
	public static OI getOI(){
		if (m_oi == null) {
			m_oi = new OI();
		}
		return m_oi;	
  }
  
  public double getLeftXboxJoystickValue() {
		double leftAxis;
		leftAxis = xboxDrive.getY(Hand.kLeft);
		// Allow for up to 10% of joystick noises
		leftAxis = (Math.abs(leftAxis) < 0.1) ? 0 : leftAxis;
    	return leftAxis;
	}

	// Drivetrain Tank Drive Right
	public double getRightXboxJoystickValue() {
		double rightAxis;
		rightAxis = xboxDrive.getY(Hand.kRight);
		// Allow for up to 10% of joystick noise
		rightAxis = (Math.abs(rightAxis) < 0.1) ? 0 : rightAxis;
    	return rightAxis;
    	
	}
}
