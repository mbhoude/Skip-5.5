package org.usfirst.frc3467.subsystems.Elevator.commands;

import org.usfirst.frc3467.subsystems.Elevator.Elevator;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class elevatorCGDropStack extends CommandGroup {
    
    public  elevatorCGDropStack() {

    	// Lift stack above Indexer
    	SmartDashboard.putString("elevatorCGDropStack", "elevatorToPosition(indexTote, 3.0)");
    	addSequential(new elevatorToPosition(Elevator.kLevelIndexTote, 3.0));

    	// Unengage Indexer
    	SmartDashboard.putString("elevatorCGDropStack", "indexerOperate(false)");
    	addSequential(new indexerOperate(false));
    	
    	// Wait a couple secs
    	SmartDashboard.putString("elevatorCGDropStack", "WaitCommand(2.0)");
    	addSequential(new WaitCommand(2.0));
    	
    	// Lower conveyor back to "resting position"
    	SmartDashboard.putString("elevatorCGDropStack", "elevatorToPosition(LevelZero, 3.0)");
    	addSequential(new elevatorToPosition(Elevator.kLevelZero, 3.0));
    	
    }
}
