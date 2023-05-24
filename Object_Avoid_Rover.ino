#include <AFMotor.h>
#include <Servo.h>

Servo servo1;

AF_DCMotor m1(1);
AF_DCMotor m2(2);
AF_DCMotor m3(3);
AF_DCMotor m4(4);


int trigPin = A0;
int echoPin = A1;
int time;
int value;
int angle = 0;

void setup() {
  
  pinMode(trigPin, OUTPUT);
  pinMode(echoPin, INPUT);

  servo1.attach(10);
  servo1.write(angle);


}

void loop() {

  m1.setSpeed(150);
  m2.setSpeed(150);
  m3.setSpeed(150);
  m4.setSpeed(150);

  m1.run(FORWARD);
  m2.run(FORWARD);
  m3.run(FORWARD);
  m4.run(FORWARD);

  digitalWrite(trigPin, LOW); //clears trigpin
  delayMicroseconds(2);

  digitalWrite(trigPin, HIGH); // sends signal
  delayMicroseconds(30);
  digitalWrite(trigPin, LOW);

  time = pulseIn(echoPin, HIGH); // reads return signal

  value = time * 0.0343/2;   // speed of sound = 343 m/s

   if(value <= 20 && value != 0){ 

      m2.run(RELEASE);
      m1.run(RELEASE);
      m3.run(RELEASE);
      m4.run(RELEASE);
      delay(1500);

      m1.run(BACKWARD);
      m2.run(BACKWARD);
      m3.run(BACKWARD);
      m4.run(BACKWARD);
      delay(1500);

      for(angle = 0; angle < 180; angle++){
        servo1.write(angle);
        delay(2);

      }

      for(angle = 180; angle > 0; angle--){
        servo1.write(angle);
        delay(2);
        
      }

      m1.run(RELEASE);
      m2.run(RELEASE);
      m3.run(RELEASE);
      m4.run(RELEASE);

      m1.run(FORWARD);
      m3.run(BACKWARD);
      m4.run(FORWARD);
      m2.run(BACKWARD);
      delay(2300);
      

   }
}
