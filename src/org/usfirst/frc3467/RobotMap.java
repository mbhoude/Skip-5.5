package org.usfirst.frc3467;

//import org.usfirst.frc3467.subsystems.Elevator.Elevator;
//import org.usfirst.frc3467.subsystems.Elevator.Indexer;

//import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class RobotMap {
	
	// CAN IDs

	public static final int driveTrainCANTalonFL = 1;
	public static final int driveTrainCANTalonRL = 2;
	public static final int driveTrainCANTalonFR = 3;
	public static final int driveTrainCANTalonRR = 4;
	public static final int winchDriveCANTalon = 5;
	public static final int winchSlaveCANTalon = 6;
	public static final int cangrabWinchCANTalon = 7;
	
	// PWM Out
	public static final int conveyorVSP = 0;
	public static final int flippyThingMotor = 1;
	
	//PDP Slots
	public static final int flippyThingMotorPDPCHANNEL = 0;
	
	// Solenoid
	public static final int indexerDisengage = 0;
	public static final int indexerEngage = 1;
	
	// Analog
	public static final int dbGyro = 1; // ////////// Gyro
	
	// Digital I/0
	public static final int elevBottomLimitSwitch = 0;

	// Constants
	public static final double armMaxSpeed = 0.5;
	public static double pickUpMaxSpeed = 0.3;
	public static double softShotSpeed = 0.2;
	
	public static void updateSensors() {
		// SmartDashboard.putNumber("Indexer Pot", Indexer.getInstance().pot.pidGet());
		// SmartDashboard.putNumber("Arm Pot", Elevator.getInstance().pot.pidGet());
		// SmartDashboard.putNumber("Back Pickup Pot", RollerBack.getInstance().pot.pidGet());
		// SmartDashboard.putNumber("Front Pickup Pot", Conveyor.getInstance().frontPot.pidGet());
		// SmartDashboard.putNumber("Front Pickup Pot", Conveyor.getInstance().frontPot.get());
	}
	
}
