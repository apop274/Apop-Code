#include <AFMotor.h>
#define dc_mot_forward 2
#define dc_mot_backward 3


void setup() {
  pinMode(dc_mot_forward, OUTPUT);
  pinMode(dc_mot_backward, OUTPUT);

}

void loop() {
  
 digitalWrite(dc_mot_forward, HIGH);
 //delay(1000);

 //digitalWrite(dc_mot_backward, HIGH);
 //delay(1000);

}
