/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

/*
  ______  _____    _____   _____  _____  ___    ___  
 |  ____||  __ \  / ____| | ____|| ____|/ _ \  / _ \ 
 | |__   | |__) || |      | |__  | |__ | (_) || (_) |
 |  __|  |  _  / | |      |___ \ |___ \ \__, | \__, |
 | |     | | \ \ | |____   ___) | ___) |  / /    / / 
 |_|     |_|  \_\ \_____| |____/ |____/  /_/    /_/  
   _____               _    _               _        
  / ____|             | |  (_)             | |       
 | (___    ___  _ __  | |_  _  _ __    ___ | | ___   
  \___ \  / _ \| '_ \ | __|| || '_ \  / _ \| |/ __|  
  ____) ||  __/| | | || |_ | || | | ||  __/| |\__ \  
 |_____/  \___||_| |_| \__||_||_| |_| \___||_||___/  
  ____   _   _   _____  _    _   _____               
 |  _ \ | \ | | / ____|| |  | | / ____|              
 | |_) ||  \| || |     | |__| || (___                
 |  _ < | . ` || |     |  __  | \___ \               
 | |_) || |\  || |____ | |  | | ____) |              
 |____/ |_| \_| \_____||_|  |_||_____/               

MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWNXK0OkxxdoooooooooooooodxxkO0KXNWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM
MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWX0Oxol:;,,',:llllllllllol,'''''''',,;cloxOKNWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM
MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWNKkdl:;,'.''',,;cxd:;;;;;,,;lxocccc:::;;,,',;:::cldkKNWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM
MMMMMMMMMMMMMMMMMMMMMMMMMMMMMNKkoc;:cllooc::clooddko'':odc,''ckOOOOOOkkxdooodolllllc::cokKNMMMMMMMMMMMMMMMMMMMMMMMMMMMMM
MMMMMMMMMMMMMMMMMMMMMMMMMWN0dc::clllc:,,oxxkO0KKXKOo,'cxkd,.':xKWMMWWWNNXKOko;',;;:cloo:,,cd0NMMMMMMMMMMMMMMMMMMMMMMMMMM
MMMMMMMMMMMMMMMMMMMMMMMN0dc;:lddl:,;cc;',okKWMMMMN0o,.:xkd;..;x0NNWMMMMMMN0x;',oxdlccoxo:,'',cd0NMMMMMMMMMMMMMMMMMMMMMMM
MMMMMMMMMMMMMMMMMMMMWKxl:;lollxkc''ckkd;',oOXWMMMWKd;.:dkd:..;oxdk0XWMMMWKx:',oOKNXKK0Oxdollolc:lxKWMMMMMMMMMMMMMMMMMMMM
MMMMMMMMMMMMMMMMMMW0o:codxkd;';dkc',lxkd;';oOXWMMWKxc;cxkxo::clc:okXWMMWKkc''ck0XWWMWWX0kdl:;:odc,;o0WMMMMMMMMMMMMMMMMMM
MMMMMMMMMMMMMMMMN0l;:oo:,:okx:',ox:',oxxo;':x0NMMWNK0O00KKKKKKK000KNMMMWKxc,';cldk0KK0xo:,''''cxo;'';o0NMMMMMMMMMMMMMMMM
MMMMMMMMMMMMMMW0l;:oo:,;;,':dkl,'co;',oxxdodOKNMMMMWWWWMMMMMMMMMMMMMMMMMNK0kdlc:;lkko:,';lo:',dkxolllc:l0WMMMMMMMMMMMMMM
MMMMMMMMMMMMW0o;:ooc,'cxxo:'':ol,';cccdO0KXNWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWNXK0kOkl;;ldkOd,'ck0Okdlcooc;o0WMMMMMMMMMMMM
MMMMMMMMMMMXd::ooc,,,';ldxxo:,';cc:llodkOKNWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWNKOxolcodc:c;';dOkxc,'',:oo::dXMMMMMMMMMMM
MMMMMMMMMWOc:ooc,,lxdc,';ldxxoccllodxxxxxxxxxOOOOOOOOO000KXXXXXKK00OOOOOOOOOkxxxxxxxxdl;'..,oko:,';ldo;,cdl;cOWMMMMMMMMM
MMMMMMMMXd,':do;',cdxxdc,';lollodOKKK000000OxdlcodxkkkkkkkkkkkkxxxkkkkxxolloxO000000KKKOxl,,c:',:l::oo;''cxl;;dXMMMMMMMM
MMMMMMW0c''.,lxdl;',cdxkdc'':dOKK00OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO000KOdc,,oxc'','';oxxddl;lKWMMMMMM
MMMMMWO:,;::ldxkOxl;',cooclx0K00OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO000kol;',oxddxdc;,:dl;c0WMMMMM
MMMMWk;,ldlllooxkxkxo;';okKK0OOOOOOOOOOOxdodkOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOkxooxkOOOOOOOOOOO0KOo;cddl:,',::,;oo;:OWMMMM
MMMWk;,ld:'.',,,,;;::',dKXX0OOOOOOO00Oxoc;;cdkOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOxl;;codO000OOOOOOO0XXO:'.';cldkkc';oo;:OWMMM
MMWO:''cdl;'':odol,',,':ok0KK00000KKkollodxkOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOkdoollx0KK00000K0Odc,..;dkxdlc,''cxc':0WMM
MM0c''';oxdl,':oOx::dOkdclxO00KXXKOollodkOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOkxdollxKXXK00Oxocldo:':c;,',:ldkxo:,cKMM
MXo';llodxOOxc,'cdxk0NMWKOkkxxxkxollodxkOOkxxxxkkOOOOkdoxkOOOOOkkdoxOOOOOOOkkkkOOOxdolcldxkxxxkO0NNKxc'';coddolc:ldc,oNM
Wk,,odcclodxkkxc,ck0NMMMMMWXo,;cclodxkOkdoollcc:coxOOOxlc:::::::cldkOOOkdolloooddxOkxdollc:,c0WMMMMWKOo:::;,'',,,'ld;;kW
Kc':xo:;,'',;:lllx0NMMWWWNXk;,loodkOOOOkkkOOOOkdl::okOOOOxolccoxkOOOOkdlldkOOOOOkkOOOOkxdol:,dKNNWWWN0x:.,:llodko,;do,lX
x,',cdxxxdolc;'':odkkkxdol:,,:odkOOOOOO0000000OOOkoclxOOOOOOOOOOOOOOxooxOOOO000000OOOOOOkxol,':cloxxkxo:';dkdoll:''cd:,k
l';:ldxk0K0OOl';oxdl::ccc:,.;ldkOOOOO000OOO00KK0OOOkoldkOOOOOOOOOOkdoxOOO0KKK0OOO000OOOOOOxo:'':lllccloo:',;,'',;:cod:'l
;,odlclloodddlcdOXWXOo:,;;'':okOOOOOO0Oxdlccox0K00OOOkxxkOOOOOOOOkxkOOOO0KKkolccoxO0OOOOOOOdc,';:;;lkKX0dc:ccldxkkkxxo;;
':dc'',,''''''cxKWMMMWKkl,.,cdkOOOOOOOOkxoxOo:lxO000OOOOOO0OOO00OOOOO000Oko:ckOodkkOOOOOOOOxo;.'cd0NMMWKOoldxkOK0Od:cdc'
'cd:'lxddooolldkXWMMMMMMNo',lxOOOOOOOOOOoxN0;.':lxkOO00KK0xxOkxOKK00OOOxo:'.,kNOlkOOOOOOOOOko:.:KMMMMMWXOl'',;cloxo,;dl'
'ld;':llooodddxONMMMMMMMNo.;lxOOOOOOOkdxooOkc;ldc;;:cloll;;okx:;clolc::;:oo;;x0doddxOOOOOOOkd:':KMMMMMMXOo';ll:;,,,',oo,
,od:,,,''''',;oOXMMMMMMMNo.;oxOOxddxOOxl::;:clddl:;;,'....,;::;''''',;;:codol:;;:cokOkxdxkOkd:.:0MMMMMMN0o,;dO0Oxl:,;od;
'lxxxddddddoclx0NMMMMMMWKc.,oxdlcoxOOkol::::codxkOOxl;.............:ldkOkxdoc::::coxOOkdlcoxd:.;OWMMMMMW0xloxO00koodxxo,
,lxooxkxlokkc;oOXMMMWKOdl;.,c:;cdkOOkdxkkkxkOkxkOOOOxdl;.........,coxkOOOkxkOOkxkkxdxkOOko;;c;.,cdk0NWMN0d:;;;:c:;:lodc'
'ld:,oOo,;xkc'ckKX0kdlcll:..''cdkOOOOkxxOOOOkooO0OOOOxxkdllllllloxxxkOOOO0dlxOOOOkxxkOOOOxl,'..;lolldk00Ol',;,;::;,',do,
':dc'lkd;,lxc':xOOdlc:;,''...;lxOOOOkdokOOOxdclO0OOkxxOxdxOkxkOkdxOkxkOO00ocoxkOOOdoxOOOOkd:....',;:cldddc';lllodxc';dl'
';dl',;;'''''';dKNWNXKOkdo:..:odOOOOdld0Okdlc,,dKK0xoxOkkO0xoxOOkkOkddO0Kk;,:loxO0klokOOOkoc'.;ldxO0XNNKd;.',;:ll:,'cd:'
,,odc:ccllolc::dOXMMMMMMMMXl.,coxOOxloO0Odc:..:lxO0KK0000Okl;cxO000KKKK0koc'.;cok00xcokOkdl;.:0WMMMMMWXxc;;ccccc:;,;od;;
c';okkxdool;,'';d0NMMMMMMMMK:.,loddclk0kxl::;:odxdodkxlc:;;;',;;::cxOdodxxl;';;cdOK0ocoxdo:.,kWMMMMMMXxcd0KKKKK0Oxddo:'c
x,'ldc,'',',coc,:xKWMMMMMMMWk'.,ccc:lxxxkkkkkkdoodolkdllddxkdkxddolokolddd:,,,,,;coxxc:ll:..oNMMMMMMWOllOKKWMMMWKxdl;',x
Kc'cdc';od:;dxo;'lOXMMMMMMMKc,;:ldO0KXKK0Okxolc;:xx::dxkOxolllodOOxdc;oklc;';llc;,,,:;,::..,ckNNXK0kdlloooOWMMMNOdoc''cK
Wx,,ld;,co:',,'',cx0KKOkkkx:;ldxxxO0Okdoollloc;..lOx:;,;:,'....,::,,:oOd,.,cxkxxko:,,,'''',;,;looooool:;cokKKKX0xdl,.,kW
MXl';dl,'',;ccoddoooooodddo:;ldxxdooloodddldOko:,:oxxooooddddddddooodkdc;;cxOxldOOOxol:,'''',;;cdxxdoc,,;:::ldkkdo;''oXM
MM0:':doclodkkxolooddddddddc';coocokkkOOOklcxxox0KK0000000000000000000KK0kooxlcdOOOO0Kk:;c:;,,,,',,:loddc''',;coxo,'c0MM
MMWO;';cllllol,,oddddddooddoco0X0clKK000Okd::lokKX00OOOOOOOOOOOOOOOOOO0KKOdlc:lxO0000KxckNXK0Okdccc;;coo:,coc:,:dl,:OWMM
MMMWk;'clclo:;:lddoool:loloddoxKNk:d000K0Oko:;:oxOO0OOOOOOOOOOOOOOOOOOOOkdc;:lxO0KK0KkcdNMMMMWN0xl:::,''';okkxddc,;kWMMM
MMMMWkloo:;::lddodkkxo;;lollddolkX0lcx0KX0Okdc;,:ldxkOOOOOOOOOOOOOkkkxdoc;;:oxO0KX0klcxNMMMMWXOxc,';cooc;'';cxd:';kWMMMM
MMMMMWKd;,clloolxXWWX0d:,;cclddldXMNOolodkkxoc;;;,,,;:clooooooooolcc;,,,;,;:lxkkxolokXWMMMNXOdc;;cc;',coxdl:ldc,:OWMMMMM
MMMMMMW0c,;clolcdKWMWXOx:'';ldldKWMMMWXOxddoddo:;;;;'''''''....''''',,;;;;lxdodddkKWMMMMWXOdc,;;',cddc,',lxkd:,c0WMMMMMM
MMMMMMMMXo,';ldlcokK0xl;'',:dlcd0XNWMMMMMMWWMMXo',:;,;oxdoollloodxdc:lc,.;OMMWWMMMMMMWNKOdc,'ckko:',cxxl:cdl,,dXMMMMMMMM
MMMMMMMMMNk:',:lccodc,',loc:c;,;cdOKNWMMMMMMMMWk;;:;cOWMMMWWWWWWMMWKdlo:.lXMMMMMMMWNX0kl:::,';ccoko;',ckko:,:kNMMMMMMMMM
MMMMMMMMMMWKo,',:ol,';lxx:''cddc'':dkOKXNWWMMMM0l::dXMMMMMMMMMMMMMMMNOoc;xWMMMMWXKOkkkd:',ldc,,cdkx:';ldl,;oKWMMMMMMMMMM
MMMMMMMMMMMMWOl,,coooxkl,';lxkd:'';c:;cldk0XNNWXdlOWMMMMMMMMMMMMMMMMMWKdl0WMMMWKOd:;lxkx:''cxxdkxc,;lol;,l0WMMMMMMMMMMMM
MMMMMMMMMMMMMMNOc,;clxo,.,okxl,';oo;.,::,;:oxkkOkOXXNNWWWWWWWWWWWWNNXXKOxOKNMMMN0xc'':lc;,'':dxko:lol;,cONMMMMMMMMMMMMMM
MMMMMMMMMMMMMMMMNkc,':ooc;,:;'':xx;.,okxc'';c;,okkxooxOkxkkkkkkOOkdolcc::dOXMMMMWKkl,'';oxo;';okxdl;,lONMMMMMMMMMMMMMMMM
MMMMMMMMMMMMMMMMMMNOl;,:lol:,;okd;.,lkkl,.:dc',okxl''lxc;;;;;,,;l:'';clloxOXWMMMMWXOo;',oxxdlloo:,;oONMMMMMMMMMMMMMMMMMM
MMMMMMMMMMMMMMMMMMMMW0d:,,:lloxx:.':dko,.;xd,.,col;';dOkkkkxdc''lc''cddolldOXWMMWWX0kd:';dxolc;,cxKWMMMMMMMMMMMMMMMMMMMM
MMMMMMMMMMMMMMMMMMMMMMWXOo:''':ooc:;;;,.;dkc'':c:,''ckKNWWKkkc''dx;',;:;'.;d0XK0Okxddddool:,':oONMMMMMMMMMMMMMMMMMMMMMMM
MMMMMMMMMMMMMMMMMMMMMMMMMWXOo:,,;cllllccdkd;.:xkx:.,oOKXXX0kkc',okdddxxd:.'lkxddoolc:;;;,,:oOXWMMMMMMMMMMMMMMMMMMMMMMMMM
MMMMMMMMMMMMMMMMMMMMMMMMMMMMWX0xl;,,;:lllddlcdxkd,'cxkxolllll;.,okxo::;;,;:oxl::;,''',:lx0NWMMMMMMMMMMMMMMMMMMMMMMMMMMMM
MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWX0xoc;'',:cclclolldxkdccccc:ccldxxdlllllllc;''',;cox0XWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM
MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNX0kdoc:;,,,,;;;:cccccccccc:;:c:;,,,,;:codk0XNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM
MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWWNK0OkxddolllccccccccllloddxkO0KNWWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM
MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWWWNNNNNNNNWWWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM*/

