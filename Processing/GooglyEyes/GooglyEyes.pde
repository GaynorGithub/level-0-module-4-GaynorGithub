void setup() {
  size(600, 400);
}

  int xEye = 200;
  int yEye = 200;

void draw() {

  fill(255,255,255); 
  ellipse(200, 200, 100, 70);
  ellipse(400, 200, 100, 70);
  fill(0,0,0);
  if(mouseX > 177 && mouseX < 222) {
   xEye = mouseX;
  }
  else {
   if(mouseX < 177) {
     xEye = 177;
   }
   if(mouseX > 222) {
     xEye = 222;
   }
  }
  if(mouseY > 185 && mouseY < 215) {
   yEye = mouseY;
  }
  else {
   if(mouseY < 185) {
     yEye = 185;
   }
   if(mouseX > 215) {
     xEye = 215;
   }
  }
  ellipse(xEye + 200, yEye, 30, 30);
  ellipse(xEye, yEye, 30, 30);
  
  
    
  

}