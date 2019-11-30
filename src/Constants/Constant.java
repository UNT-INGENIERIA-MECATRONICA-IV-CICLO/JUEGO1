
package Constants;

/**
 * ALBERGA TODAS LAS CONSTANTES PRIMITIVAS
 * @author Willy Bazan
 * @date   23/11/2019
 * @time   03:26 pm
 */
public class Constant 
{
    //Frame dimensiones
    public static final int WIDTH = 1200, HEIGHT = 600;
    
    //Player properties
    public static final int FIRERATE = 150 ; //Velocidad de disparo 300
    public static final double ACC = 0.2; //0.2//Velocidad de movimiento
    public static final double DELTAANGLE = 0.04; //Angulo de rotacion
    public static final double PLAYER_MAX_VEL = 10; //Velocidad maxima de desplazamiento

    //Laser properties
    public static final double LASER_VEL = 15;
    
    //Meteors properties
    public static final double METEOR_VEL = 5;
    
    //Ufo properties
    public static final int NODE_RADIUS = 100;
    public static final double UFO_FORCE_MASS = 0.009;
    public static final int UFO_MAX_VEL = 3;
    public static final double UFO_TURN_ANGLE = 0.08;
    public static final int UFO_FIRE_RATE = 1000;
    public static final double UFO_ANGLE_RANGE = Math.PI/2;
}