package frc.robot;

import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.AnalogInput;
//import edu.wpi.first.wpilibj.SerialPort;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.networktables.*;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.SolenoidBase;
import java.util.concurrent.TimeUnit;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.Encoder;
import jaci.pathfinder.Pathfinder;
import jaci.pathfinder.Trajectory;
import jaci.pathfinder.Waypoint;
import jaci.pathfinder.modifiers.TankModifier;
import edu.wpi.first.wpilibj.ADXRS450_Gyro;


public class Robot extends TimedRobot {
  
  
  
/*
  public Robot DoubleSolenoid(int moduleNumber, int forwardChannel, int reverseChannel)
  {
    moduleNumber = 0;
    forwardChannel = 6;
    reverseChannel = 7;
  }
  */
  

  //cameraHandler camera;

  @Override
  public void robotInit() {
    
    CameraServer.getInstance().startAutomaticCapture();
  }

  @Override
  public void robotPeriodic() {
  }

  

//pcm 1   2 3 high gear 6 7 low gear 
//pcm 0   0 1 hatch grab 6 7 hatch extender 4 5 intake
  

  boolean gear;
  boolean isYPressed;

  XBoxController controller = new XBoxController(0);
  LogitechExtreme3DPro operatorController = new LogitechExtreme3DPro(1);
  

