/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;
import frc.robot.Robot;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  // PS4 CONTROLLER INPUTS(USING DS4WINDOWS INPUT ADAPTER TO MAKE IT LOOK LIKE AN XBOX CONTROLLER)
  // DRIVE CONTROLLER
  public static final int XBOX_DRIVE = 0;
    
  public static final int XBOX_DRIVE_X = 2;
  public static final int XBOX_DRIVE_CIRCLE = 3;
  public static final int XBOX_DRIVE_SQUARE = 1;
  public static final int XBOX_DRIVE_TRIANGLE = 4;
  public static final int XBOX_DRIVE_LY = 1;			// left joystick
  public static final int XBOX_DRIVE_LT = 3;
  public static final int XBOX_DRIVE_LT_BUTTON = 7;
  public static final int XBOX_DRIVE_RT = 4;
  public static final int XBOX_DRIVE_RT_BUTTON = 8;
  public static final int XBOX_DRIVE_RY = 5;			// right joystick
  public static final int XBOX_DRIVE_SL = 11 ;
  public static final int XBOX_DRIVE_SR = 12 ;
  public static final int XBOX_DRIVE_RB = 6;
  public static final int XBOX_DRIVE_LB = 5;
  public static final int XBOX_DRIVE_SHARE = 9;
  public static final int XBOX_DRIVE_OPTIONS = 10;
  public static final int XBOX_DRIVE_POV_DOWN = 180;
  public static final int XBOX_DRIVE_POV_RIGHT = 90;
  public static final int XBOX_DRIVE_POV_LEFT = 270;
  public static final int XBOX_DRIVE_POV_UP = 0;

  //MANIPULATOR CONTROLLER 
  public static final int XBOX_MANIPULATE = 1;

  public static final int XBOX_MANIPULATE_X = 2;
  public static final int XBOX_MANIPULATE_CIRCLE = 3;
  public static final int XBOX_MANIPULATE_SQUARE = 1;
  public static final int XBOX_MANIPULATE_TRIANGLE = 4;
  public static final int XBOX_MANIPULATE_LY = 1;			// left joystick
  public static final int XBOX_MANIPULATE_LT = 7;
  public static final int XBOX_MANIPULATE_RT = 8;
  public static final int XBOX_MANIPULATE_RY = 5;			// right joystick
  public static final int XBOX_MANIPULATE_SL = 11;
  public static final int XBOX_MANIPULATE_SR = 12;
  public static final int XBOX_MANIPULATE_RB = 6;
  public static final int XBOX_MANIPULATE_LB = 5;
  public static final int XBOX_MANIPULATE_SHARE = 9;
  public static final int XBOX_MANIPULATE_OPTIONS = 10;
  public static final int XBOX_MANIPULATE_POV_DOWN = 180;
  public static final int XBOX_MANIPULATE_POV_RIGHT = 90;
  public static final int XBOX_MANIPULATE_POV_LEFT = 270;
  public static final int XBOX_MANIPULATE_POV_UP = 0;

  // DRIVE MOTORS
  public static int FL_MOTOR_SLOT = 0; // motor slot FL
  public static int FR_MOTOR_SLOT = 0; // motor slot FR
  public static int BR_MOTOR_SLOT = 0; // motor slot BR
  public static int BL_MOTOR_SLOT = 0; // motor slot BL

}
