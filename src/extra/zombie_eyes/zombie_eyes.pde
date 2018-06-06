
void setup(){
size(500,500);
  PImage face = loadImage("cat with big eyes.jpg");
image(face,0,0);
face.resize(500,500);
}

void draw(){
 fill(255,0,0);

 ellipse(300,285,65,65); 
fill(255,0,0);
ellipse(140,300,65,65);
fill(0,0,0);
ellipse(140,300,30,30);
ellipse(300,285,30,30);
if(mouseX > 0){
fill(255,134,45);
ellipse(140,300,65,65);
 ellipse(300,285,65,65); 
if(mouseY> 0){
fill(255,24,23);
ellipse(140,300,65,65);
 ellipse(300,285,65,65);
}
}
}
