/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import vistas.MP3;

/**
 *
 * @author Miguel
 */
public class TestMP3 {
    public static void main(String[] args) {
        MP3 reproductorMP3 = new MP3("C:\\Users\\usuario\\Desktop\\Alan Walker - Air.mp3");
        reproductorMP3.play();
    }
}
