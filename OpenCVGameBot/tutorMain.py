import cv2
from PIL import ImageGrab
import numpy as np
from PIL.Image import NONE

from tutorCore import Object, grabScreen

knifeAvoid1 = Object('Objects/openSpace.png')
knifeAvoid1_index = 0

top_leftx = 360
top_lefty = 85
bottom_rightx = 575
bottom_righty = 210

while True:
 img = grabScreen(bbox=(top_leftx, top_lefty, bottom_rightx, bottom_righty))

 cv2.imshow('Screen', img)

 if cv2.waitKey(1) == ord('q'):
  break
 