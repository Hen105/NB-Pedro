package org.firstinspires.ftc.teamcode.pedroPathing.constants;

import com.pedropathing.localization.*;
import com.pedropathing.localization.constants.*;
import com.qualcomm.hardware.rev.RevHubOrientationOnRobot;

public class LConstants {
    static {
        ThreeWheelConstants.forwardTicksToInches = .003;
        ThreeWheelConstants.strafeTicksToInches = .0029;
        ThreeWheelConstants.turnTicksToInches = .0029;
        ThreeWheelConstants.leftY = 7.533;
        ThreeWheelConstants.rightY = -7.533;
        ThreeWheelConstants.strafeX = -2.236;
        ThreeWheelConstants.leftEncoder_HardwareMapName = "FRMotor";
        ThreeWheelConstants.rightEncoder_HardwareMapName = "FLMotor";
        ThreeWheelConstants.strafeEncoder_HardwareMapName = "RRMotor";
        ThreeWheelConstants.leftEncoderDirection = Encoder.FORWARD;
        ThreeWheelConstants.rightEncoderDirection = Encoder.REVERSE;
        ThreeWheelConstants.strafeEncoderDirection = Encoder.REVERSE;
        ThreeWheelIMUConstants.IMU_HardwareMapName = "imu";
        ThreeWheelIMUConstants.IMU_Orientation = new RevHubOrientationOnRobot(RevHubOrientationOnRobot.LogoFacingDirection.UP, RevHubOrientationOnRobot.UsbFacingDirection.BACKWARD);

    }
}




