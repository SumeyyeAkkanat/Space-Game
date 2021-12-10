package space.robot;

import java.util.Random;
import space.Objects;
import space.Alien;

import space.Shot;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Cengiz
 */
public class Robot {

    public int globalHamle;
    public static int hStatus;

    public void act(Objects board) {
        if (board.aliens.size() == 0) {
            return;
        }
        
        /***
         * BURADA globalHamle belirlenecek
         * ornek olarak 100/shot set edilmis
         * 0 hareket etme
         * >0  saga  6 saga 6 pixel git
         * <0 sola
         */
            
        globalHamle = 100;

    }

}
