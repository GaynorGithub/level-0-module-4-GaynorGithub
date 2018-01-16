PImage donkey;
PImage tail; 

void setup() {
  size(660, 440);
  donkey = loadImage("DONKAY.jpeg");     //in setup method
  background(donkey);     //in setup method
  tail = loadImage("tail.png");     //in setup method
  tail.resize(150, 150);
}

void draw() {
  if(mousePressed) {
    image(tail, mouseX-10, mouseY-20);     //in draw method
  }
  
}