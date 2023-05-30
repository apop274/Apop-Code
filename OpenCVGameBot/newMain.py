import cv2
from PIL import ImageGrab
import numpy as np
from PIL.Image import NONE
import pyautogui

top_leftx = 620
top_lefty = 120
bottom_rightx = 1300
bottom_righty = 650

x, y = pyautogui.position()

def grabScreen(bbox = None):
 img = ImageGrab.grab(bbox = bbox)
 img = np.array(img)
 img = cv2.cvtColor(img, cv2.COLOR_RGB2BGR)
 return img

while 1:
 pyautogui.click(x, y)
 
while 1:
 img = grabScreen(bbox=(top_leftx, top_lefty, bottom_rightx, bottom_righty))

 cv2.imshow('Screen', img)

 if cv2.waitKey(1) == ord('q'):
  break
