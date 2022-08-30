package Teste;
import robocode.*;
//import java.awt.Color;

// API help : https://robocode.sourceforge.io/docs/robocode/robocode/Robot.html

/**
 * Teste - a robot by (your name here)
 */
public class Teste extends Robot
{
	/**
	 * run: Teste's default behavior
	 */
	public void run() {
		// Initialization of the robot should be put here

		// After trying out your robot, try uncommenting the import at the top,
		// and the next line:

		//setColors(Color.red,Color.blue,Color.green); // body,gun,radar

		// Robot main loop
		while(true) {
			// Replace the next 4 lines with any behavior you would like
			double distance = Math.random()*100;
            double angle = Math.random()*60;
            turnRight(angle);
            ahead(distance);
            ahead(100);
            turnGunRight(90);
            back(100);
            turnGunRight(90);
		}
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	public void onScannedRobot(ScannedRobotEvent e) {
		// Replace the next line with any behavior you would like
		double distance = e.getDistance();

        if(distance<200)
        {
           fire(3.5);
        }
        else if(distance<500)
        {
           fire(2.5);
        }
        else if(distance<800)
        {
           fire(1.5);
        }
        else
        {
           fire(0.5);
        }
	}

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	public void onHitByBullet(HitByBulletEvent e) {
		// Replace the next line with any behavior you would like
		back(10);
	}
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall(HitWallEvent e) {
		// Replace the next line with any behavior you would like
		back(20);
	}	
}
