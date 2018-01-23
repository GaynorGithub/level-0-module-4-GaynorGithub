

PImage donkey;
PImage tail; 
boolean isPinned = false;
int xMouse = 0;
int yMouse = 0;
import ddf.minim.*;     //at the very top of your sketch
AudioSample sound1;

void setup() {
  size(660, 440);
  donkey = loadImage("DONKAY.jpeg");     //in setup method
  background(0);     //in setup method
  tail = loadImage("tail.png");     //in setup method
  tail.resize(150, 150);
  Minim minim = new Minim(this);     //in the setup method  
  doh = minim.loadSample("/Users/League/Google Drive/league-sounds/homer-doh.wav");
  woohoo = minim.loadSample("/Users/League/Google Drive/league-sounds/homer-woohoo.wav");
}

void draw() {

  if (isPinned) {
    background(donkey);
    image(tail, xMouse-10, yMouse-20);
  } else {
    fill(256, 256, 256);

    rect(10, 10, 25, 25);
    if (mouseX >= 0 && mouseY >= 0 && mouseX <= 40 && mouseY <= 40) {
      background(donkey);
    } else {
      background(0);
      textSize(23);
      text("Put your cursor in the top left corner to see the donkey",20,20);
      text("Pin the tail to win!",20,40);
    }
    if (mousePressed && mouseX >= 95 && mouseY >= 182 && mouseX <= 144 && mouseY <= 234) {
      isPinned = true;
      playWoohoo();
      xMouse = mouseX;
      yMouse = mouseY;
    }
    else if (mousePressed) {
      playDoh();
    }
  }
  
  
  
}
void playWoohoo() {

    woohoo.stop();
    woohoo.trigger();
  }

  void playDoh() {

    doh.stop();
    doh.trigger();
  }

  import ddf.minim.*;
  Minim minim = new Minim(this); 
  AudioSample woohoo;
  AudioSample doh;