  Spark right_front = new Spark(0);
  Spark right_rear = new Spark(1);
  Spark left_front = new Spark(2);
  Spark left_rear = new Spark(3);

  Spark elevator_1 = new Spark(4);
  Spark elevator_2 = new Spark(5);
  Spark elevator_3 = new Spark(6);
  Spark elevator_4 = new Spark(7);

  //Spark intakeRotator1 = new Spark(9); ////Re-Enter Actual Value Because This Is A Place Holder Value
  //Spark intakeRotator2 = new Spark(8); ////Re-Enter Actual Value Because This Is A Place Holder Value

  Spark intake = new Spark(8);// Re-Enter Actual Value Because This Is A Place Holder Value
  Spark fly_wheel = new Spark(9);
  //ADXRS450_Gyro gyro;

 // Victor left_lift = new Victor(0);
 // Victor right_lift = new Victor(1);
  Compressor compressor = new Compressor(0);
 // DigitalInput bottom_limit_switch = new DigitalInput(4);
  AnalogInput sensor = new AnalogInput(0);
  Encoder encoder_left = new Encoder(1, 0, true);
  Encoder encoder_right = new Encoder(3, 2, true);
  DigitalInput up_switch = new DigitalInput(4);
  DigitalInput down_switch = new DigitalInput(6);


