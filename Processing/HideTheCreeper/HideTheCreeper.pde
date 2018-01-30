PImage creeper;
float r = random(1280);
int x = int(r);
float t = random(800);
int y = int(t);
int creeperX = x;
int creeperY = y;

void setup() {
  size(1280, 800);
  PImage minecraft = loadImage("Forest.jpg");     //in setup method
  minecraft.resize(width, height);     //in setup method
  background(minecraft);     //in setup method
  creeper=loadImage("Creeper.png");
  creeper.resize(10, 10);
}

boolean isNear(int a, int b) {
  if (abs(a - b) < 20)
    return true;
  else
    return false;
}

void draw() {

  image(creeper, creeperX, creeperY);
  if (isNear(mouseX, creeperX) && isNear(mouseY, creeperY)) {
    fill(0, 256, 0);
  } else {
    fill(256, 0, 0);
  }
  if (mousePressed) {
    ellipse(mouseX-3, mouseY-3, 30, 30);
  }
  if (isNear(mouseX, creeperX) && isNear(mouseY, creeperY)) {
    fill(256, 256, 256);
    textSize(61);
    text("YOU FOUND THE CREEPER!!!", 200, 400);
  }
}