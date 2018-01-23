PImage creeper;

void setup() {
  size(1280, 800);
  PImage minecraft = loadImage("Forest.jpg");     //in setup method
  minecraft.resize(width, height);     //in setup method
  background(minecraft);     //in setup method
  creeper=loadImage("Creeper.png");
  creeper.resize(10, 10);
  
}

void draw() {
  image(creeper, mouseX, mouseY);
  
  
  
}