  SpeedControllerGroup right = new SpeedControllerGroup(right_front, right_rear);
  SpeedControllerGroup left = new SpeedControllerGroup(left_front, left_rear);
  SpeedControllerGroup elevator = new SpeedControllerGroup(elevator_1, elevator_2, elevator_3, elevator_4);
  DoubleSolenoid gearController = new DoubleSolenoid(1, 2, 3);
  DoubleSolenoid elevatorController = new DoubleSolenoid(1, 6, 7);
  DoubleSolenoid hatchGrab = new DoubleSolenoid(0, 0, 1);
  DoubleSolenoid hatchExtender = new DoubleSolenoid(0, 6, 7);
  DoubleSolenoid cargoArm = new DoubleSolenoid(0, 4, 5);
  //ADXRS450_Gyro gyro = new ADXRS450_Gyro();
//	gyro.calibrate();


  DifferentialDrive myRobot = new DifferentialDrive(left, right);
  
  


  @Override
  public void autonomousInit() {
    
  }

  @Override
  public void autonomousPeriodic() {

    teleopPeriodic();
  }
    

  @Override
  public void teleopPeriodic() {
    compressor.setClosedLoopControl(true);
    NetworkTableInstance.getDefault().getTable("limelight").getEntry("ledMode").setNumber(1);
    NetworkTableInstance.getDefault().getTable("limelight").getEntry("camMode").setNumber(1);
   /*
   pathfinder should replace the current tank drive
   */ 
    double stickLeftY = controller.getLeftThumbstickY();
    double stickRightY = controller.getRightThumbstickY();

  
   
    //stickLeftY = (stickLeftY)*1.0;
    //stickRightY = (stickRightY)*1.0;
    myRobot.tankDrive(stickLeftY, stickRightY);
    //System.out.println("JR:" + stickLeftY + "JL" + stickRightY + "| GBR" + right.get() + "GBL:" + left.get());
    // System.out.println("Right motor speed is: " + right.get());
    // System.out.println("Left motor speed is: " + left.get());
    
    
    //the following is the pathfinder code, heavily untested.
    /*
    Waypoint[] points = new Waypoint[] {
      new Waypoint(-4, -1, 0),
      new Waypoint(-2, -2, 0),
      new Waypoint(0, 0, 0)
    };
    Trajectory.Config config = new Trajectory.Config(Trajectory.FitMethod.HERMITE_CUBIC, Trajectory.Config.SAMPLES_HIGH, 0.05, 1.4, 2.0, 60.0);
    Trajectory trajectory = Pathfinder.generate(points, config);
    TankModifier modifier = newTankModifier(trajectory).modify(0.0);  //put meter value here
    EncoderFollower left = new EncoderFollower(modifier.getLeftTrajectory());
    EncoderFollower right = new EncoderFollower(modifier.getRightTrajectory());

    left.configureEncoder(a, b, c);  //a=current position of encoder, b=# of encoder ticks per rev(int), c=wheel diameter of wheels in meters
    right.configureEncoder(a, b, c);

    left.configurePIDVA(a, b, c, d, e); //a=p, b=i, c=d, d=velocity ratio, e=acceleration gain, for more detail check pathfinder java wiki
    right.configurePIDVA(a, b, c, d, e);

    double left_calculation = left.calculate(a);  //a=left encoder position
    double right_calculation = right.calculate(b);  //b=right encoder position

    double gyro_heading = //gyro codes here, in degrees
    double desired_heading = Pathfinder.r2d(left.getHeading()); //in degrees 

    double angleDifference = Pathfinder.boundHalfDegrees(desired_heading - gyro_heading);
    angleDifference = angleDifference % 360.0;
    if (Math.abs(angleDifference) > 180.0) {
      angleDIff = (angleDifference > 0) ? angleDifference - 360 : angleDiff + 360;
    }

    double turn = 0.8 * (-1.0/80.0) * angleDifference;

    myRobot.tankDrive(left_calculation + turn, right_calculation - turn);
    */
    
   /* 
    //limit swtich for hatch
    if(up_switch.get() == true && down_switch.get() == true)
    {
      hatchGrab.set(DoubleSolenoid.Value.kReverse);
    }
    
    
    
    
    if (controller.getAButton() == true) {
      System.out.println("Left encoder value " + encoder_left.get());
      System.out.println("Right encoder value " + encoder_right.get());
    }
   */
   //Elevator code 
    
    double joystickY = operatorController.getJoystickY();
    if (Math.abs(joystickY) > 0.1){
      if (joystickY < -0.1) {
        //System.out.println("Should go up");
        elevatorController.set(DoubleSolenoid.Value.kReverse);
        
        elevator.set(joystickY);
      } else if (joystickY > 0.1) {
        //System.out.println("Should go down");
        elevatorController.set(DoubleSolenoid.Value.kReverse);
        elevator.set(joystickY);
      } 
      }
      else {
        elevator.set(0.0);
        elevatorController.set(DoubleSolenoid.Value.kForward);
     /*if (elevatorController.get() == DoubleSolenoid.Value.kReverse){
        System.out.println("UNLOCKING ELEVATOR");
        elevatorController.set(DoubleSolenoid.Value.kForward);
      }
        if (elevatorController.get() == DoubleSolenoid.Value.kForward){
        System.out.println("LOCKING ELEVATOR SOLENOID");
        elevatorController.set(DoubleSolenoid.Value.kReverse);
      }*/
      
    }
    
      /*
      System.out.println("Switching from hatch to cargo position");
      if (operatorController.getButtonThree()){
        elevator.set(-0.25);
        Timer.delay(0.7);
        elevator.set(0.0);
      }
  
      if (operatorController.getButtonFive()){
          elevator.set(-0.39);
          Timer.delay(0.7);
          elevator.set(0.0);
        
      } else if (operatorController.getButtonFour()){
        elevator.set(-0.66);
        Timer.delay(0.7);
        elevator.set(0.0);
      }
        */
    
      //Rocket cargo
      if (operatorController.getButtonThree()){
        System.out.println("Button 3");
        elevatorController.set(DoubleSolenoid.Value.kReverse);
        Timer.delay(0.1);
        elevator.set(-0.9);
        Timer.delay(0.4);
        elevator.set(0.0);
      }
      //cargo ship
      if (operatorController.getButtonFive()){
          elevatorController.set(DoubleSolenoid.Value.kReverse);
          Timer.delay(0.1);
          elevator.set(-0.7);
          Timer.delay(0.55);
          elevator.set(0.0);
     }
          
       //hatch 
       else if (operatorController.getButtonFour()){
        elevatorController.set(DoubleSolenoid.Value.kReverse);
        Timer.delay(0.1);
        elevator.set(-0.9);
        Timer.delay(0.45);
        elevator.set(0.0);
      }
      /*
      if(operatorController.getButtonTwo())
      {
       // elevatorController.set(DoubleSolenoid.Value.kReverse);
       hatchGrab.set(DoubleSolenoid.Value.kForward);
        Timer.delay(0.1);
        //elevator.set(-0.6);
        hatchExtender.set(DoubleSolenoid.Value.kReverse);
       // Timer.delay(0.03);
      }
      */
    
   
    //System.out.println("Limit switch is after this");
    if (operatorController.getButtonOne() == true){ //&& bottom_limit_switch.get() == true){
      System.out.println("THis is false");
      elevator.set(0.1);
     // elevatorController.set(DoubleSolenoid.Value.kReverse);
      elevatorController.set(DoubleSolenoid.Value.kReverse);   //not sure if positive is going up or down, needs testing
    }

  // System.out.println("Elevator Motor:" + elevator.get());
    /*else if (operatorController.getButtonOne() == false){ //&& bottom_limit_switch.get() == false){
      System.out.println("Tis is true");
      //elevatorController.set(DoubleSolenoid.Value.kForward);
      //elevator.set(0.0);
      elevatorController.set(DoubleSolenoid.Value.kReverse);
    }
    */

    
  if (controller.getAButton() == true)  {
    double sensor_distance = sensor.getVoltage() * 1.024;
    System.out.println(sensor_distance);
  }
  
    //vision code
    if (controller.getYButton() == true){
    //rotate 90 degrees right, positive y axis is right side
    //rotate 90 degrees left, positive y axis is left side.
    //in theory, during tracking, if horizontalOffset > positiveTolerance, then it turns accordingly to left or right
    //if positive y axis is pointing to right, then it should turn left to calibrate, vice versa for pointing to left.
    //therefore, we NEED the rotation, because it matters a lot.
    

      double vision_target = NetworkTableInstance.getDefault().getTable("limelight").getEntry("tv").getDouble(0.0);
      double horizontalOffset = NetworkTableInstance.getDefault().getTable("limelight").getEntry("ty").getDouble(0.0);	//positive means target is on the right side of the fov, negative is left side
  
      NetworkTableInstance.getDefault().getTable("limelight").getEntry("ledMode").setNumber(3);
      NetworkTableInstance.getDefault().getTable("limelight").getEntry("camMode").setNumber(0);
      System.out.println(horizontalOffset);
  
  int positiveTolerance = 12;
  int negativeTolerance = 9;
  // turn was 55 move speed was 50
  double turn_speed = 0.3;
  double move_speed = 0.2;
  double test_turn_speed = 0.4;
  double test_move_speed = 0.7;
  double min_distance_from_wall = 30.0; // Minimum distance from the wall, set actual value here
  double min_distance_from_wall_meters = min_distance_from_wall / 39.37; //min distance but in meters
//  double min_distance_from_wall_meters = 2.0;    //   direct input
//Robot should calibrate itself when it is 40 meters (for now) close to the reflective tape  
  
  
      if (vision_target == 1){
          
          System.out.println("Target found at " + horizontalOffset + " degrees away from the center crosshair");
  
      
          //test section, turning while moving forward, sensor using meters
          
              while (controller.getYButton() == true){
                  
                  
                  double sensor_distance = sensor.getVoltage() * 1.024;
                  System.out.println("Should be " + sensor_distance + "meters away");
                  
                  if (sensor_distance > min_distance_from_wall_meters){
                      if (horizontalOffset < positiveTolerance){
  
                          System.out.println("Turning left to compensate");
                          test_turn_speed = 0.9;
                          myRobot.tankDrive(-test_turn_speed, -test_move_speed);
              
  
                      } else if (horizontalOffset > negativeTolerance) {
  
                          System.out.println("Turning right to compensate");
                          test_turn_speed = 0.9;
                          myRobot.tankDrive(test_move_speed, -test_turn_speed);
                          
  
                      } else {
  
                          System.out.println("Aligned with target");
                          System.out.println("Autonomously moving to target " + sensor_distance + " meters away. . . RELEASE BUTTON to REGAIN CONTROL");
                          myRobot.tankDrive(test_move_speed, test_move_speed);
                      }    
  
                     
  
                  } else {
                      System.out.println("Should be at goal position - stopping autonomous control");
                      System.out.println("Distance: " + sensor_distance);
                      break;
                  }
          
                  Timer.delay(0.02);
                }
              }
            }
          

    

    //intake/cargo
    if (operatorController.getButtonEleven() == true) {
      intake.set(-0.9);
      
      
 }  else if (operatorController.getButtonTwelve() == true) {
      intake.set(0.9);

    } else {
      intake.set(0.0);
    }
    
    
    
  /*  
    if (operatorController.getButtonEight() == true) {
     /* hatchGrab.set(DoubleSolenoid.Value.kForward);
      Timer.delay(0.5);
      hatchExtender.set(DoubleSolenoid.Value.kForward);
      Timer.delay(0.5);
      hatchExtender.set(DoubleSolenoid.Value.kReverse);

      hatchGrab.set(DoubleSolenoid.Value.kForward);
      Timer.delay(0.2);
      hatchExtender.set(DoubleSolenoid.Value.kForward);
      Timer.delay(0.2);
      hatchExtender.set(DoubleSolenoid.Value.kReverse);
      Timer.delay(0.2);
      hatchExtender.set(DoubleSolenoid.Value.kForward);
     // cargoArm.set(DoubleSolenoid.Value.kForward);
      Timer.delay(0.5);
      hatchGrab.set(DoubleSolenoid.Value.kForward);
      Timer.delay(0.25);
     // cargoArm.set(DoubleSolenoid.Value.kForward);
     // Timer.delay(0.25);
     // hatchExtender.set(DoubleSolenoid.Value.kReverse);
     // Timer.delay(0.125);
     // cargoArm.set(DoubleSolenoid.Value.kReverse);
      
      
    } 
    else if (operatorController.getButtonSeven() == true) {
      hatchExtender.set(DoubleSolenoid.Value.kForward);
     // cargoArm.set(DoubleSolenoid.Value.kForward);
      Timer.delay(0.5);
      hatchGrab.set(DoubleSolenoid.Value.kReverse);
     // Timer.delay(0.25);
     // hatchExtender.set(DoubleSolenoid.Value.kReverse);
     // cargoArm.set(DoubleSolenoid.Value.kReverse);
      
    } 
   
    else if(operatorController.getButtonSix() == true)
    {
      hatchGrab.set(DoubleSolenoid.Value.kReverse);
      Timer.delay(0.15);
      hatchExtender.set(DoubleSolenoid.Value.kForward);
    }
    /*else {
      hatchExtender.set(DoubleSolenoid.Value.kForward);
      //hatchGrab.set(DoubleSolenoid.Value.kForward);
    }
    */
       
    //High and low gear controllers.
    if (controller.getLeftTrigger() == true) {

      gearController.set(DoubleSolenoid.Value.kReverse);
      System.out.println("Tanzina Zahan Piston out");

    } else if (controller.getRightTrigger() == true) {

      gearController.set(DoubleSolenoid.Value.kForward);
      System.out.println("Nazifa 5599 Prapti Piston In");

    }
    if(controller.getBButton() == true)
    {
      left.set(-0.8);
      right.set(0.0);
    }
    if(controller.getXButton() == true)
    {
      right.set(0.8);
      left.set(0.0);
    }
    

    
    if (operatorController.getButtonNine() == true ) {//&& cargoArm.get() == Value.kForward) {
      cargoArm.set(DoubleSolenoid.Value.kForward);
      System.out.println("This is moving it up");
      
    } else if (operatorController.getButtonTen() == true) {// && cargoArm.get() == Value.kReverse) {
      cargoArm.set(DoubleSolenoid.Value.kReverse);
      System.out.println("this is moving it down ");
     
    } 
  } 
  }
  
  
   



  
  
