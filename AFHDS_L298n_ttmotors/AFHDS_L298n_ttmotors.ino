#define ch1Pin 11
#define ch2Pin 12
 
int ch1;
int ch2;

int rightFor = 2;
int rightBack = 3;
int leftFor = 4;
int leftBack = 5;



void setup() {
  
  pinMode(11, INPUT);
  pinMode(12, INPUT);

  pinMode(rightFor, OUTPUT);
  pinMode(rightBack, OUTPUT);
  pinMode(leftFor, OUTPUT);
  pinMode(leftBack, OUTPUT);



}


void loop() {
 ch1 = pulseIn(11, HIGH);
 ch2 = pulseIn(12, HIGH);

 if((ch1==0)&&(ch2==0))
{     
 digitalWrite(rightFor,LOW); digitalWrite(rightBack,LOW);
 digitalWrite(leftFor,LOW);digitalWrite(leftBack,LOW);
}

else if((ch1>1530)&&(ch2>1530)) //ch1 = left and ch2 = up (forward left)
{     
digitalWrite(leftFor,LOW); digitalWrite(leftBack,HIGH);
 digitalWrite(rightFor, HIGH);digitalWrite(rightBack,LOW);    
}

else if((ch1>1530)&&(ch2<1460)) //ch1 = left and ch2 = down (backward left)
{ 
   digitalWrite(rightBack,HIGH); digitalWrite(rightFor,LOW);
 digitalWrite(leftFor,HIGH);digitalWrite(leftBack,LOW);    

}

else if((ch1<1460)&&(ch2>1530)) //ch1 = right and ch2 = up (forward right)
{     
  digitalWrite(rightFor,LOW); digitalWrite(rightBack,HIGH);
 digitalWrite(leftBack,LOW);digitalWrite(leftFor,HIGH);
}

else if((ch1<1460)&&(ch2<1460)) //ch1 = right and ch2 = down (backward right)
{  
  digitalWrite(rightBack,LOW); digitalWrite(rightFor,HIGH);
 digitalWrite(leftBack,HIGH);digitalWrite(leftFor,LOW);
  

}
else if(ch1 > 1460 && ch1 < 1560 && ch2 > 1530){
  digitalWrite(rightFor, HIGH); digitalWrite(rightBack, LOW);
  digitalWrite(leftFor, HIGH); digitalWrite(leftBack, LOW);
}

else
{     
 digitalWrite(rightBack,LOW); digitalWrite(rightFor,LOW);
 digitalWrite(leftBack,LOW);digitalWrite(leftFor,LOW);
}


}
