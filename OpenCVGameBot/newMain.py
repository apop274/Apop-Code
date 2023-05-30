import cv2
from PIL import ImageGrab
import numpy as np
from PIL.Image import NONE

top_leftx = 360
top_lefty = 85
bottom_rightx = 575
bottom_righty = 210

def grabScreen(bbox = None):
 img = ImageGrab.grab(bbox = bbox)
 img = np.array(img)
 img = cv2.cvtColor(img, cv2.COLOR_RGB2BGR)
 return img

while 1:
 img = grabScreen(bbox=(top_leftx, top_lefty, bottom_rightx, bottom_righty))

 cv2.imshow('Screen', img)

 if cv2.waitKey(1) == ord('q'):
  break
