
public class Ppizza {

}
int pepx;
int pepy;
import ddf.minim.*;
Minim minim; 
AudioPlayer sound; 
void setup(){
  size(500,500);
minim = new Minim(this);
sound = minim.loadFile("sound.wav");
}

void draw(){
fill(222,184,135);
ellipse(250,250,350,350);
fill(220,0,0);
ellipse(250,250,320,320);
fill(255,255,0); 
ellipse(250,250,300,300);
PImage pepperoni = loadImage("peperoni.jpg");
pepperoni.resize(25,25);
image(pepperoni, 250, 250);
PImage mushroom = loadImage("mushroom.jpeg"); 
mushroom.resize(25,25);
image(mushroom, 265,365);
if (mousePressed){
pepx=mouseX;
pepy=mouseY;
sound.play();
sound.rewind();
}
  image(pepperoni, pepx, pepy);
}